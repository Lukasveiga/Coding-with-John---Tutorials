package Tutorials.designpatterns.monostate;
import Tutorials.designpatterns.singleton.YoutubeChannel;

import java.util.ArrayList;
import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        YoutubeChannel cdftv = new YoutubeChannel("Código Fonte TV", "codigofontetv");
        YoutubeChannel attekitaDev = new YoutubeChannel("AtekitaDev", "sdshdasdbl232fdsf8");
        YoutubeChannel diolinux = new YoutubeChannel("Diolinux", "diolinux");

        ArrayList<YoutubeChannel> members = new ArrayList<>(Arrays.asList(cdftv, attekitaDev));
        
        HostGatorInfluenciadores hostGatorInfluenciadores = new HostGatorInfluenciadores();
        hostGatorInfluenciadores.setMembers(members);

        HostGatorInfluenciadores hostGatorInfluenciadores2 = new HostGatorInfluenciadores();
        hostGatorInfluenciadores2.setMembers(diolinux);

        System.out.println(hostGatorInfluenciadores);
        System.out.println(hostGatorInfluenciadores2);

        System.out.println(hostGatorInfluenciadores == hostGatorInfluenciadores2);
        System.out.println(hostGatorInfluenciadores.getMembers() == hostGatorInfluenciadores2.getMembers());
    }
    
}
