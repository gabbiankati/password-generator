package com.passwordgenerator;

public class Main {
    public static void main(String[] args) {
        InputValidator inputValidator = new InputValidator();
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        int tamanho = inputValidator.validatorPassword();
        String senha = passwordGenerator.createPassword(tamanho);

        System.out.println("Senha: " + senha);
    }
}