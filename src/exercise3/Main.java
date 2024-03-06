package exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item tomato = new Item("Tomato", 2, 10);
        Item potato = new Item("Potato", 1, 20);
        Item carrot = new Item("Carrot", 1.5, 30);

        Customer customer = new Customer("Mattia", "<EMAIL>");
        Cart cart = new Cart(customer);
        cart.addItem(tomato);
        cart.addItem(potato);
        cart.addItem(carrot);

        System.out.println(Arrays.toString(cart.getItems()));
        System.out.println(cart.getTotalPrice());
    }
}
