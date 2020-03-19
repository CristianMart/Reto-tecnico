package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.test.userinterface.BanitsmoPersonasHomePage.DEPOSIT_ACCOUNT_FEE;
import static co.com.test.userinterface.BanitsmoPersonasHomePage.RATE_LINK;

public class SelectTheTarifarioOptions implements Task {
    public static SelectTheTarifarioOptions andClickTheLinks() {
        return Tasks.instrumented(SelectTheTarifarioOptions.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RATE_LINK),
                Click.on(DEPOSIT_ACCOUNT_FEE)
        );

    }
}
