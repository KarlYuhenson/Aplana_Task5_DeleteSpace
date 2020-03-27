package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение с пробелами:");
        String message = scanner.nextLine();
        String messagenospace = message.replaceAll(" ", "");

        System.out.println("Сooбщение без пробелов: " + messagenospace);
    }
}
