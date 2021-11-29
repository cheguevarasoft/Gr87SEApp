package operatorpack;

import java.util.Scanner;

public class OperatorCls5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b-ni daxil edin");
        int b = sc.nextInt();

        String c = (a>b)?"duzdur":"Sehvdir";

        System.out.println(c);
    }
}
