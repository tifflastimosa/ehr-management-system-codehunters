package com.project.ehrmanagementsystem.webApp.controller;

import com.project.ehrmanagementsystem.webApp.service.AppointmentService;
import com.project.ehrmanagementsystem.webApp.service.NotesService;
import com.project.ehrmanagementsystem.webApp.service.PatientService;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/patients")
public class PatientController {

  @Autowired
  private PatientService patientService;
  @Autowired
  private NotesService notesService;

  @Autowired
  private AppointmentService appointmentService;

  @GetMapping
  public String searchPatients() {
    return "patient-search";
  }

  @GetMapping("/{id}")
  public String getPatientDetails() {
    return "patient-details";
  }

  @GetMapping("/edit/{id}")
  public String editPatient() {
    return "edit-patient";
  }

  @PostMapping("/update/{id}")
  public String updatePatient() {
    return "redirect:/patients/<id>";
  }

  @GetMapping("notes/view/{id}")
  public String viewNotes() {
    return "notes-page";
  }

  @GetMapping("notes/add/{id}")
  public String showAddNoteForm() {
    return "add-note";
  }

  @PostMapping("notes/add/{id}")
  public String addNote() {
    return "redirect:/patients/notes/view/<patientId>";
  }

  @GetMapping("/appointments/{patientId}")
  public String viewAppointments() {
    return "appointmentList";
  }

  @GetMapping("/appointment/reschedule/{appointmentId}")
  public String showRescheduleForm() {
    return "rescheduleForm";
  }

  @PostMapping("/appointment/reschedule/{appointmentId}")
  public String rescheduleAppointment() {
    return "redirect:/patients/appointment/reschedule/<appointmentId>";
  }

  @PostMapping("/appointment/delete")
  public String deleteAppointment() {
    return "redirect:/patients/<patientId>";
  }

}
