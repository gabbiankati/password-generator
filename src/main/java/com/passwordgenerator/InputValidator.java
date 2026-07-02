package com.passwordgenerator;

import java.util.Scanner;

public class InputValidator {

    Scanner scanner = new Scanner(System.in);

    public int validatorPassword() {
        int count = 0;
        boolean valido = false;

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

        return count;
    }
}