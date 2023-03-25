package Tutorials.designpatterns.monostate;
import Tutorials.designpatterns.singleton.YoutubeChannel;

import java.util.ArrayList;

public class HostGatorInfluenciadores {

    private static ArrayList<YoutubeChannel> members = new ArrayList<YoutubeChannel>();

    public HostGatorInfluenciadores(){}

    public void setMembers(ArrayList<YoutubeChannel> members) {
        HostGatorInfluenciadores.members.addAll(members);
    }

    public void setMembers(YoutubeChannel member) {
        HostGatorInfluenciadores.members.add(member);
    }

    public ArrayList<YoutubeChannel> getMembers() {
        return members;
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