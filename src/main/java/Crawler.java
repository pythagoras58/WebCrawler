import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;

public class Crawler {
    public static void main(String[] args) throws IOException {

        Document website2 = Jsoup.connect("https://about.proquest.com/en/subjects/the-arts/").get();
        Document website3 = Jsoup.connect("https://www.creaitives.com/tools").get();

        var trans = website3.body().data();
        var _trans3 = website2.body().data();

//        System.out.println(trans);

        Instant _now = Instant.now();
        int nano = _now.getNano();

        String website2_file_name = "website2_file_name" + nano + ".txt";
        String website3_file_name = "website3_file_name" + nano + ".txt";

        String file_name = "data" + nano + ".txt";

        FileOutputStream _outputStream2 = new FileOutputStream(website2_file_name);
        FileOutputStream _outputStream3 = new FileOutputStream(website3_file_name);


        _outputStream2.write(trans.getBytes());
        _outputStream3.write(_trans3.getBytes());

        _outputStream2.close();
        _outputStream3.close();

    }
}
