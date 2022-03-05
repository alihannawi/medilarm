package perscholas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();
        response.setViewName("login");

        return response;
    }

//    @RequestMapping(value = "/logoutSuccess", method = RequestMethod.GET)
//    public ModelAndView logoutSuccess(HttpServletRequest request, HttpSession session) throws Exception {
//
//        ModelAndView response = new ModelAndView();
//        response.setViewName("/logoutSuccess");
//        return response;
//    }
}
