package exercise2;

import java.util.Arrays;

public class Sim {
    private String phoneNumber;
    private double credit;
    private Call[] lastCalls;

    public Sim(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credit = 0;
        this.lastCalls = new Call[0];
    }

    public void addCall(Call call) {

        double CALL_COST = 0.1;
        double cost = call.getDuration() * CALL_COST;
        if (credit - cost < 0) {
            throw new IllegalArgumentException("Not enough credit to make call");
        }
        this.credit -= cost;
        this.lastCalls = Arrays.copyOf(this.lastCalls, this.lastCalls.length + 1);
        this.lastCalls[this.lastCalls.length - 1] = call;
    }

    public Call[] printLast5Calls() {
        return Arrays.copyOfRange(this.lastCalls, 0, Math.min(5, this.lastCalls.length));
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        if (credit < 0) {
            throw new IllegalArgumentException("Credit cannot be negative");
        }
        this.credit = credit;
    }

    public Call[] getLastCalls() {
        return lastCalls;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", credit=" + credit +
                ", lastCalls=" + String.join("\r\n", Arrays.toString(lastCalls)) +
                '}';
    }
}
