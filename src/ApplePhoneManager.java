
public class ApplePhoneManager extends BasePhoneManager {

    @Override
    double phoneBuy(int kacTane) {
        int fiyat = 11000;
        double kdv = 0.18;
         double kdvHesap = fiyat + (fiyat*kdv);

        return kdvHesap ;
    }
}