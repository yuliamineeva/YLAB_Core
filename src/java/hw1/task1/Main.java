package hw1.task1;

/**
 * Класс, который заполняет двумерный массив случайным числами
 * и выводит максимальное, минимальное и среднее значение.
 */
public class Main {

    /**
     * Размер массива
     */
    final static int SIZE = 5;

    public static void main(String[] args) {

        System.out.println("Массив случайных чисел: ");
        int[][] numbers = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                numbers[i][j] = getRandom(i, j);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        int max = findMax(numbers);
        int min = findMin(numbers);
        double average = findAverage(numbers);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Average = " + average);
   }

    /**
     * Получение случайного числа
     *
     * @param i номер строки массива
     * @param j номер столбца массива
     * @return случайное число
     */
    public static int getRandom(int i, int j) {
        int num1 = 100;
        int num2 = 42;
        int num3 = 16;
        int num4 = 5;
        int num5 = 18;
        long currentTime = System.currentTimeMillis() - (j + i * j + i * num2 + j * num3 + j * i * num4);
        return (int) (currentTime % num1 - num5);
    }

    /**
     * Поиск максимального значения
     *
     * @param numbers массив
     * @return максимальное число
     */
    public static int findMax(int[][] numbers) {
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Поиск минимального значения
     *
     * @param numbers массив
     * @return минимальное число
     */
    public static int findMin(int[][] numbers) {
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }
        return min;
    }

    /**
     * Поиск среднего значения
     *
     * @param numbers массив
     * @return среднее число
     */
    public static double findAverage(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        return sum / (numbers.length * numbers[0].length);
    }

}
