package Lesson_9_10;

import java.util.Scanner;

public class HomePage{
    public void welcome(String username, String pass) {
        LoginPage loginPage = new LoginPage();
        Registration registration = new Registration();
        System.out.println("Type 1 to login or 2 to register");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 1) {
            loginPage.login(username, pass);
        } else if (c == 2) {
            registration.registration();
        } else {
            System.out.println("You entered a wrong number, please choose 1 or 2");
            loginPage.loginOrRegister();
        }
    }

}
