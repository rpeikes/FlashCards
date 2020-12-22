package flashcards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;


    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public int getSize() {
        return cards.size();
    }

    public void clear() {
        cards.clear();
    }

    public List<Card> getCardsList() {
        return new ArrayList<>(cards);
    }
}
