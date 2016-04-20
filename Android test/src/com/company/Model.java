package com.company;

/**
 * Created by ZlatanH on 2016-04-19.
 */
public class Model {
    private Deck test = new Deck("Test");
    private CardFactory cardFactory = new CardFactory();
    private int position = 0;
    public void test() {
        test.getName();
        test.addCard(cardFactory.createCard());
        test.addCard(cardFactory.createCard());
        test.play();

    }
}
