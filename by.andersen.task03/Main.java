//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

package by.andersen.task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numsList = new ArrayList<>();
        int number;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число, которое вы хотите добавить в массив." +
                    "Чтобы остановить выполнение программы и увидеть результат, введите число 0");

            while (true) {
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("Введенная строка не является целым числом. " +
                            "Попробуйте ввести число еще раз.");
                }

                number = scanner.nextInt();

                if (number == 0) {
                    break;
                }

                numsList.add(number);

            }
        }

           for (Integer num : numsList){
               if (num % 3 == 0){
                   System.out.println(num);
               }
           }


    }

}
