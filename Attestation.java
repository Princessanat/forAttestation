import java.util.Scanner;
import java.util.stream.IntStream;

//Напишите программу, которая принимает на вход два разных целых числа и выводит:
//сумму этих чисел;
//разницу между этими числами (разница между 4 и 5 равна 1, разница между 6 и 1 равна 5);
//ряд цифр от минимального из этих чисел до максимального (например, введено 1 и 5, выведется
//ряд 1 2 3 4 5 или 6 и 3,выведется ряд 3 4 5 6).
public class Attestation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два разных целых числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int summ = a + b;
        System.out.println("Cумма чисел = " + summ);
        int sub = a - b;
        System.out.println("Разница между числами = " + sub);
        for (int i = b; i <= a; i++) {
            System.out.println("Последовательность чисел = "+" "+ i);
            {
            }
        }
    }
}