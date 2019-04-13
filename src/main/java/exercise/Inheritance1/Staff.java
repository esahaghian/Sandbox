package main.java.exercise.Inheritance1;

public class Staff extends Person {
    private String title;

    public Staff(String name, int age, Gender gender, String title) {
        super(name, age, gender);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void setWorkPlace(String workPlace) {

    }

    @Override
    public String getWorkPlace() {
        return null;
    }

    @Override
    public void setSalary(int salary) {

    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                '}' + super.toString();
    }
}
