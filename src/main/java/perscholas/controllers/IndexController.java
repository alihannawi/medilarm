package perscholas.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, HttpSession session) throws Exception {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        ModelAndView response = new ModelAndView();

        if (authentication == null) {

            response.setViewName("/index");
        } else {

            String username = authentication.getName();
            response.addObject("username" , username);
            response.setViewName("redirect:/userIndex");
        }

        return response;
    }

    @RequestMapping(value = "/userIndex", method = RequestMethod.GET)
    public ModelAndView userIndex(HttpServletRequest request, HttpSession session) throws Exception {

//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//        String email = request.getParameter("email");
//        String phoneNum = request.getParameter("phoneNum");
//        String password = request.getParameter("password");
//
//        session.setAttribute("firstName" , firstName);
//        session.setAttribute("lastName" , lastName);
//        session.setAttribute("email" , email);
//        session.setAttribute("phoneNum" , phoneNum);
//        session.setAttribute("password" , password);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        ModelAndView response = new ModelAndView();

        String username = authentication.getName();
        response.addObject("username" , username);

        response.setViewName("userIndex");

        return response;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        response.setViewName("index");

        return response;
    }
}
