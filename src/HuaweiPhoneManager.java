

public class HuaweiPhoneManager extends BasePhoneManager {
    @Override
    double phoneBuy(int kacTane) {
        int fiyat = 4000;
        double kdv = 0.18;
        double kdvHesap = fiyat - (fiyat*0.25 ) + (fiyat*kdv);

        return kdvHesap ;
    }
}