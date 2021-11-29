package operatorpack;

import java.util.Scanner;

public class Operators5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b-ni daxil edin");
        int b = sc.nextInt();

        int c = (a>b)?1000:1010;

        System.out.println(c);
    }
}
