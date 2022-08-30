package hw1.task2;

/**
 * Класс, который сортирует массив по возрастанию.
 */
public class Main {
    public static void main(String[] args) {

        int[] array1 = {5, 6, 3, 2, 5, 1, 4, 9};
        int[] array2 = {10, 9, 8, 1, 7, 1, 7, 6, 5, 4, 3, 2, 2, 1};

        System.out.print("Исходный  массив array1: ");
        print(array1);
        sort(array1);
        System.out.print("После сортировки array1: ");
        print(array1);

        System.out.print("Исходный  массив array2: ");
        print(array2);
        sort(array2);
        System.out.print("После сортировки array2: ");
        print(array2);


    }

    /**
     * Сортировка массива методом вставки
     *
     * @param array массив
     */
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int k = i - 1;
            for (; k >= 0; k--) {
                if (value < array[k]) {
                    array[k + 1] = array[k];
                } else {
                    break;
                }
            }
            array[k + 1] = value;
        }
    }

    /**
     * Вывод в консоль (печать) массива
     *
     * @param array массив
     */
    private static void print(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}