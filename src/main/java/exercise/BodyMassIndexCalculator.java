package main.java.exercise;

import java.text.DecimalFormat;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        // bmi = kg/m2
        int weightInKgs = 130;
        double heightInMeters = 1.78;
        double pwrTwo = (heightInMeters * heightInMeters);
        double bmi = weightInKgs / pwrTwo;

        System.out.println(bmiEvaluator(bmi));
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("BMI Value: " + f.format(bmi));
    }

    private static String bmiEvaluator(double bmi) {
          if (bmi <= 15) {
            return "Very severely underweight";
        } else if (bmi <= 16 && bmi > 15) {
            return "Severely underweight";
        } else if (bmi <= 18.5 && bmi > 16) {
            return "Underweight";
        } else if (bmi <= 25 && bmi > 18.5) {
            return "Normal (healthy weight)";
        } else if (bmi <= 30 && bmi > 25) {
            return "Overweight";
        } else if (bmi <= 35 && bmi > 30) {
            return "Obese Class I (Moderately obese)";
        } else if (bmi <= 40 && bmi > 35) {
            return "Obese Class II (Severely obese)";
        } else if (bmi <= 45 && bmi > 40) {
            return "Obese Class III (Very severely obese)";
        } else if (bmi <= 50 && bmi > 45) {
            return "Obese Class IV (Morbidly Obese)";
        } else if (bmi <= 60 && bmi > 50) {
            return "Obese Class V (Super Obese)";
        } else if (bmi > 60) {
            return "Obese Class VI (Hyper Obese)";
        } else {
            return "";
        }
    }
}
