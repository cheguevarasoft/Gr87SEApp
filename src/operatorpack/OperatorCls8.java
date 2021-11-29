package operatorpack;

import java.util.Scanner;

public class OperatorCls8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("gunu daxil edin");
        int gun = sc.nextInt();

        switch(gun){

            case 1:
            case 2:
                System.out.println("ChA");
                break;
            case 3:
                System.out.println("Ch");
                break;
            case 4:
                System.out.println("CA");
                break;
            case 5:
                System.out.println("C");
                break;
            case 6:
                System.out.println("Shenbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Bele gun yoxdur");
                break;
        }
    }
}
