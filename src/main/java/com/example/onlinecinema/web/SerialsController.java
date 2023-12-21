package com.example.onlinecinema.web;

import com.example.onlinecinema.data.SerialRepository;
import com.example.onlinecinema.domain.Serial;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class SerialsController {
    private SerialRepository serialRepository;

    public SerialsController(SerialRepository serialRepository) {
        this.serialRepository = serialRepository;
    }
    @GetMapping("/serials")
    public String serials() {
        return "serials/serials";
    }

    @ModelAttribute
    public void getNewSerials(Model model) {
        List<Serial> newSerials = serialRepository.findTop5ByOrderByYearDesc();
        model.addAttribute("newSerials", newSerials);
    }

    @ModelAttribute
    public void getTopSerials(Model model) {
        List<Serial> topSerials = serialRepository.findTop5ByOrderByRatingDesc();
        model.addAttribute("topSerials", topSerials);
    }
}
