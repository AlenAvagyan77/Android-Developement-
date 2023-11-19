package Lesson_9_10;

import java.util.Scanner;

public class Registration {
    public void registration() {
        HomePage homePage = new HomePage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String username = sc.nextLine();
        if (isCorrectName(username)) {
            if (username.length() < 6) {
                System.out.println("The name should contain 6 character");
                registration();
            }
        }
        System.out.println("Enter your Password");
        String pass = sc.nextLine();
        if (pass.length() < 8) {
            System.out.println("The password should contain 8 character");
            registration();
        }
        homePage.welcome(username, pass);

    }

    private boolean isCorrectName(String n){
        return n.matches("[A-Z][a-z]+");

    }

}
