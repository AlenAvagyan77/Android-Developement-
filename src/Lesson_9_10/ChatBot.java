package Lesson_9_10;

import java.util.Scanner;

public class ChatBot {
    Scanner scanner = new Scanner(System.in);
    public ChatBot firstQuestion(String loggedInUserName){
        System.out.println("Hello dear subscriber");
        String firstQuestion = scanner.nextLine();
        if (firstQuestion.contains("Hello") || firstQuestion.contains("hello")){
            System.out.println("Hello " + loggedInUserName + "!");
        }else if (!firstQuestion.contains("Hello")){
            System.out.println("Please enter right question, I can not understand you");
            firstQuestion("Alen");
        }
        System.out.println("How are you");
        return this;
    }
    public ChatBot secondQuestion(){
        String secondQuestion = scanner.nextLine();
        if (secondQuestion.contains("Thank you fine") || secondQuestion.contains("thank you fine")){
            System.out.println("I am glad to know that you well");
        } else if (!secondQuestion.contains("How are you")) {
            System.out.println("Please enter right answer, I can not understand you");
            secondQuestion();

        }
        System.out.println("If you used me it means that you want to know about Java, Am I right?");
        return this;

    }

    public ChatBot thirdQuestion(){
        String thirdQuestion = scanner.nextLine();
        if (thirdQuestion.contains("Yes") || thirdQuestion.contains("yes")){
            System.out.println("Well then ask!");
        }else {
            System.out.println("Sorry but if you did not come here to ask about Java, I can not help you \n" +
                    " !!! Let's give me questions about Java \n" +
                    "Take me your first question about Java");
            thirdQuestion();

        }
        return this;
    }

    public ChatBot fourthQuestion(){
        String fourthQuestion = scanner.nextLine();
        if (fourthQuestion.contains("What is a Java") || fourthQuestion.contains("what is a java")){
            System.out.println("Java is a high-level, class-based, object-oriented programming language");
        } else if (!fourthQuestion.contains("What is a Java")) {
            fourthQuestion();
        }
        System.out.println("Would you like to know When was released Java ?");
        return this;
    }

    public ChatBot fifthQuestion(){
        String fifthQuestion = scanner.nextLine();
        if (fifthQuestion.equals("When") || fifthQuestion.equals("when")){
            System.out.println("Official release date: May 23, 1995");
        }else if (!fifthQuestion.equals("when") || fifthQuestion.equals("When")) {
            System.out.println("Really!! Don't you want to know ?");
            fifthQuestion();

        }
        return this;
    }

}
