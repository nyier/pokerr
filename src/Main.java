import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();

        Card card1 = deck.head();

        Card card2 = deck.pick();

        ArrayList<Card> handCards = deck.hand();

        System.out.println("Primera carta: "+card1.value+" de "+card1.suit);

        System.out.println("Carta al azar: "+card2.value+" de "+card2.suit);

        System.out.println("Mano de cinco cartas:");

        for (Card card : handCards) {
            System.out.println(card.value+" de "+card.suit+" "+card.color);
        }
    }
}