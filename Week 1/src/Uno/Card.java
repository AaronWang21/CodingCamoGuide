package Uno;
public interface Card {

    boolean isValid(Card previousCard);//compare if card is valid
    void playCard();//play the Card
}