package Tutorials.designpatterns.singleton;

public class YoutubeChannel {

    private String name;
    private String userName;
    
    public YoutubeChannel(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "YoutubeChannel [Name: " + name + ", User Name: " + userName + "]";
    }

    
    
}
