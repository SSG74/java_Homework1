package homework;

import java.util.Scanner;

public class Main {
    //    класс с клиентским кодом
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
//        String enter = Scanner.next();
//        task1.Triangle = (a);
        scanner.close();

        Task1 task1 = new Task1();

        System.out.println("Треугольное число = "+ task1.Triangle(a)+"\n");

        Factor f = new Factor();
        System.out.println("Факториал числа = " + f.Factor(a)+"\n");
    }
}


