package com.github.erodriguezguitest.uitest.pruebas;

import com.github.erodriguezguitest.uitest.core.BaseUITest;
import com.github.erodriguezguitest.uitest.fragments.IndicadoresFragment;
import com.github.erodriguezguitest.uitest.utils.NumberUtils;
import com.github.erodriguezguitest.uitest.webpages.InicioPage;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.Page;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeTest extends BaseUITest {

    @Drone
    private WebDriver driver;

    @Page
    private InicioPage inicioPage;

    @Test
    public void givenPaginaInicioWhenNavegoThenEstoyEnLaPagina() {
        inicioPage.navegar();
        assertThat(driver.getCurrentUrl()).isEqualTo("http://www.bcentral.cl/");
    }

    @Test
    public void givenPaginaInicioWhenEntroThenIndicadoresValidos() {
        inicioPage.navegar();
        IndicadoresFragment indicadores = inicioPage.getIndicadoresFragment();
        String dolarObservado = indicadores.getIndicador("UF");
        System.out.println(String.format("dolar observado: %s", dolarObservado));
        double number = NumberUtils.convert(dolarObservado);
        assertThat(number).isGreaterThan(0);
    }

}
