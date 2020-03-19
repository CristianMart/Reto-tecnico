package co.com.test.tasks;

import co.com.test.userinterface.BanitsmoPersonasHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class StartThe implements Task {

    private BanitsmoPersonasHomePage banitsmoPersonasHomePage;

    public static StartThe banitsmoPersonasLandingPage() {
        return Tasks.instrumented(StartThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(banitsmoPersonasHomePage));
    }
}
