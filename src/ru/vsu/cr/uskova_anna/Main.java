package ru.vsu.cr.uskova_anna;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int number = readNumber();
        int countOfNumber = count(number);
        int sum = sumUpDigitsInNumber(number, countOfNumber);
        printAnswer(countOfNumber, sum);
    }

    private static int readNumber() {
        System.out.println("Введите целое число number:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value < 0) {
            System.out.println("Данные не корректны, введённое число number меньше 0");
            System.exit(0);
        }
        return value;
    }

    private static int count(int number) {
        int countOfNumber=0;
        while (number > 0) {
            ++countOfNumber;
            number /= 10; //считаем количество цифр в числе
        }
        return (countOfNumber);
    }

    private static int sumUpDigitsInNumber(int number, int countOfNumber) {
        int sum = 0;
        if  (countOfNumber <= 3) {
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        else {
            sum = (number % 10) + ((number / 10) % 10) + ((number / 100) % 10);
        }
        return(sum);
    }

    private static void printAnswer(int countOfNumber, int sum) {
        if (countOfNumber <= 3) {
            System.out.println("Сумма всех цифр =" + sum);
        }
        else {
            System.out.println("Сумма последних 3 цифр =" + sum);
        }
    }
}
