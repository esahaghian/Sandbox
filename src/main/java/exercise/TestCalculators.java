package main.java.exercise;

import java.util.ArrayList;
import java.util.List;

import static main.java.exercise.calculators.bmi.BodyMassIndexCalculator.bmiCalculator;
import static main.java.exercise.calculators.bmr.BasalMetabolicRateCalculator.getBmr;
import static main.java.exercise.calculators.bmr.BasalMetabolicRateCalculator.getCalories;
import static main.java.exercise.calculators.maxheartrate.MaxHeartRateCalculators.*;

public class TestCalculators {
    public static void main(String[] args) {
        Person edi = new Person("Edi", 90, 178, 40, Person.Gender.MALE, ActivityLevel.SEDENTARY);
        Person alpar = new Person("Alpar", 74, 170, 31, Person.Gender.MALE, ActivityLevel.SEDENTARY);
        Person raluca = new Person("Raluca", 62, 163, 34, Person.Gender.FEMALE, ActivityLevel.LIGHTLY_ACTIVE);
        Person anca = new Person("Anca", 61, 165, 40, Person.Gender.FEMALE, ActivityLevel.MODERATELY_ACTIVE);
        Person eric = new Person("Eric", 18, 110, 4, Person.Gender.MALE, ActivityLevel.SUPER_ACTIVE);

        List<Person> personList = new ArrayList<>();
        personList.add(edi);
        personList.add(alpar);
        personList.add(raluca);
        personList.add(anca);
        personList.add(eric);


        for (Person person : personList) {
            double bmrResult = getBmr(person);
            double caloriesResult = getCalories(person);

            StringBuilder stringBuilder = new StringBuilder("Person's name: " + person.getName());
            stringBuilder.append("\n");
            stringBuilder.append("BMI Classification: " + bmiCalculator(person));
            stringBuilder.append("\n");
            stringBuilder.append("Max Heart Rate based on 3 formulas:");
            stringBuilder.append("\n\t Formula 1 = " + getHrMaxOne(person));
            stringBuilder.append("\n\t Formula 2 = " + getHrMaxTwo(person));
            stringBuilder.append("\n\t Formula 3 = " + getHrMaxThree(person));
            stringBuilder.append("\n");
            stringBuilder.append("BMR = " + bmrResult);
            stringBuilder.append("\n");
            stringBuilder.append("Necesar calorii zilnice = " + caloriesResult);

            System.out.println(stringBuilder.toString());
        }
    }
}
