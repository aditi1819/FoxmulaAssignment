package Assignment2;
import java.util.Scanner;
import java.util.*;
public class ksum_array {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        System.out.println("Enter the required sum : ");
        int sum = sc.nextInt();

        ksum t = new ksum(s1,s2,s3,s4,s5);

        t.logic(sum);

        sc.close();
    }
}