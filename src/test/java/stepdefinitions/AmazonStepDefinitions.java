package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        // Driver.getDriver().get("http://amazon.com");
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));
    }

    @Given("headphones aramasi yapar")
    public void headphones_aramasi_yapar() {
    //amazonPage.aramaKutusu.sendKeys("headphones" + Keys.ENTER);
    amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("amazon_kelime") + Keys.ENTER);
    }

    @Then("kac tane sonuc oldugunu ekrana yazdirir")
    public void kac_tane_sonuc_oldugunu_ekrana_yazdirir() {
        System.out.println(amazonPage.sonucSayisi.getText());
    }
    @Given("kullanici camera aramasi yapar")
    public void kullanici_camera_aramasi_yapar() {
        amazonPage.aramaKutusu.sendKeys("camera" + Keys.ENTER);
    }
    @Given("kullanici {string} aramasi yapar")
    public void kullanici_aramasi_yapar(String string) {
        amazonPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Given("kullanici aramakutusuna {string} yazar ve arar")
    public void kullanici_aramakutusuna_yazar_ve_arar(String string) {
        amazonPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }
    @Given("kullanici dropdownda {string} secer")
    public void kullanici_dropdownda_secer(String string) {
        Select select = new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);

    }


}
