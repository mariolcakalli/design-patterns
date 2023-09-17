package design.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Servers {
    private static Servers INSTANCE;

    private List<String> servers;

    private Servers(){
        this.servers = new ArrayList<>();
    }

    public static Servers getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Servers();
        }
        return INSTANCE;
    }

    public boolean add(String serverName){
        synchronized (servers){
            if(servers.contains(serverName)){
                return false;
            }
            if(serverName.startsWith("http")
                    || serverName.startsWith("https")){
                return servers.add(serverName);
            }
        }
        return false;
    }

    public List<String> getHttpServers(){
        return getServers("http");
    }
    public List<String> getHttpsServers(){
        return getServers("https");
    }

    private List<String> getServers(String startsWith){
        List<String> newServerList = new ArrayList<>();
        for(String server: this.servers){
            if(server.startsWith(startsWith + ":")){
                newServerList.add(server);
            }
        }
        return newServerList;
    }
}
