package com.passwordgenerator;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder senha = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean valido = false;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()+?<>[]{}-_";

        while (!valido) {
            System.out.println("Digite quantos caracteres você gostaria de ter em sua senha: ");

            if (scanner.hasNextInt()) {
                count = scanner.nextInt();

                if (count < 1) {
                    System.out.println("A senha deve ter pelo menos 1 caractere!");
                } else if (count > 60) {
                    System.out.println("Senha muito grande, escolha no máximo 60 caracteres.");
                } else {
                    valido = true;
                }
            } else {
                System.out.println("Entrada inválida. Digite apenas números inteiros.");
                scanner.nextLine();
            }
        }

        for (int i = 0; i < count; i++) {
            int indice = secureRandom.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        System.out.println("Senha: " + senha);
    }
}
