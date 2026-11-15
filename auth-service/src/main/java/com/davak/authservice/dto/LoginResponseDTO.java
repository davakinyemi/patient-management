package com.davak.authservice.dto;

import lombok.Getter;

/**
 * @author Dave AKN
 * @version 1.0
 */
@Getter
public class LoginResponseDTO {
    private final String token;

    public LoginResponseDTO(String token) {
        this.token = token;
    }
}
