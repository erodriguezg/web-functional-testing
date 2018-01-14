package com.github.erodriguezguitest.uitest.fragments;

import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.fragment.Root;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensajeErrorGlobalFragment {

    @Root
    private WebElement root;

    @FindBy(css = "div.msg error rounded-top rounded-bottom")
    private WebElement mensajeErrorDiv;

    @FindBy(id = "span.ui-icon.ui-icon-closethick.pui-notify-close")
    private WebElement cerrarSpan;

    public String getMensajeError() {
        esperarAlertaVisible();
        return mensajeErrorDiv.getText();
    }

    public void clickCerrar() {
        esperarAlertaVisible();
        cerrarSpan.click();
    }

    private void esperarAlertaVisible() {
        Graphene.waitGui().until().element(root).is().visible();
    }

}