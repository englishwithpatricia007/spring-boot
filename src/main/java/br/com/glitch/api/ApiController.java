package br.com.glitch.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class ApiController {

    @GetMapping
    public String getMensagem() {
        return "Olá, mundo!";
    }
}
