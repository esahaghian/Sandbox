package main.java.exercise.calculators.maxheartrate;

import main.java.exercise.Person;

public class MaxHeartRateCalculators {

    /**
     * Returns a given number to the power of two.
     *
     * @param number input int
     * @return int to the power of two
     */
    private static int getPwrTwo(int number) {
        return number * number;
    }

    /**
     * Returns max heart rate for given person;
     * (191.5 - (0.007 * person^2))
     *
     * @param person
     * @return result of first max heart rate formula
     */
    public static double getHrMaxOne(Person person) {
        return 191.5 - (0.007 * getPwrTwo(person.getAgeInYears()));
    }

    /**
     * Returns max heart rate for given person;
     * (206.9 - (0.67 * person))
     *
     * @param person
     * @return result of second max heart rate formula
     */
    public static double getHrMaxTwo(Person person) {
        return 206.9 - (0.67 * person.getAgeInYears());
    }

    /**
     * Returns max heart rate for given person;
     * (163 + (1.16 * person.getAgeInYears()) - (0.018 * (person.getAgeInYears()^2))
     *
     * @param person
     * @return result of thrid max heart rate formula
     */
    public static double getHrMaxThree(Person person) {
        return 163 + (1.16 * person.getAgeInYears()) - (0.018 * getPwrTwo(person.getAgeInYears()));
    }
}

