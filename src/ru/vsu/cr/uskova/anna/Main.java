package ru.vsu.cr.uskova.anna;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое неотрицательное число number:");
        int number = sc.nextInt();
        int countOfNumber = count(number);
        int sum = sumUpDigitsInNumber(number, countOfNumber);
        printAnswer(countOfNumber, sum);
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



