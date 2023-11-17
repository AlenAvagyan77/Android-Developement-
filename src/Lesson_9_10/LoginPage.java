package Lesson_9_10;

import java.util.Scanner;

public class LoginPage {

    public void login(String username, String pass) {
        ChatBot chatBot = new ChatBot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String usernameForCheck = sc.nextLine();
        System.out.println("Enter your password");
        String passForCheck = sc.nextLine();
        if (passForCheck.equals(pass) && usernameForCheck.equals(username)) {
            System.out.println("You are logged in successfully");
            chatBot.firstQuestion("Alen").secondQuestion().thirdQuestion().fourthQuestion().fifthQuestion();
        }else {
            System.out.println("Wrong email or password");
        }

    }

    public void forLoginRegister() {
        System.out.println("A problem was detected. Cannot login without registration");
        loginOrRegister();
    }


    public void loginOrRegister() {
        Registration registration = new Registration();
        System.out.println("Type 1 to login or 2 to register");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 1) {
            forLoginRegister();
        } else if (c == 2) {
            registration.registration();
        } else {
            System.out.println("You have entered the wrong number, please choose 1 or 2");
            loginOrRegister();
        }
    }
}
