package hw1.task1;

import static hw1.task1.Main.*;

public class Test {
    public static void main(String[] args) throws AssertionError {
        testMax();
        testMin();
        testAvg();
        System.out.println("Тесты успешно пройдены");
    }

    /**
     * Проверка максимального значения
     */
    public static void testMax() throws AssertionError {
        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int maxValue = findMax(numbers);
        System.out.println("test maxValue " + maxValue);
        assert maxValue == 25 : "Тест на максимальное значение не пройден";
    }

    /**
     * Проверка минимального значения
     */
    public static void testMin() throws AssertionError {
        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int minValue = findMin(numbers);
        System.out.println("test minValue " + minValue);
        assert minValue == 1 : "Тест на минимальное значение не пройден";
    }



    /**
     * Проверка на среднее значение
     */
    public static void testAvg() throws AssertionError {
        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        double average = findAverage(numbers);
        System.out.println("test average " + average);
        assert average == 13 : "Тест на среднее значение не пройден";
    }
}

