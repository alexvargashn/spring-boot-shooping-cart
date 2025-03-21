package com.shoppingcart.application.dto;
/**
 * This package contains Data Transfer Objects (DTOs) used in the Shopping Cart application.
 */
public class JwtResponse {

    private String token;

    public JwtResponse() {
    }

    public JwtResponse(String token) {
        this.token = token;
    }

    // Getter y setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
