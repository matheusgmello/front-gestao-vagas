package br.com.matheus.front_gestao_vagas.modules.candidate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/candidate")
public class CandidateController {
  
  @GetMapping("/login")
  public String login() {
    return "candidate/login";
  }
}
