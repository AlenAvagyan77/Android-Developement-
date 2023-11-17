package Lesson_9_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.loginOrRegister();
//        login("Alen", "Avagyan");



    }

    public static void login(String username, String pass) {
        ChatBot chatBot = new ChatBot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String usernameForCheck = sc.nextLine();
        System.out.println("Enter your password");
        String passForCheck = sc.nextLine();
        if (passForCheck.equals(pass) && usernameForCheck.equals(username)) {
            System.out.println("You are logged in successfully");
            chatBot.firstQuestion("Alen").secondQuestion().thirdQuestion().fourthQuestion().fifthQuestion();
        } else {
            System.out.println("Wrong email or password");
        }

    }
}