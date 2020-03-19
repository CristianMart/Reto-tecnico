package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.test.userinterface.BanitsmoPersonasHomePage.CAR_LENDING_FEE;
import static co.com.test.userinterface.BanitsmoPersonasHomePage.RATE_LINK;

public class SelectTheTarifarioOptionsAlternative implements Task {
    public static SelectTheTarifarioOptions andClickTheCarLendingLink() {
        return Tasks.instrumented(SelectTheTarifarioOptions.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RATE_LINK),
                Click.on(CAR_LENDING_FEE)
        );
    }
}
