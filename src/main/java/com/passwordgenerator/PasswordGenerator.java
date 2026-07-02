package com.passwordgenerator;

import java.security.SecureRandom;

public class PasswordGenerator {
    SecureRandom secureRandom = new SecureRandom();

    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()?[]{}-_+";

    public String createPassword(int count) {
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int indice = secureRandom.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }
}