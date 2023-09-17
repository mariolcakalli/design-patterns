package design.patterns.creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Servers servers = Servers.getInstance();
        Servers newServer = Servers.getInstance();

        System.out.println("Should Be true: "
                + servers.add("http://192.168.0"));
        System.out.println("Should Be false: "
                + servers.add("http://192.168.0"));
        System.out.println("Should Be true: "
                + servers.add("http://192.168.1"));
        System.out.println("Should Be true: "
                + servers.add("https://192.168.0"));
        System.out.println("Should Be false: "
                + servers.add("t3://192.168.0"));

        System.out.println("Http: " + newServer.getHttpServers());
        System.out.println("Https: " + newServer.getHttpsServers());

    }
}
