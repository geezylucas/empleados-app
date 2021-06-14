package com.geezylucas.app.controllers;

import com.geezylucas.app.services.IEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class EmpleadoController {

    private final IEmpleadoService empleadoService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("list", empleadoService.buscarEmpleados());

        return "index";
    }
}
