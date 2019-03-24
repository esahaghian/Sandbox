package main.java.exercise;

public class Person {
    public enum Gender {
        FEMALE,
        MALE;
    }

    private String name;
    private int weightInKgs;
    private int heightInCm;
    private int ageInYears;
    private Gender gender;
    private ActivityLevel activityLevel;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int weightInKgs, int heightInCm, int ageInYears, Gender gender, ActivityLevel activityLevel) {
        this(name);
        this.weightInKgs = weightInKgs;
        this.heightInCm = heightInCm;
        this.ageInYears = ageInYears;
        this.gender = gender;
        this.activityLevel = activityLevel;
    }

    public String getName() {
        return name;
    }

    public void setWeightInKgs(int weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public int getWeightInKgs() {
        return weightInKgs;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weightInKgs=" + weightInKgs +
                ", heightInCm=" + heightInCm +
                ", ageInYears=" + ageInYears +
                ", gender=" + gender +
                ", activityLevel=" + activityLevel +
                '}';
    }
}
