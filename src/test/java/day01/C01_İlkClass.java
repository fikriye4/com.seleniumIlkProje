package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_İlkClass {
    public static void main(String[] args) {
        //En ilkel haliyle bir otomasyom yapmak için
        //Class'ıza otomasyon için gerekli olan webdriwer
        //yerini göstermemiz gerekir
        //bunun için Java kutuphanesinden System.setProperty()kullanırız
        //method iki parametre istiyor
        //ilki kullanacagımız driver:Webdriver ,chrome,driver
        //ikincisi ise bu driverin fiziki yolu:
    System.setProperty("webdriver.chrome,driver","src/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }


}
