package com.shivam.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {


    @RequestMapping(value = "/check" ,method = RequestMethod.GET)
    public String redirectView()
    {

        return "redirect:/welcome";
    }



    @RequestMapping(value = "/redirect" ,method = RequestMethod.GET)
    public RedirectView redirectViewNew()
    {

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/springbootmvc/welcome");
        return redirectView;

    }
}
