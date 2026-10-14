package com.davak.patientservice.mapper;

import com.davak.patientservice.dto.PatientRequestDTO;
import com.davak.patientservice.dto.PatientResponseDTO;
import com.davak.patientservice.model.Patient;

import java.time.LocalDate;

/**
 * @author Dave AKN
 * @version 1.0
 */
public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient p) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(p.getId().toString());
        patientDTO.setName(p.getName());
        patientDTO.setAddress(p.getAddress());
        patientDTO.setEmail(p.getEmail());
        patientDTO.setDateOfBirth(p.getDateOfBirth().toString());
        return patientDTO;
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
        return patient;
    }
}
