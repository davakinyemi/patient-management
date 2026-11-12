package com.davak.patientservice.dto;

import com.davak.patientservice.dto.validators.CreatePatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Dave AKN
 * @version 1.0
 */
public class PatientRequestDTO {
    @Setter
    @Getter
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot exceed 100 Characters")
    private String name;

    @Setter
    @Getter
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @Setter
    @Getter
    @NotBlank(message = "Address is required")
    private String address;

    @Setter
    @Getter
    @NotBlank(message = "Date of birth is required")
    private String dateOfBirth;

    @Getter
    @NotBlank(groups = CreatePatientValidationGroup.class, message = "Registered date is required")
    private String registeredDate;
}
