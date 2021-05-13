// Составить алгоритм: если введенное имя совпадает с Вячеслав,то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"

package by.andersen.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;

        try(Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите имя:");
            name = scanner.nextLine().toUpperCase();
        }

        if (name.equals("ВЯЧЕСЛАВ")){
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }

    }
}
