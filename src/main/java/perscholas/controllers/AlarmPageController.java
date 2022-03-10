package perscholas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class AlarmPageController {

    @Autowired
    private MedicineTimeDAO medicineTimeDAO;

    @RequestMapping(value = "/alarmPage", method = RequestMethod.GET)
    public ModelAndView alarmPage(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        List<MedicineTime> medicineTimes = medicineTimeDAO.findAll();
        response.addObject("medicines", medicineTimes);

//        System.out.println(medicineTimes.get(0).toString());

        response.setViewName("alarmPage");
        return response;
    }
}
