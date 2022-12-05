/**
 * @author gokhanbasara
 * @date 13.11.2022
 *
 */

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        customerManager.basePhoneManagerSamsung = new SamsungPhoneManager();
        customerManager.basePhoneManagerApple= new ApplePhoneManager();
        customerManager.basePhoneManagerHuawei = new HuaweiPhoneManager();

        customerManager.phoneBuy();
    }

}