package com.company.Collections;

public class TestUrl {

    public static void main(String[] args){

        String testYoutubeUrl = "https://www.youtube.com/watch?v=dBD54EZIrZo";
        String testInstagramUrl = "https://www.instagram.com/p/BUawPlPF_Rx/";
        String testTwitterUrl = "https://twitter.com/hellopolicy/status/867177144815804416";
        String testVimeoUrl = "https://vimeo.com/20097015";

        StringBuffer completeYoutubeUrl = UrlParser.MadeYoutubeOembedUrl(testYoutubeUrl);
        System.out.println(completeYoutubeUrl);

        StringBuffer completeInstagramUrl = UrlParser.MadeInstagramOembedUrl(testInstagramUrl);
        System.out.println(completeInstagramUrl);

        StringBuffer completeTwitterUrl = UrlParser.MadeTwitterOembedUrl(testTwitterUrl);
        System.out.println(completeTwitterUrl);

        StringBuffer completeVimeoUrl = UrlParser.MadeVimeoOembedUrl(testVimeoUrl);
        System.out.println(completeVimeoUrl);

    }
}
