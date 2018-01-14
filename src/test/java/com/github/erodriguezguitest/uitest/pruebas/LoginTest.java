package com.github.erodriguezguitest.uitest.pruebas;

public class LoginTest /*extends BaseUITest*/ {

    /*
    @Drone
    private WebDriver browser;

    @Test
    public void iniciarSesion(@InitialPage LoginPage loginPage) {
        loginPage.ingresar(ConstantesUtil.USUARIO_ADMINSTRADOR, ConstantesUtil.PASSWORD_COMUN);
        Assert.assertTrue(browser.getCurrentUrl().contains("/inicio"));
    }

    @Test
    public void validarObligatorios(@InitialPage LoginPage loginPage) {
        loginPage.ingresar("", "");
        Assert.assertEquals(ConstantesUtil.MSJ_ERROR_CAMPO_OBLIGATORIO, loginPage.getMensajeErrorUsername());
        Assert.assertEquals(ConstantesUtil.MSJ_ERROR_CAMPO_OBLIGATORIO, loginPage.getMensajeErrorPassword());
    }

    @Test
    public void inicioSesionIncorrecto(@InitialPage LoginPage loginPage) {
        loginPage.ingresar(ConstantesUtil.USUARIO_ADMINSTRADOR, "nomecambies");
        Assert.assertEquals("Credenciales invÃ¡lidas", loginPage.getErrorGlobal());
    }

    */
}
