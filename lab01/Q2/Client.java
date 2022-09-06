package Q2;

public class Client {
    public void doAction(){
        ServerInterface si = new Server2();
        System.out.println("Client: do Action");
        si.doService();
    }
}
