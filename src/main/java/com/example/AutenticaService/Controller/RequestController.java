package com.example.AutenticaService.Controller;

import com.example.AutenticaService.domain.CategoryEnums;
import com.example.AutenticaService.domain.ManufacturerEnums;
import com.example.AutenticaService.domain.Request;
import com.example.AutenticaService.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class RequestController {

    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/requests")
    public String findAllRequests(Model model) {
        List<Request> requests = requestService.findAllRequests();
        model.addAttribute("requests", requests);
        return "/list-of-requests";
    }

    @ModelAttribute
    @GetMapping("/request-add")
    public String addRequestForm(Request request, Model model) {
        model.addAttribute("manufacturerTypes", ManufacturerEnums.values());
        model.addAttribute("CategoryTypes", CategoryEnums.values());
        return "add-request";
    }

    @PostMapping("/request-add")
    public String addRequest(Request request) {
        requestService.addRequest(request);
        request.setDateTime(LocalDateTime.now());
        return "redirect:/requests";
    }

    @GetMapping("/request-delete{id}")
    public String deleteRequest(@PathVariable("id") Long id) {
        requestService.deleteByID(id);
        return "redirect:/requests";

    }

    @ModelAttribute
    @GetMapping("/request-update{id}")
    public String updateRequestForm(@PathVariable("id") Long id, Model model) {
        Request request = requestService.findById(id);
        model.addAttribute("request", request);
        model.addAttribute("manufacturerTypes", ManufacturerEnums.values());
        model.addAttribute("CategoryTypes", CategoryEnums.values());
        return "update-request";
    }

    @PostMapping("/update-request")
    public String updateRequest(Request request) {
        requestService.updateRequest(request);
        return "redirect:/requests";
    }

}
