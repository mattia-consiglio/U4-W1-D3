package exercise3;

import java.util.Arrays;

public class Cart {
    private Item[] items;
    private double totalPrice;
    private Customer customer;

    public Cart(Customer customer) {
        this.customer = customer;
        this.items = new Item[0];
        this.totalPrice = 0;
    }

    public void addItem(Item item) {
        this.items = Arrays.copyOf(this.items, this.items.length + 1);
        this.items[this.items.length - 1] = item;
        this.totalPrice += item.getPrice();
        item.setQuantity(item.getQuantity() - 1);
    }

    public Item[] getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
