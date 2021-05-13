//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

package by.andersen.task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;

        try (Scanner scanner = new Scanner(System.in)){        
            System.out.println("Введите целое число:");
            while (!scanner.hasNextInt()){
                scanner.next();
                System.out.println("Введенная строка не является целым числом. " +
                        "Попробуйте ввести число еще раз.");              
            }
            num = scanner.nextInt();
        }

        if (num > 7){
            System.out.println("Привет");
        }

    }
}
