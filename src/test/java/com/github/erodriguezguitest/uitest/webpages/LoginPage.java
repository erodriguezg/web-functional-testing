package com.github.erodriguezguitest.uitest.webpages;

import com.github.erodriguezguitest.uitest.core.BasePage;
import com.github.erodriguezguitest.uitest.fragments.MensajeErrorGlobalFragment;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.findby.FindByJQuery;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebElement;

@Location("login")
public class LoginPage extends BasePage {

    @FindByJQuery("#username")
    private WebElement usernameInput;

    @FindByJQuery("#password")
    private WebElement passwordInput;

    @FindByJQuery("input#entrar")
    private WebElement ingresarButton;

    @FindByJQuery("#username-msjerror")
    private WebElement errorUsername;

    @FindByJQuery("#password-msjerror")
    private WebElement errorPassword;

    @FindByJQuery("div.pui-notify-wrapper")
    private MensajeErrorGlobalFragment mensajeErrorGlobal;

    public void ingresar(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        Graphene.waitGui().until().element(ingresarButton).is().visible();
        Graphene.guardHttp(ingresarButton).click();
    }

    public String getMensajeErrorUsername() {
        return errorUsername.getAttribute("oldtitle");
    }

    public String getMensajeErrorPassword() {
        return errorPassword.getAttribute("oldtitle");
    }

    public String getErrorGlobal() {
        return mensajeErrorGlobal.getMensajeError();
    }

    public void cerrarErrorGlobal() {
        mensajeErrorGlobal.clickCerrar();
    }

}