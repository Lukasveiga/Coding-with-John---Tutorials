package Tutorials.designpatterns.singleton;

import java.util.ArrayList;
import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        YoutubeChannel cdftv = new YoutubeChannel("Código Fonte TV", "codigofontetv");
        YoutubeChannel attekitaDev = new YoutubeChannel("AtekitaDev", "sdshdasdbl232fdsf8");
        YoutubeChannel diolinux = new YoutubeChannel("Diolinux", "diolinux");

        ArrayList<YoutubeChannel> members = new ArrayList<>(Arrays.asList(cdftv, attekitaDev));
        
        HostGatorInfluenciadores hostGatorInfluenciadores = HostGatorInfluenciadores.getInstance();
        hostGatorInfluenciadores.setMembers(members);

        HostGatorInfluenciadores hostGatorInfluenciadores2 = HostGatorInfluenciadores.getInstance();
        hostGatorInfluenciadores2.setMembers(diolinux);

        System.out.println(hostGatorInfluenciadores);
        System.out.println(hostGatorInfluenciadores2);

        if (hostGatorInfluenciadores == hostGatorInfluenciadores2) {
            System.out.println("The objects are the same.");
        } else {
        System.out.println("The objects are different.");
        }
    }
    
}
