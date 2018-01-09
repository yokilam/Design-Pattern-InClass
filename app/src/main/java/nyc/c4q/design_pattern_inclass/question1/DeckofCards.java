package nyc.c4q.design_pattern_inclass.question1;

/**
 * Created by yokilam on 1/7/18.
 */

public enum DeckofCards {
    SPADES("Spades of Ace!"),
    HEARTS("Hearts of Five!"),
    DIAMONDS("Diamonds of Three!"),
    CLUBS("Clubs of Jacks!");

    private String card;

    DeckofCards(String card){
        this.card= card;
    }

    @Override
    public String toString() {
        return card;
    }
}
