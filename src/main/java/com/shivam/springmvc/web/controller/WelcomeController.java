package com.shivam.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

    /**
     * welcome page
     * @return
     */
    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcomePage() {
        return "welcome";
    }

    /**
     * form example
     * @return
     */
    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showForm() {
        return "form";
    }

    /**
     * process form
     * @return
     */
    @RequestMapping(value = "processFormVersion1", method = RequestMethod.GET)
    public String processFormData() {
        return "player-form";
    }

    /**
     * process form using Servlet
     * @param servletRequest
     * @param model
     * @return
     */
    @RequestMapping(value = "processFormVersion2", method = RequestMethod.GET)
    public String processFormUsingServlet(HttpServletRequest servletRequest , Model model) {

        String playerName = servletRequest.getParameter("playerName");
        System.out.println("player Name : "+playerName);
        return "player-form";
    }


    /**
     * Request Param example
     * @param playerName
     * @param model
     * @return
     */
    @RequestMapping(value = "processFormVersion3", method = RequestMethod.GET)
    public String processFormRequestMapping(@RequestParam("playerName") String playerName, Model model) {
        System.out.println("player Name : "+playerName);
        return "player-form";
    }


    @RequestMapping(value = "processFormVersion3", method = RequestMethod.GET)
    public String processFormPathVariable(@PathVariable("id") String id) {
        System.out.println("player id : "+id);
        return "player-form";
    }




}