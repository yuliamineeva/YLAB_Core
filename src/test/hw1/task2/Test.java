package hw1.task2;

import java.util.Arrays;

import static hw1.task2.Main.sort;

public class Test {
    public static void main(String[] args) throws AssertionError {
        testSort();
        System.out.println("Тест пройден");
    }

    /**
     * Проверка на правильность сортировки
     */
    public static void testSort() throws AssertionError {
        int[] array = {5, 4, 3, 2, 1, 1};
        sort(array);
        int[] sortArray = {1, 1, 2, 3, 4, 5};
        assert Arrays.equals(array, sortArray) : "Тест на сортировку не пройден";
    }

}
