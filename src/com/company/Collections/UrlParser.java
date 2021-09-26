package com.company.Collections;

public class UrlParser {

    private final static StringBuffer instagramOembedUrl = new StringBuffer("https://api.instagram.com/oembed?url=");
    private final static StringBuffer youtubeOembedUrl = new StringBuffer("https://www.youtube.com/oembed?url=");
    private final static StringBuffer twitterOembedUrl = new StringBuffer("https://publish.twitter.com/oembed?url=");
    private final static StringBuffer vimeoOembedUrl = new StringBuffer("https://vimeo.com/api/oembed.json?url=");
    private final static String contentFormat = "&format=json";

    public static StringBuffer MadeYoutubeOembedUrl(String searchUrl){
        StringBuffer completeYoutubeOembedUrl = youtubeOembedUrl.append(searchUrl).append(contentFormat);
        System.out.println(completeYoutubeOembedUrl);

        return completeYoutubeOembedUrl;
    }

    public static StringBuffer MadeInstagramOembedUrl(String searchUrl){
        StringBuffer completeInstagramOembedUrl = instagramOembedUrl.append(searchUrl).append(contentFormat);
        System.out.println(completeInstagramOembedUrl);

        return completeInstagramOembedUrl;
    }

    public static StringBuffer MadeTwitterOembedUrl(String searchUrl){
        StringBuffer completeTwitterOembedUrl = twitterOembedUrl.append(searchUrl).append(contentFormat);
        System.out.println(completeTwitterOembedUrl);

        return completeTwitterOembedUrl;
    }

    public static StringBuffer MadeVimeoOembedUrl(String searchUrl){
        StringBuffer completeVimeoOembedUrl = vimeoOembedUrl.append(searchUrl);
        System.out.println(completeVimeoOembedUrl);

        return completeVimeoOembedUrl;
    }
    //new 연산은 최대한 기피하고 싶지만 객체지향적으로 구현하기 위해 클래스로 나눔.

    //파서는 만들되 파서내에서 메서드로 나누고
    // 서비스에선 한 회사링크당 한 메서드로 나눠줘야함
}
