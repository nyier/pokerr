import java.util.*;
public class Deck {
    ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
        String[] suits = {"Picas", "Corazones", "Diamantes", "Treboles"};
        String[] colors = {"Negro", "Rojo"};
        String[] values = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "J", "Reina", "Rey"};

        for (String suit : suits) {
            for (String value : values) {
                this.cards.add(new Card(suit, colors[Arrays.asList(suits).indexOf(suit) % 2], value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
        System.out.println("Se mezcló el Deck");
    }

    public Card head() {
        Card card = this.cards.get(0);
        this.cards.remove(0);
        System.out.println("Quedan "+this.cards.size()+" cartas en el deck");
        return card;
    }

    public Card pick() {
        int index = new Random().nextInt(this.cards.size());
        Card card = this.cards.get(index);
        this.cards.remove(index);
        System.out.println("Quedan "+this.cards.size()+" cartas en el deck");
        return card;
    }

    public ArrayList<Card> hand() {
        ArrayList<Card> handCards = new ArrayList<Card>();

        for (int i=0; i<5; i++) {
            handCards.add(this.pick());
        }

        System.out.println("Quedan "+this.cards.size()+" cartas en el deck");

        return handCards;
    }
}
