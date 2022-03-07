package perscholas.controllers;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import perscholas.database.dao.UserDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class SignupController {

    private static String SESSION_KEY = "usernameSessionKey";

//    public static final Logger LOG = LoggerFactory.getLogger(SignupController.class);
//
//    @Autowired
//    private UserDAO userDAO;
//
//    @RequestMapping(value = "/userList" , method = RequestMethod.GET)
//    public ModelAndView userList(@RequestParam(required = false) String search ,
//                                 @RequestParam(required = false) String firstName ,
//                                 @RequestParam(required = false) String lastName) throws Exception {
//
//        ModelAndView response = new ModelAndView();
//
//
//        return response;
//    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView signup(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();
        response.setViewName("signup");

        return response;
    }

    @RequestMapping(value = "/signupSuccess", method = RequestMethod.GET)
    public ModelAndView signupSuccess(HttpServletRequest request, HttpSession session) throws Exception {

        ModelAndView response = new ModelAndView();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneNum = request.getParameter("phoneNum");
        String password = request.getParameter("password");

        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);
        session.setAttribute("email", email);
        session.setAttribute("phoneNum", phoneNum);
        session.setAttribute("password", password);



        return response;
    }
}
