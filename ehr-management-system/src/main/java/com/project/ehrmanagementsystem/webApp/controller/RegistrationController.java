package com.project.ehrmanagementsystem.webApp.controller;

import com.project.ehrmanagementsystem.webApp.repo.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
  private final PatientRepository patientRepository;

  public RegistrationController(PatientRepository patientRepository) {
    this.patientRepository = patientRepository;
  }

  @GetMapping
  public String showRegistrationForm() {
    return "registration-form";
  }

  @PostMapping
  public String registerPatient() {
    return "redirect:/patients";
  }

}