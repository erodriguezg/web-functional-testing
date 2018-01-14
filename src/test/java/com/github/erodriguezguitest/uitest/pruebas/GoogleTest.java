package com.github.erodriguezguitest.uitest.pruebas;

import com.github.erodriguezguitest.uitest.core.BaseUITest;
import com.github.erodriguezguitest.uitest.webpages.GooglePage;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleTest extends BaseUITest {

    @Drone
    private WebDriver driver;

    @Test
    public void testOpeningHomePage() {
        driver.get("http://www.google.com");
        String pageTitle = driver.getTitle();
        assertThat(pageTitle).isEqualTo("Google");
    }

    @Test
    public void test(@InitialPage GooglePage googlePage) {
        assertThat(driver.getCurrentUrl()).isEqualTo("http://www.google.cl/");
    }
}
