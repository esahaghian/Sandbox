package main.java.exercise.Inheritance1;

public class Developer extends Staff {
    private String specialty;

    public Developer(String name, int age, Gender gender, String specialty) {
        super(name, age, gender, "Developer");
        this.specialty = specialty;

    }

    @Override
    public String toString() {
        return "Developer{" +
                "specialty='" + specialty + '\'' +
                '}' + super.toString();
    }
}
