package main.java.exercise;

import static main.java.exercise.calculators.bmi.BodyMassIndexCalculator.bmiCalculator;
import static main.java.exercise.calculators.bmr.BasalMetabolicRateCalculator.getBmr;
import static main.java.exercise.calculators.bmr.BasalMetabolicRateCalculator.getCalories;
import static main.java.exercise.calculators.maxheartrate.MaxHeartRateCalculators.*;

public class TestCalculators {
    public static void main(String[] args) {
        Person edi = new Person("Edi",90, 178, 40, Person.Gender.MALE, ActivityLevel.SEDENTARY);

        double bmrResult = getBmr(edi);
        double caloriesResult = getCalories(edi);

        StringBuilder stringBuilder = new StringBuilder("Person's name: " + edi.getName());
        stringBuilder.append("\n");
        stringBuilder.append("BMI Classification: " + bmiCalculator(edi));
        stringBuilder.append("\n");
        stringBuilder.append("Max Heart Rate based on 3 formulas:");
        stringBuilder.append("\n\t Formula 1 = " + getHrMaxOne(edi));
        stringBuilder.append("\n\t Formula 2 = " + getHrMaxTwo(edi));
        stringBuilder.append("\n\t Formula 3 = " + getHrMaxThree(edi));
        stringBuilder.append("\n");
        stringBuilder.append("BMR = " + bmrResult);
        stringBuilder.append("\n");
        stringBuilder.append("Necesar calorii zilnice = " + caloriesResult);

        System.out.println(stringBuilder.toString());
    }
}
