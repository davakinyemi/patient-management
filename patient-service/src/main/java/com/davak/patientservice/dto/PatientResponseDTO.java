package com.davak.patientservice.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dave AKN
 * @version 1.0
 */
@Getter
@Setter
public class PatientResponseDTO {
    private String id;
    private String name;
    private String email;
    private String address;
    private String dateOfBirth;
}
