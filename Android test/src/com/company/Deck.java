package com.company;

/**
 * Created by ZlatanH on 2016-04-19.
 */
public class Deck {
    private Card[] deck;
    private String name;
    private int position;
    int size = 0;

    public Deck(String name){
        this.name = name;
        //temporärt
        deck = new Card[10];
    }

    public String getName(){
        System.out.println(name);
        return this.name;
    }

    public void addCard(Card card) {
        deck[size] = card;
        size = +1;
    }


    //för test
    public void play() {
        for (int i = 0; i <= size; i++) {
            System.out.println(deck[i].getQuestion());
            System.out.println(deck[i].getAnswer());
        }
    }
}