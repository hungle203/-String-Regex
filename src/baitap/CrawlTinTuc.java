package baitap;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlTinTuc {
    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
//            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
//            Scanner scanner = new Scanner(inputStreamReader);
//            scanner.useDelimiter("\\Z");
//            String content = scanner.next();
//            scanner.close();
//            content = content.replaceAll("\\s", "");
//            System.out.println(content);
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String x = "   CodeGym_Viet_Nam    ";
        x = x.trim();
        int index = x.indexOf("_");
        String y = x.substring(0, index);
        System.out.println(y);
    }

}
