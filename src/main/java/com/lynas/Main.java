package com.lynas;

/**
 * Created by lynas on 3/16/15.
 */
public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        String originalMsg = "Hello World";
        System.out.println("Original Message : "+ originalMsg);
        System.out.println(
                "Swap Message : " + logic.changeCase(originalMsg)
        );
    }
}
