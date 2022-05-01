import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

class Homework{
    public static void main(String[] args) throws IOException {

        String url = "https://en.wikipedia.org/wiki/Main_Page";
        Document page = Jsoup.connect(url).get();
        System.out.println(page.documentType());

    }
}