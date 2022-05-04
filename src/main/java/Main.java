import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import javax.swing.JFrame;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends JFrame {
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 800;


    public Main() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);

        MainContent mainContent = new MainContent(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(mainContent);
        this.setVisible(true);

        webScrapper();

    }

    public void webScrapper() {

        try {
            String url = "https://lite.ip2location.com/ip-address-ranges-by-country";
            Document document = Jsoup.connect(url).get();
            for (Element element : document.select("div.card-columns div")) {
                Elements link = element.select("a");
                String redirectURL = "https://lite.ip2location.com" + link.attr("href");
                Document redirectDoc = Jsoup.connect(redirectURL).get();

                //Element table = redirectDoc.select("div").get(0).select("div").get(1).select("div").
                //        get(0).select("div").get(0).select("table").get(0).select("tbody").get(0);
                Element table = redirectDoc.select("table").get(0);
                ArrayList<Element> elementList = table.getElementsByClass("odd");
                for (Element tr : elementList) {
                    System.out.println(tr.attr("class"));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        Main main = new Main();
    }
}
