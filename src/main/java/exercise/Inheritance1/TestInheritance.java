package main.java.exercise.Inheritance1;

public class TestInheritance {
    public static void main(String[] args) {
        Staff developer = new Developer("Edi", 39, Gender.MALE, "Java");
        Staff accountant = new Accountant("Anca", 39, Gender.FEMALE, "Expert Accountant");
        Staff ceo = new CEO("Alpar", 20, Gender.MALE, 1_000_000_000);
        System.out.println(developer);
        System.out.println(accountant);
        System.out.println(ceo);
    }
}
