package exercise2;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("123456789");
        sim.setCredit(20);

        System.out.println(sim);

        sim.addCall(new Call("1965814982", 5));
        sim.addCall(new Call("16519", 15));
        sim.addCall(new Call("96419651", 5));
        System.out.println(sim);
    }
}
