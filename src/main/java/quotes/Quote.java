package quotes;

import java.util.ArrayList;
import java.util.List;

class quote {
    private String author;
    private String text;

    public String getAuthor() {
        return this.author;
    }


    public String getText() {
        return this.text;
    }

    public quote(String author, String text) {
        this.author = author;
        this.text = text;
    }
}
