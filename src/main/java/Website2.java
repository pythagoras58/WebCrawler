import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Website2 {
    public static void main(String[] args) throws IOException {


        //
        try {
            Document website2 = Jsoup.connect("https://about.proquest.com/en/subjects/the-arts/").get();

//          Listing urls
//            Elements _links = website2.select("a[href]");
//
//            for (Element link : _links){
//                System.out.println("\nlink: " + link.attr("href"));
//                System.out.println("text: " + link.text());
//            }

            System.out.println("======IMAGES ========");
            Elements _images = website2.getElementsByClass("results-small-content");

            List<Element> _imageLists = new ArrayList<>();

            for (Element image : _images){
                System.out.println("\n" + image);
                _imageLists.add(image);
            }


            if(!_imageLists.isEmpty()){
                for (Element checks : _imageLists){
                    var anchor = checks.select("h3 a").first();

                    // Extract the href text and anchor text
                    String hrefText = anchor.attr("href");
                    String anchorText = anchor.text();

                    // Extract the paragraph
                    var paragraph = checks.select("p").first();
                    String paragraphText = paragraph.text();

                    System.out.println("\n AnchorText: " + anchorText);
                    System.out.println("Href Text: " + hrefText);
                    System.out.println("Paragraph Text: " + paragraphText);
                }
            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
