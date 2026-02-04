package section2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How old are you?");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println("You have: " + x + " years old.");

        sc.close();
    }
}
