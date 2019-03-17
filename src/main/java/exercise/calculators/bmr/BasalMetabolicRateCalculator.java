package main.java.exercise.calculators.bmr;

import main.java.exercise.Person;

public class BasalMetabolicRateCalculator {

    //@formatter:off
    public static double getCalories(Person person) {
        switch (person.getActivityLevel()) {
            case SEDENTARY:
                return getBmr(person) * 1.2;
            case LIGHTLY_ACTIVE:
                return getBmr(person) * 1.375;
            case MODERATELY_ACTIVE:
                return getBmr(person) * 1.55;
            case VERY_ACTIVE:
                return getBmr(person) * 1.725;
            case SUPER_ACTIVE:
                return getBmr(person) * 1.9;
        }
        throw new UnsupportedOperationException("Incorrect activity level");
    }

    public static double getBmr(Person person) {
        switch (person.getGender()) {
            case MALE:
                return getMaleBmr(person.getWeightInKgs(), person.getHeightInCm(), person.getAgeInYears());
            case FEMALE:
                return getFemaleBmr(person.getWeightInKgs(), person.getHeightInCm(), person.getAgeInYears());
        }
        throw new UnsupportedOperationException("Incorrect gender");
    }

    //@formatter:on
    private static double getMaleBmr(int weightInKgs, int heightInCm, int ageInYears) {
        return 66 + (13.7 * weightInKgs) + (5 * heightInCm) - (6.8 * ageInYears);
    }

    private static double getFemaleBmr(int weightInKgs, int heightInCm, int ageInYears) {
        return 655 + (9.6 * weightInKgs) + (1.8 * heightInCm) - (4.7 * ageInYears);
    }

}

