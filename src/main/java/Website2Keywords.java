import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Website2Keywords {
    public static void main(String[] args) throws IOException {

        Document website2 = Jsoup.connect("https://about.proquest.com/en/subjects/the-arts/").get();

        System.out.println("======IMAGES ========");
        Elements _images = website2.select("div.col-lg-6.results-small-block");

        //List<Element> _imageLists = new ArrayList<>();

        for (Element image : _images){
            System.out.println("\n" + image);
            //_imageLists.add(image);
        }
    }
}
