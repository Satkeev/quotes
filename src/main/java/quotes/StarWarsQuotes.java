package quotes;

public class StarWarsQuotes extends RecentQuotes{
    String starWarsQuote;

    public StarWarsQuotes(String author, String text, String starWarsQuote) {
        super(author, text);
        this.starWarsQuote = starWarsQuote;
    }

    public String starToString() {
        return String.format("Quote: %s ", starWarsQuote);
    }
}
