package com.project.ehrmanagementsystem.webApp.service;

import com.project.ehrmanagementsystem.webApp.repo.NotesRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
  private final NotesRepository noteRepository;
  @Autowired
  private PatientService patientService;

  @Autowired
  public NotesService(NotesRepository noteRepository) {
    this.noteRepository = noteRepository;
  }

  public void getNotesByPatientId() {

  }

  public void addNoteToPatient() {

  }
}

