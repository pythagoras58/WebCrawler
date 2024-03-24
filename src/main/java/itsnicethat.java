import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class itsnicethat {
    public static void main(String[] args) throws IOException {
        Document website = Jsoup.connect("https://www.itsnicethat.com/").get();

        Elements _keywords = website.select("div.col-lg-6.results-small-block");
    }
}
