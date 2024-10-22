package org.example;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
            int[] numbers = new int[20];
            Random random = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = 2 * (random.nextInt(50) + 1);
            }
            System.out.println("Массив: " + Arrays.toString(numbers));
            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();

            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);

            int sum = 0;
            int count = 0;

            for (int number : numbers) {
                if (number != min && number != max) {
                    sum += number;
                    count++;
                }
            }
            double average = (double) sum / count;

            System.out.println("Среднее арифметическое: " + average);
        }
    }
