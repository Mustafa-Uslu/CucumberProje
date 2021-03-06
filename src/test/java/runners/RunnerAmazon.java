package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/default-cucumber-reports",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml"}, //rapor olusturmak icin
            features = "src\\test\\resources\\features",  //feature klasorunun adresini yaz
            glue = "stepdefinitions", // testlerinin içerisinde olduğu paketin ismi
            tags = "@amazon", // seçtiğiniz tag'a ait testler çalıştırılır.
            dryRun = false  // senaryoda oluşturduğumuz anca henüz test methodu yazılmamış
            // olan adımların(steps) methodlarını consol'da görmek için "dryRun = true"
            // şeklinde kullanıyoruz.
            //dryRun = false olursa ,testleri calistirir.
            //dryRun =true olursa, eksik olan methodlari bulur ve size oneride bulunur.
    )

    public class RunnerAmazon {

    }
