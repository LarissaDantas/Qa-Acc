package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import page.Page;

public class Steps {

    WebDriver driver = config.config.CreateWebDriver("chrome");

    Page page = new Page(driver);


    @Given("^I make a vehicle insurance request$")
    public void ImakeAVehicleInsuranceRequest() throws Exception {
        page.accessUrl();
    }

    @And("^I fill out the Insert Vehicle Data form (.*), (.*), (.*)$")
    public void iFillOutTheInsertVehicleDataForm(String kw, String ListPrice, String AnnualMileage) {
        page.enterVehicleData(kw, ListPrice, AnnualMileage);
    }

    @And("^I fill out the Enter Insurance Data form (.*), (.*), (.*), (.*), (.*)$")
    public void iFillOutTheEnterInsuranceDataFormFirstNameLastNameCountryZipCode
            (String FirstName, String LastName,String DateofBirth, String Country, String ZipCode) {
        page.enterInsuranceData(FirstName,LastName,DateofBirth,Country,ZipCode);
    }

    @And("^I fill out the Enter Product Data form (.*)$")
    public void iFillOutTheEnterProductDataForm(String StartDate) {
        page.enterProductData(StartDate);
    }

    @And("^I fill out the Select Price Option form$")
    public void iFillOutTheSelectPriceOptionForm() {
        page.selectPriceOption();
    }

    @And("^I fill out the Send Quote form (.*), (.*), (.*), (.*)$")
    public void iFillOutTheSendQuoteFormEmailPhoneUsarnamePasswordConfirmPassword(String Email , String Usarname, String Password, String ConfirmPassword) {
        page.sendQuote(Email, Usarname, Password, ConfirmPassword);
    }

    @Then("^I see the message (.*)$")
    public void iSeeTheMessageMessage(String messageSucess) {
        page.ValidateMessage(messageSucess);
        page.fecharNavegador();
    }
}
