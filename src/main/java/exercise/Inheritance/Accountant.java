package main.java.exercise.Inheritance;

public class Accountant extends Staff {
    private String qualification;

    public Accountant(String name, int age, Gender gender, String qualification) {
        super(name, age, gender, "Accountant");
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "qualification='" + qualification + '\'' +
                '}' + super.toString();
    }
}
