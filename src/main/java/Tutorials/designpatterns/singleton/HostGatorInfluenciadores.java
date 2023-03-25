package Tutorials.designpatterns.singleton;

import java.util.ArrayList;

public class HostGatorInfluenciadores {

    protected static HostGatorInfluenciadores instance;
    private ArrayList<YoutubeChannel> members = new ArrayList<YoutubeChannel>();

    private HostGatorInfluenciadores(){}

    public static HostGatorInfluenciadores getInstance() {
        if (instance == null) {
            instance = new HostGatorInfluenciadores();
        }
        return instance;
    }

    public void setMembers(ArrayList<YoutubeChannel> members) {
        this.members.addAll(members);
    }

    public void setMembers(YoutubeChannel member) {
        this.members.add(member);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HostGatorInfluenciadores:\n");
        for (int i = 0; i < members.size(); i++) {
            sb.append("#" + (i + 1) + ": " + members.get(i).toString() + "\n");
        }
        return sb.toString();
    }

    
    
}