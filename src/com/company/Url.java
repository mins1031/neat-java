package com.company;

import com.company.Collections.UrlParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Url{

    private static final String checkYoutube = "www.youtube.com";
    private static final String checkInstagram = "www.instagram.com";
    private static final String checkTwitter = "twitter.com";
    private static final String checkVimeo = "vimeo.com";


    public static void main(String[] args) {

        String testYoutubeUrl = "https://www.youtube.com/watch?v=dBD54EZIrZo";
        String testInstagramUrl = "https://www.instagram.com/p/BUawPlPF_Rx/";
        String testTwitterUrl = "https://twitter.com/hellopolicy/status/867177144815804416";
        String testVimeoUrl = "https://vimeo.com/20097015";

        BufferedReader in = null;

        try {

            URL objUrl = new URL(testVimeoUrl);
            String hostInfo = objUrl.getHost();
            String completeUrl = null;


            if (hostInfo.equals(checkYoutube))
                completeUrl = UrlParser.MadeYoutubeOembedUrl(testYoutubeUrl).toString();
            else if (hostInfo.equals(checkInstagram))
                completeUrl = UrlParser.MadeInstagramOembedUrl(testInstagramUrl).toString();
            else if (hostInfo.equals(checkTwitter))
                completeUrl = UrlParser.MadeTwitterOembedUrl(testTwitterUrl).toString();
            else if (hostInfo.equals(checkVimeo))
                completeUrl = UrlParser.MadeVimeoOembedUrl("https://vimeo.com/463101400").toString();

            URL resultURL = new URL(completeUrl);

            HttpURLConnection con = (HttpURLConnection) resultURL.openConnection();
            con.setRequestMethod("GET");

            in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

            String line;
            String re = null;
            while ((line = in.readLine()) != null) {
                re = line;
                System.out.println(line);
            }

            System.out.println(re);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(in != null) try {
                in.close();
            } catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
