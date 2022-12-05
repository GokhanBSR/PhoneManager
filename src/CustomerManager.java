import java.util.Scanner;

public class CustomerManager {
    BasePhoneManager basePhoneManagerApple;
    BasePhoneManager basePhoneManagerHuawei;
    BasePhoneManager basePhoneManagerSamsung;
    void phoneBuy (){
        System.out.println("Welcome to Phone Buy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("------------\n-> Phone Price Calculation \n ------------");
        System.out.println("-> Choose A Phone:");

        Scanner scanner1 = new Scanner(System.in);
        int sayi;
        sayi = scanner1.nextInt();

            if (sayi >0 && sayi <4){

        } if (sayi == 1) {
            int ekle=200;
            System.out.println("-> Iphone " + " Price You'll Pay:" +basePhoneManagerApple.phoneBuy (sayi) + " (Kdv Dahil)"  + "  +  " + ekle +  "TL Lüks Tüketim Vergisi "   );
        }
        else if (sayi == 2) {
            System.out.println("-> Samsung " + " Price You'll Pay:" +basePhoneManagerSamsung.phoneBuy (sayi) +"TL (Kdv Dahil)" );
        }
        else if (sayi == 3){
            System.out.println("-> Huawei " +  " Price You'll Pay:" +basePhoneManagerHuawei.phoneBuy (sayi)+ "TL (Kdv Dahil)");
        }
        else {
                System.out.println("Doğru Seçim Yapmadınız " + " Lütfen 3 Markadan Birini Seçiniz");

        }
        }
    }

