package com.company;
import java.util.Scanner;
/**
 * Created by ZlatanH on 2016-04-19.
 */
public class CardFactory {

    public Card createCard(String question, String answer) {
        return new Card (question, answer);
    }

    public Card createCard() {
        //använd den här för att med GUIt få in frågan och svaret
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a question");
        String question = sc.next();
        System.out.println("Input an answer");
        String answer = sc.next();
        return new Card (question, answer);
    }
}
