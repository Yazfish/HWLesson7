// Домашняя работа 7, массивы.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
//

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 \n");
        System.out.println("Пример А. Вариант 1 \n");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("\nПример А. Вариант 2 \n");
        int[] numbersVerse2 = new int[3];
        numbersVerse2[0] = 1;
        numbersVerse2[1] = 2;
        numbersVerse2[2] = 3;
        for (int i = 0; i < numbersVerse2.length; i++) {
            System.out.println(numbersVerse2[i]);
        }
        System.out.println("\nПример А. Вариант 3 \n");
        int[] numbersVerse3 = new int[3];
        for (int i = 0; i < numbersVerse3.length; i++) {
            numbersVerse3[i] = i + 1;
            System.out.println(numbersVerse3[i]);
        }
        System.out.println("\nПример B. Вариант 1 \n");
        double[] floatNumbers = {1.57d, 7.654d, 9.986d};
        for (int i = 0; i < floatNumbers.length; i++) {
            System.out.println(floatNumbers[i]);
        }
        System.out.println("\nПример B. Вариант 2 \n");
        double[] floatNumbersVerse2 = {1.57d, 7.654d, 9.986d};
        System.out.println(Arrays.toString(floatNumbersVerse2));

        System.out.println("\nПример C \n");
        int[] index = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Задача 2 \n");
        for (int testAverse1 = 0; testAverse1 < numbers.length; testAverse1++) {
            if (testAverse1 == numbers.length - 1) {
                System.out.println(numbers[testAverse1]);
                break;
            }
            System.out.print(numbers[testAverse1] + ", ");
        }
        for (int testBverse1 = 0; testBverse1 < floatNumbers.length; testBverse1++) {
            if (testBverse1 == floatNumbers.length - 1) {
                System.out.println(floatNumbers[testBverse1]);
                break;
            }
            System.out.print(floatNumbers[testBverse1] + ", ");
        }
        for (int testC = 0; testC < index.length; testC++) {
            if (testC == index.length - 1) {
                System.out.println(index[testC]);
                break;
            }
            System.out.print(index[testC] + ", ");
        }
        System.out.println("\n Задача 3 \n");
        for (int testAverse1 = 2; testAverse1 < numbers.length; testAverse1--) {
            if (testAverse1 == numbers.length - 3) {
                System.out.println(numbers[testAverse1]);
                break;
            }
            System.out.print(numbers[testAverse1] + ", ");
        }
        for (int testBverse1 = 2; testBverse1 < floatNumbers.length; testBverse1--) {
            if (testBverse1 == floatNumbers.length - 3) {
                System.out.println(floatNumbers[testBverse1]);
                break;
            }
            System.out.print(floatNumbers[testBverse1] + ", ");
        }
        for (int testC = 9; testC < index.length; testC--) {
            if (testC == index.length - 10) {
                System.out.println(index[testC]);
                break;
            }
            System.out.print(index[testC] + ", ");
        }
        System.out.println("\n Задача 4 \n");
        int[] code = {1, 2, 3};
        for (int y = 0; y < code.length; y++) {
            if (code[y] % 2 != 0)
            {
                code[y] = code[y] + 1;
            }
        }
                System.out.print(Arrays.toString(code));
            }
        }




