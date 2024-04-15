package com.phishing.gatewayservice.filter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum WhiteListUri {
    SIGNUP_URI("/auth/api/v1/signup"),
    SIGNIN_URI("/auth/api/v1/signin"),
    TOKEN_REFRESH_URI("/auth/api/v1/refresh"),
    CHECK_EMAIL_URI("/auth/api/v1/users/check"),
    SEND_MAIL_URI("/auth/api/v1/email/send"),
    VERIFY_MAIL_URI("/auth/api/v1/email/verify"),

    ;
    final String uri;
}
