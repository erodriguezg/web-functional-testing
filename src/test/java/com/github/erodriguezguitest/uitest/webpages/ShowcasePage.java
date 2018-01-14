/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.erodriguezguitest.uitest.webpages;

import com.github.erodriguezguitest.uitest.core.BasePage;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.graphene.findby.FindByJQuery;
import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebElement;

/**
 *
 * @author rockman
 */
@Location("showcase")
public class ShowcasePage extends BasePage {
    
    @FindByJQuery("#valorUno")
    private WebElement valorUnoInput;
    
    @FindByJQuery("#valorUno-msjerror")
    private WebElement valorUnoError;
    
    @FindByJQuery("#btnForm1")
    private WebElement botonEnviar;
    
    public void enviar(String valorUno) {
        valorUnoInput.sendKeys(valorUno);
        Graphene.guardHttp(botonEnviar).click();
    }

    public String getValorUnoError() {
        return valorUnoError.getAttribute("oldtitle");
    }
    
    
    
    
    
    
    
}
