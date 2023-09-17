package design.patterns.creational.singleton;

public class YoutubeViewManager {
    private final YoutubeViewSingleton youtubeViewSingleton = YoutubeViewSingleton.getInstance();

    public void addViews(int views){
        for(int i = 0; i<views; i++){
            youtubeViewSingleton.watched();
        }
    }

    public int getViews(){
        return youtubeViewSingleton.getViewCount();
    }

    public YoutubeViewSingleton getYoutubeViewSingleton(){
        return youtubeViewSingleton;
    }
}
