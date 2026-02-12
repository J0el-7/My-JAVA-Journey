package section2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digit two numbers:");

        Scanner sc = new Scanner(System.in);

        int a =  sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println("Soma = " + sum);

        sc.close();
    }
}
