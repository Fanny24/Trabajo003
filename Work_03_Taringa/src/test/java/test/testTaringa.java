package test;

import pom.landingTaringaPOM;
import driver.driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class testTaringa {

    driver Driver = null;
    WebElement we = null;
    //@FindBy(xpath="")

    @BeforeClass
    public void setupEnv() {
        Driver = new driver();

      //  driver.manage().window().maximize();
     //   driver.get("https://www.taringa.net/");

    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting Testing Taringa");
    }

    @Test (priority = 0, testName= "Primer test case")
    public  void taringaBasicTest() throws InterruptedException {
        //public static void taringaBasicTest(String[] args) throws InterruptedException {
        Driver = new driver();
        Driver.goto_url("https://taringa.net");

        landingTaringaPOM ltpom = new landingTaringaPOM();
        ltpom.testTitle(Driver);

        System.out.println("Logueo Satisfactorio");

    }

    @Test (priority = 1, testName= "Segundo test case")
    public  void taringaBasicTest02() throws InterruptedException {
        Driver = new driver();
        Driver.goto_url("https://taringa.net");

        landingTaringaPOM ltpom = new landingTaringaPOM();
        ltpom.testTitle02(Driver);

        System.out.println("Nuevo Artículo Verificado");

    }

    @Test (priority = 2, testName= "Tercer test case")
    public  void taringaBasicTest03() throws InterruptedException {
        Driver = new driver();
        Driver.goto_url("https://taringa.net");

        landingTaringaPOM ltpom = new landingTaringaPOM();
        ltpom.testTitle03(Driver);

        System.out.println("Comentario insertado satisfactoriamente");

    }

    @AfterClass
    public void teardown()
    {
        Driver.teardown();
    }
}