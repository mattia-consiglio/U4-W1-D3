package exercise3;

import java.util.Date;
import java.util.Random;

public class Customer {
    private int id;
    private String name;

    private String email;
    private Date subscriptionDate;

    public Customer(String name, String email) {
        this.id = new Random().nextInt(1, 1000);
        this.name = name;
        this.email = email;
        this.subscriptionDate = new Date();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subscriptionDate=" + subscriptionDate.toString() +
                '}';
    }
}
