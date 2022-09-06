package Q1;

public class Client {
    public void doAction() {
        System.out.println("Client: doAction");
        Server s = new Server2();
        s.doService();
    }
}