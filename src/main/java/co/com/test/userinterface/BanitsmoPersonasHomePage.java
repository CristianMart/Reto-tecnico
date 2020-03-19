package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")

public class BanitsmoPersonasHomePage extends PageObject {

    public static final Target RATE_LINK = Target.the("Tarifario")
            .located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
    public static final Target DEPOSIT_ACCOUNT_FEE = Target.the("Tarifas de Cuentas de Depósitos")
            .located(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a/img"));
    public static final Target RATE_STRING_VIEW = Target.the("Titulo tarifario")
            .located(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/h1"));


    public static final Target CAR_LENDING_FEE = Target.the("Tarifas de Préstamo de Autos")
            .located(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/table/tbody/tr[6]/td[2]/span/a/img"));


}
