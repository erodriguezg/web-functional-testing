package com.github.erodriguezguitest.uitest.webpages;

import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.support.FindBy;

import com.github.erodriguezguitest.uitest.core.BasePage;
import com.github.erodriguezguitest.uitest.fragments.IndicadoresFragment;

@Location("/")
public class InicioPage extends BasePage {

	@FindBy(xpath = "//section[contains(@id,'portlet_cl_bancocentral_indicadores_listado_portlet_ListadoIndicadoresPortlet')]")
	private IndicadoresFragment indicadoresFragment;

	public IndicadoresFragment getIndicadoresFragment() {
		return indicadoresFragment;
	}

	public void setIndicadoresFragment(IndicadoresFragment indicadoresFragment) {
		this.indicadoresFragment = indicadoresFragment;
	}
	
}
