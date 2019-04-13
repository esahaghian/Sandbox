package main.java.exercise.inheritance;

public class CEO extends Staff {
    private int netWorth;

    public CEO(String name, int age, Gender gender, int netWorth) {
        super(name, age, gender, "CEO");
        this.netWorth = netWorth;
    }

    @Override
    public String toString() {
        return "CEO{" +
                "netWorth=" + netWorth +
                '}' + super.toString();
    }
}
