package com.phishing.gatewayservice.payload;

public record Passport(
    Long userId,
    String email,
    String nickname,
    String role
) {
}
