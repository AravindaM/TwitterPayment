package visa.innovation.app.twitterclient.model;

/**
 * Created by aliyanag on 6/6/2016.
 */
public class Twit {

    private String text;
    private String source;
    private String dateCreated;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
