package main.java.exercise;

public class MaxHeartRateCalculators {
    public static void main(String[] args) {
       int age = 20;
        System.out.println(getHrMaxOne(age));
        System.out.println(getHrMaxTwo(age));
        System.out.println(getHrMaxThree(age));
    }

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
     * Returns max heart rate for given age;
     * (191.5 - (0.007 * age^2))
     *
     * @param age
     * @return result of first max heart rate formula
     */
    private static double getHrMaxOne(int age) {
        return 191.5 - (0.007 * getPwrTwo(age));
    }

    /**
     * Returns max heart rate for given age;
     * (206.9 - (0.67 * age))
     *
     * @param age
     * @return result of second max heart rate formula
     */
    private static double getHrMaxTwo(int age) {
        return 206.9 - (0.67 * age);
    }

    /**
     * Returns max heart rate for given age;
     * (163 + (1.16 * age) - (0.018 * (age^2))
     *
     * @param age
     * @return result of thrid max heart rate formula
     */
    private static double getHrMaxThree(int age) {
        return 163 + (1.16 * age) - (0.018 * getPwrTwo(age));
    }
}

