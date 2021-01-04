package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingTaringaPage {

    public driver Driver = null; // corrección
    public WebDriver driver = null;

    @FindBy(xpath = "//*[@id=\"content\"]/div/header/nav/div/div[2]/ul[2]/li[3]/button")
    WebElement ingresarButton;

    @FindBy(name = "id") //method used to find WebElement, in that case Id
    WebElement userTextbox;

    @FindBy(name = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div/section/form/button")
    WebElement loginButton;

    //adicional para comprobar acceso despues de loguin
    @FindBy(xpath = "//*[@id=\"content\"]/div/header/nav/div/div[2]/ul[2]/li[3]/span")
    WebElement AccesCorrecto;

    @FindBy(xpath = "//*[@id=\"content\"]/div/header/nav/div/div[2]/ul[1]/li[1]")
    WebElement BtnHome;

    @FindBy(xpath = "//*[@id=\"content\"]/div/header/nav/div/div[2]/ul[1]/li[2]")
    WebElement BtnMiIt;

    @FindBy(xpath = "//*[@id=\"content\"]/div/header/nav/div/div[2]/ul[1]/li[3]")
    WebElement BtnGlobal;

    @FindBy(xpath ="//*[@id=\"content\"]/div/header/nav/div/div[2]/ul[1]/li[4]")
    WebElement BtnJuegos;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div[1]/section[1]/div[1]/div/div[1]/div/div/button")
    WebElement BtnArticulo ;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div/main/div/div[2]/div[2]/input")
    WebElement TextTitulo;

    @FindBy(xpath = "//*[@id=\"richPublisher\"]/div/div[2]/div/div/div/div/div/div/div/span")
    WebElement TextContenido;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div/aside/div[1]/div[2]/button[1]")
    WebElement BtnPublicar;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/div/main/div[1]/div[3]/div/div/div[2]/div/a/img")
    WebElement ObsArticulo;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/div/main/div[1]/article/div[1]/div/header/div[1]/h1")
    WebElement VerifTitulo;

    @FindBy(xpath = "//*[@id=\"story-content\"]/div[1]/div/p")
    WebElement VerifContenido;

    //acceder con google :(
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div/section/form/div[6]/div[2]/button[1]")
    WebElement BtnGoogle;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div[1]/section[1]/div[2]/div/section[1]/h2/div")
    WebElement SeccionTops;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div[1]/section[1]/div[2]/div/section[1]/div/div[4]")
            ////*[@id="content"]/div/div[5]/main/div[1]/section[1]/div[2]/div/section[1]/div/div[4]
    WebElement PestaniaMes;

    @FindBy (xpath = "//*[@id=\"content\"]/div/div[5]/main/div[1]/section[1]/div[2]/div/section[1]/ul/li[1]/a/div[1]")
    WebElement PrimerArtic;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/div/main/div[1]/section/div/div[2]/div/div[1]/div/textarea")
    WebElement textComentario;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/div/main/div[1]/section/div/div[2]/div/div[2]/button")
    WebElement BtnEnviarComent;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/div/main/div[1]/section/div/div[3]/div[1]/article/div[2]/div[2]/div[2]/div/div[1]/div[1]/button")
    WebElement BtnUpvote;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/div/main/div[1]/section/div/div[3]/div[1]/article/div[2]/div[2]/div[2]/div/div[1]/div[1]/button/span")
    WebElement NroVotos;

    //si logueo es incorrecto
    // @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div/section/form/div[3]/div/span")
    // WebElement noAccedeMsg;

    public landingTaringaPage(driver driver) {  //****agreg
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }


    public void runexample(String username, String password){
        // login method prepared according to Page Object Pattern
        ingresarButton.click();
        userTextbox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
        System.out.println(AccesCorrecto.isDisplayed());
        System.out.println(AccesCorrecto.getText());
        System.out.println(BtnHome.isDisplayed());
        System.out.println(BtnMiIt.isDisplayed());
        System.out.println(BtnGlobal.isDisplayed());
        System.out.println(BtnJuegos.isDisplayed());
        //System.out.println(noAccedeMsg.isDisplayed());
       // System.out.println(noAccedeMsg.getText());

        // because WebElements were declared with @FindBy, we can use them without
        // driver.find() method
    }
    public void runexample02(String username, String password, String titulo,String contenido){
        ingresarButton.click();
        userTextbox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
        System.out.println(AccesCorrecto.isDisplayed());
        System.out.println(AccesCorrecto.getText());
        BtnArticulo.click();
        TextTitulo.sendKeys(titulo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TextContenido.sendKeys(contenido);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BtnPublicar.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ObsArticulo.click();

        System.out.println(VerifTitulo.isDisplayed());
        System.out.println(VerifTitulo.getText());
        System.out.println(VerifContenido.isDisplayed());
        System.out.println(VerifContenido.getText());

    }

    public void runexample03(String username, String password, String comentario){
        ingresarButton.click();
        userTextbox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
        System.out.println(AccesCorrecto.isDisplayed());
        System.out.println(AccesCorrecto.getText());
//3ra part
        System.out.println(SeccionTops.isDisplayed());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PestaniaMes.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PrimerArtic.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        textComentario.sendKeys(comentario);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BtnEnviarComent.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BtnUpvote.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(textComentario.getText());
        System.out.println(NroVotos.getText());

    }

}