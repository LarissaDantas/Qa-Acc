package page;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


public class Page {

    static WebDriver driver;

    private static String Url = "http://sampleapp.tricentis.com/101/app.php";
    private static String selectMake = "#make";
    private static String selectMakeFord = "//*[@id='make']/option[4]";
    private static String inputKW = "#engineperformance";
    private static String menuAutomovel = "div[class='main-navigation'] a[id='nav_automobile']";
    private static String prevCalendar = "//*[@id='ui-datepicker-div']/div/a[1]";
    private static String calendar = "#opendateofmanufacturecalender";
    private static String dateCalendar = "//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a";
    private static String selectSeats = "//*[@id='numberofseats']/option[5]";
    private static String selectFuel = "//*[@id='fuel']/option[2]";
    private static String inputListPrice = "//*[@id='listprice']";
    private static String inputAnnualMileage = "//*[@id='annualmileage']";
    private static String btnNextInsurantData = "//*[@id='nextenterinsurantdata']";
    private static String inputFirstName = "#firstname";
    private static String inputLastname = "#lastname";
    private static String inputbirthdate = "//*[@id='birthdate']";
    private static String selectOccupation = "//*[@id='occupation']/option[3]";
    private static String inputZipcode = "#zipcode";
    private static String checkBungee = "//*[@id='insurance-form']/div/section[2]/div[10]/p/label[2]/span";
    private static String btnNextEnterproductdata = "//*[@id='nextenterproductdata']";
    private static String inputStartdate = "//*[@id='startdate']";
    private static String selectInsurancesum = "//*[@id='insurancesum']/option[2]";
    private static String selectMeritrating = "//*[@id='meritrating']/option[6]";
    private static String selectDamageInsurance = "//*[@id='damageinsurance']/option[3]";
    private static String checkEuroProtection = "//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/span";
    private static String selectCourtesycar = "//*[@id='courtesycar']/option[2]";
    private static String buttonNextSelectPriceOption = "//*[@id='nextselectpriceoption']";
    private static String selectSelectPlatinum = "//*[@id='priceTable']/tfoot/tr/th[2]/label[1]/span";
    private static String buttonNextSendQuote = "//*[@id='nextsendquote']";
    private static String inputEmail = "//*[@id='email']";
    private static String inputUsername = "//*[@id='username']";
    private static String inputPassword = "//*[@id='password']";
    private static String inputConfirmPassaword = "//*[@id='confirmpassword']";
    private static String inputSendEmail = "//*[@id='sendemail']";
    private static String mensage = "//div[@class=\'sweet-alert showSweetAlert visible']/h2";


    public Page(WebDriver driver) {
        Page.driver = driver;
    }


    public void accessUrl() throws IOException{
        Page.driver.get(Url);
    }

    public void ValidateMessage(String messageSucess){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mensage)));
        WebElement element = driver.findElement(By.xpath(mensage));
        String text = element.getText();
        Assert.assertEquals(messageSucess,text);
    }

    public void sendQuote(String Email , String Usarname, String Password, String ConfirmPassword){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, -250);");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputEmail)));
        Page.driver.findElement(By.xpath(inputEmail)).click();
        Page.driver.findElement(By.xpath(inputEmail)).sendKeys(Email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputUsername)));
        Page.driver.findElement(By.xpath(inputUsername)).click();
        Page.driver.findElement(By.xpath(inputUsername)).sendKeys(Usarname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputPassword)));
        Page.driver.findElement(By.xpath(inputPassword)).click();
        Page.driver.findElement(By.xpath(inputPassword)).sendKeys(Password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputConfirmPassaword)));
        Page.driver.findElement(By.xpath(inputConfirmPassaword)).click();
        Page.driver.findElement(By.xpath(inputConfirmPassaword)).sendKeys(ConfirmPassword);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputSendEmail)));
        Page.driver.findElement(By.xpath(inputSendEmail)).click();
    }

    public void selectPriceOption(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, -250);");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectSelectPlatinum)));
        Page.driver.findElement(By.xpath(selectSelectPlatinum)).click();
        jse.executeScript("scrollBy(0,1150)", "");
        Page.driver.findElement(By.xpath(buttonNextSendQuote)).click();
    }


    public void enterProductData(String StartDate){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputStartdate)));
        Page.driver.findElement(By.xpath(inputStartdate)).click();
        Page.driver.findElement(By.xpath(inputStartdate)).sendKeys(StartDate);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectInsurancesum)));
        Page.driver.findElement(By.xpath(selectInsurancesum)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectMeritrating)));
        Page.driver.findElement(By.xpath(selectMeritrating)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectDamageInsurance)));
        Page.driver.findElement(By.xpath(selectDamageInsurance)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(checkEuroProtection)));
        Page.driver.findElement(By.xpath(checkEuroProtection)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectCourtesycar)));
        Page.driver.findElement(By.xpath(selectCourtesycar)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(buttonNextSelectPriceOption)));
        Page.driver.findElement(By.xpath(buttonNextSelectPriceOption)).click();
    }

    public void enterInsuranceData(String firstname, String lastname, String birthdate, String country, String ZipCode){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(inputFirstName)));
        Page.driver.findElement(By.cssSelector(inputFirstName)).click();
        Page.driver.findElement(By.cssSelector(inputFirstName)).sendKeys(firstname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(inputLastname)));
        Page.driver.findElement(By.cssSelector(inputLastname)).click();
        Page.driver.findElement(By.cssSelector(inputLastname)).sendKeys(lastname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputbirthdate)));
        Page.driver.findElement(By.xpath(inputbirthdate)).click();
        Page.driver.findElement(By.xpath(inputbirthdate)).sendKeys(birthdate);
        Page.driver.findElement(By.xpath("//*[@id='country']/option[@value='" + country +"'] ")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectOccupation)));
        Page.driver.findElement(By.xpath(selectOccupation)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(inputZipcode)));
        Page.driver.findElement(By.cssSelector(inputZipcode)).click();
        Page.driver.findElement(By.cssSelector(inputZipcode)).sendKeys(ZipCode);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(checkBungee)));
        Page.driver.findElement(By.xpath(checkBungee)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnNextEnterproductdata)));
        Page.driver.findElement(By.xpath(btnNextEnterproductdata)).click();
    }

    public void enterVehicleData(String kw, String ListPrice, String AnnualMileage){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(menuAutomovel)));
        Page.driver.findElement(By.cssSelector(menuAutomovel)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectMakeFord)));
        Page.driver.findElement(By.xpath(selectMakeFord)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(inputKW)));
        Page.driver.findElement(By.cssSelector(inputKW)).click();
        Page.driver.findElement(By.cssSelector(inputKW)).sendKeys(kw);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(calendar)));
        Page.driver.findElement(By.cssSelector(calendar)).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,1150)", "");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prevCalendar)));
        Page.driver.findElement(By.xpath(prevCalendar)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dateCalendar)));
        Page.driver.findElement(By.xpath(dateCalendar)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectSeats)));
        Page.driver.findElement(By.xpath(selectSeats)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectFuel)));
        Page.driver.findElement(By.xpath(selectFuel)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputListPrice)));
        Page.driver.findElement(By.xpath(inputListPrice)).sendKeys(ListPrice);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputAnnualMileage)));
        Page.driver.findElement(By.xpath(inputAnnualMileage)).sendKeys(AnnualMileage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnNextInsurantData)));
        Page.driver.findElement(By.xpath(btnNextInsurantData)).click();
    }

    public void fecharNavegador() {

        System.out.println("Navegador fechado");
        driver.close();

    }

}
