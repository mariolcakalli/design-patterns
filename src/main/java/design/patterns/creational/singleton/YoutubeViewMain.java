package design.patterns.creational.singleton;

public class YoutubeViewMain {
    public static void main(String[] args) {
        YoutubeViewSingleton instance = YoutubeViewSingleton.getInstance();

        YoutubeViewManager managerOne = new YoutubeViewManager();
        managerOne.addViews(15);
        managerOne.addViews(5);

        YoutubeViewManager managerTwo = new YoutubeViewManager();
        managerTwo.addViews(20);
        managerTwo.addViews(2);

        System.out.println("Instance view count: " + instance.getViewCount());
        System.out.println("ManagerOne view count:" + managerOne.getViews());
        System.out.println("ManagerTwo view count:" + managerTwo.getViews());

        if (instance == managerOne.getYoutubeViewSingleton()){
            System.out.println("Instance is equal with manager one instance");
        }

        if (instance == managerTwo.getYoutubeViewSingleton()){
            System.out.println("Instance is equal with manager two instance");
        }

    }
}
