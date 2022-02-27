package perscholas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

    @RequestMapping(value = {"/signup"} , method = RequestMethod.GET)
    public ModelAndView index() throws Exception {

        ModelAndView response = new ModelAndView();
        response.setViewName("signup");

        return response;
    }
}