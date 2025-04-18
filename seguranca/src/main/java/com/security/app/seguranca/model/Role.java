package com.security.app.seguranca.model;

public enum Role {

    ADMIN("admin"),
    USER("user");

    private String role;

    Role(String role){
        this.role = role;

    }

    public String getRole() {
        return role;
    }
}
