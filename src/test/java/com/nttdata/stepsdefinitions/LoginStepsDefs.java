package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepsDefs {
    @Steps
    LoginSteps loginSteps;

    @Given("ingreso al aplicativo de My Demo App")
    public void ingresoAlAplicativoDeMyDemoApp() {
    }

    @When("inicio sesión con mi usuario {string} y clave {string}")
    public void inicioSesiónConMiUsuarioYClave(String user, String password) {
        loginSteps.login(user, password);
    }

    @Then("el inicio de sesión es exitoso")
    public void elInicioDeSesiónEsExitoso() {
      //  loginSteps.loginSuccess();
    }
}
