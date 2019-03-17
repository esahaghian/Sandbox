package main.java.exercise;

import java.text.DecimalFormat;

import static main.java.exercise.calculators.bmi.BodyMassIndexCalculator.bmiEvaluator;
import static main.java.exercise.calculators.bmr.BasalMetabolicRateCalculator.getBmr;
import static main.java.exercise.calculators.bmr.BasalMetabolicRateCalculator.getCalories;
import static main.java.exercise.calculators.maxheartrate.MaxHeartRateCalculators.*;

public class TestCalculators {
    public static void main(String[] args) {
        // bmi = kg/m2
        int weightInKgs = 130;
        double heightInMeters = 1.78;
        double pwrTwo = (heightInMeters * heightInMeters);
        double bmi = weightInKgs / pwrTwo;

        System.out.println(bmiEvaluator(bmi));
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("BMI Value: " + f.format(bmi));

        int age = 20;
        System.out.println(getHrMaxOne(age));
        System.out.println(getHrMaxTwo(age));
        System.out.println(getHrMaxThree(age));

        Person edi = new Person(90, 178, 40, Person.Gender.MALE, ActivityLevel.SEDENTARY);
        double bmrResult = getBmr(edi);
        double caloriesResult = getCalories(edi);
        System.out.println("BMR = " + bmrResult);
        System.out.println("Necesar calorii zilnice = " + caloriesResult);
    }
}
