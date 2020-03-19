package co.com.test.questions;

import co.com.test.userinterface.BanitsmoPersonasHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheBanitsmoLandingPageAnswer implements Question {
    public static TheBanitsmoLandingPageAnswer itIs() {
        return new TheBanitsmoLandingPageAnswer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String rateString, rateStringView;
        Boolean result;

        rateString = Text.of(BanitsmoPersonasHomePage.RATE_LINK).viewedBy(actor).asString();
        rateStringView = BanitsmoPersonasHomePage.RATE_STRING_VIEW.toString();

        if (rateString.equals(rateStringView)) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
