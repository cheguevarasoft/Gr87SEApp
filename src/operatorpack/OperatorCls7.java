package operatorpack;

import java.util.Scanner;

public class OperatorCls7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("adi daxil edin");
        String ad = sc.nextLine();
        String soyad = "";

        if(ad.equals("Maqa")){
            soyad = "Ramzanov";

        }else if(ad.equals("Ismayil")){
            soyad = "Arabov";
        }else if(ad.equals("Emil")){
            soyad = "Muradzade";
        }else{
            System.out.println("bele soyad yoxdur");
        }

        System.out.println(soyad);
    }



}
