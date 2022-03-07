package perscholas.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private static String SESSION_KEY = "usernameSessionKey";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        String email = (String) session.getAttribute(SESSION_KEY);

        if (StringUtils.equals(email , "ahannawi72@gmail.com"))
            response.setViewName("redirect:/success");
        else
            response.setViewName("login");

        return response;
    }

    @RequestMapping(value = "/loginSubmit", method = RequestMethod.GET)
    public ModelAndView loginSubmit(@RequestParam String email , @RequestParam String password,
            HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

//        String email = request.getParameter("email");
//        String password = request.getParameter("password");

        if (StringUtils.equals(email , "ahannawi72@gmail.com") &&
        StringUtils.equals(password , "Boomboom1.")) {

            session.setAttribute(SESSION_KEY , email);
            response.addObject("loggedInUser" , email);
            response.setViewName("redirect:/success");
        } else {

            session.setAttribute(SESSION_KEY , null);
            response.setViewName("login");
        }

        return response;
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public ModelAndView success(HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        String username = (String) session.getAttribute(SESSION_KEY);
        if (StringUtils.equals(username, "ahannawi72@gmail.com")) {

            response.addObject("loggedInUser", username);

            response.setViewName("redirect:/userIndex");
        } else
            response.setViewName("redirect:/login");

        return response;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request, HttpSession session) throws Exception {

        session.invalidate();

        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/index");

        return response;
    }
}
