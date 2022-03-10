package perscholas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import perscholas.database.dao.MedicineDAO;
import perscholas.database.dao.MedicineTimeDAO;
import perscholas.database.entities.Medicine;
import perscholas.database.entities.MedicineTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AddAlarmController {

    @Autowired
    private MedicineDAO medicineDAO;

    @Autowired
    private MedicineTimeDAO medicineTimeDAO;

    @RequestMapping(value = "/addAlarm", method = RequestMethod.GET)
    public ModelAndView addAlarm(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        List<Medicine> medicines = medicineDAO.findAll();
        response.addObject("medicines", medicines);

        response.setViewName("addAlarm");
        return response;
    }

    @RequestMapping(value = "/addTime/{id}", method = RequestMethod.GET)
    public ModelAndView addTimeId(HttpServletRequest request, HttpSession session ,
                                @PathVariable("id") Integer id) throws Exception {

        ModelAndView response = new ModelAndView();
        response.setViewName("/addTime");

        Medicine med = medicineDAO.findById(id);
        String medBrandName = med.getBrandName();
        String medTimeframe = med.getTimeframe();



        response.addObject("medBrandName" , medBrandName);
        response.addObject("medTimeFrame" , medTimeframe);

        return response;
    }

    @RequestMapping(value = "/addTimeSuccess", method = RequestMethod.GET)
    public ModelAndView addTimeSuccess(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        MedicineTime medicineTime = new MedicineTime();
        medicineTime.setBrandName("Synthroid");
        medicineTime.setMedicineName("Levothroxine");
        medicineTime.setDosage("50 mcg");
        medicineTime.setDailyDose("1");
        medicineTime.setTimeframe("Take at any time");
        medicineTime.setTimestamp("9:00 AM");

        medicineTimeDAO.save(medicineTime);

        response.setViewName("redirect:/alarmPage");

        return response;
    }

    @RequestMapping(value = "/deleteAlarm/{id}", method = RequestMethod.GET)
    public ModelAndView deleteAlarm(HttpServletRequest request, HttpSession session ,
                                  @PathVariable("id") Integer id) throws Exception {


        ModelAndView response = new ModelAndView();

        MedicineTime medicineTime = medicineTimeDAO.getById(id);

        medicineTimeDAO.delete(medicineTime);

        response.setViewName("redirect:/alarmPage");

        return response;
    }
}
