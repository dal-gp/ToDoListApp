package com.example;

import java.util.Scanner;

public class Main {

    private static boolean isRunning = true;
    public static void main(String[] args) {
        while(isRunning){
            showMenu();
        }
    }
    public static void showMenu(){
        System.out.println("Welcome to the To-Do List Application!");
        System.out.println("1. Log in");
        System.out.println("2. Sing up");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        handleMenu(choice);
    }
    public static void handleMenu(int choice) {
        switch(choice) {
            case 2:
                onSignUp();
                break;
            case 3:
                onExit();
                break;
            default:
                System.out.println("Invalid choice!");
                showMenu();
        }
    }

    public static void onExit() {
        isRunning = false;
    }

    public static void onSignUp() {
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        // TODO Later: Add the to-do list operations

    }

    public static void onLogIn() {
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        // TODO Later: Shows a message based on the result
    }
}
