package exercise2;

public class Call {
    private int duration;
    private String phoneNumber;

    public Call(String phoneNumber, int duration) {
        this.duration = duration;
        this.phoneNumber = phoneNumber;

    }

    public int getDuration() {
        return duration;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Call{" +
                "duration=" + duration +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
