package com.github.erodriguezguitest.uitest.fragments;

import java.util.List;

import org.jboss.arquillian.graphene.fragment.Root;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IndicadoresFragment {

	// //section[contains(@id,'portlet_cl_bancocentral_indicadores_listado_portlet_ListadoIndicadoresPortlet')]
	@Root
	private WebElement root;

	public String getIndicador(String indicador) {
		WebElement tablaIndicadores = getIndicadoresTable();
		List<WebElement> filas = tablaIndicadores.findElements(By.xpath(".//tr"));
		
		if (filas == null) {
			return null;
		}
		for (WebElement fila : filas) {
			String resultado = getIndicador(fila, indicador);
			if (resultado != null) {
				return resultado;
			}
		}
		return null;
	}
	
	private String getIndicador(WebElement fila, String indicador) {
		List<WebElement> tdList = fila.findElements(By.xpath(".//td"));
		if (tdList == null || tdList.size() < 2) {
			return null;
		}
		if (tdList.get(0).getText().equalsIgnoreCase(indicador)) {
			return tdList.get(1).getText();
		} else {
			return null;
		}
	}
	
	private WebElement getIndicadoresTable() {
		return root.findElements(By.xpath(".//table[@class='tabla_indicadores']")).get(4);
	}

}
