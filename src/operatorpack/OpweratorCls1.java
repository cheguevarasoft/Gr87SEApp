package operatorpack;

import java.util.Scanner;

public class OpweratorCls1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b-ni daxil edin");
        int b = sc.nextInt();

        int netice = a%b;

        System.out.println(netice);
    }
}
