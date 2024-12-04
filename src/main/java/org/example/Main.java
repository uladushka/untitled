package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Cosmetic Salon Client Registration!");

        // Сбор данных о клиенте
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the service you want: ");
        String service = scanner.nextLine();

        // Вывод данных о клиенте
        System.out.println("\nClient Information:");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Service: " + service);

        System.out.println("\nThank you for registering!");

        // Закрытие сканера
        scanner.close();
    }
}
