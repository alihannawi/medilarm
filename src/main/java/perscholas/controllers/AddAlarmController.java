package perscholas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AddAlarmController {

    @RequestMapping(value = "/addAlarm", method = RequestMethod.GET)
    public ModelAndView addAlarm(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        response.setViewName("addAlarm");
        return response;
    }
}
