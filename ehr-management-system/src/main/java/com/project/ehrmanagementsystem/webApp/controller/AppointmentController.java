package com.project.ehrmanagementsystem.webApp.controller;



import com.project.ehrmanagementsystem.webApp.service.AppointmentService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Locale;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
@RequestMapping("/appointments")
public class AppointmentController {
  // Other controller methods
  private final AppointmentService appointmentService;

  public AppointmentController(AppointmentService appointmentService) {
    this.appointmentService = appointmentService;
  }

  @GetMapping("/schedule")
  public String showAppointmentForm(Model model) {
    return "appointmentForm";
  }

  @PostMapping("/schedule")
  public String processAppointmentForm() {
    return "redirect:/patients";
  }

  @PostMapping("/reminders")
  public String sendAppointmentReminder() {
    return "message-page";
  }

}
