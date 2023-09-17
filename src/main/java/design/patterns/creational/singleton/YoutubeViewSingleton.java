package design.patterns.creational.singleton;

public class YoutubeViewSingleton {
    private static YoutubeViewSingleton INSTANCE;

    private int viewCount = 0;

    private YoutubeViewSingleton(){}

    public static YoutubeViewSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new YoutubeViewSingleton();
        }
        return  INSTANCE;
    }

    public void watched(){
        viewCount += 1;
    }

    public int getViewCount(){
        return viewCount;
    }
}
