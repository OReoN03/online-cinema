package com.example.online_cinema.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserAlreadyExistsException.class)
    public String handle(UserAlreadyExistsException e, Model model, HttpServletRequest request) {
        // TODO add internationalization
        model.addAttribute("error", "Email is already in use");
        model.addAttribute("email", request.getParameter("email"));
        model.addAttribute("password", request.getParameter("password"));
        model.addAttribute("lastName", request.getParameter("lastName"));
        model.addAttribute("firstName", request.getParameter("firstName"));
        model.addAttribute("phone", request.getParameter("phone"));
        model.addAttribute("birthDate", request.getParameter("birthDate"));
        model.addAttribute("gender", request.getParameter("gender"));
        return "registration";
    }
}
