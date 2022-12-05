

public class SamsungPhoneManager extends BasePhoneManager {
    @Override
    double phoneBuy(int kacTane) {
        int fiyat = 5000;
        double kdv = 0.18;
        double kdvHesap = fiyat + (fiyat*kdv);

        return kdvHesap;
    }
}