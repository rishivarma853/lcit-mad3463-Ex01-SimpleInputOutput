import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int CUR_YEAR = 2022;
        System.out.print("\n Enter your Age :   ");
        int age = scan.nextInt();
        System.out.println("\n Your birth year is :  " + (CUR_YEAR - age));
    }
}