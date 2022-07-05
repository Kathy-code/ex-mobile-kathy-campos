package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwaglabsLoginSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class SwaglabsLoginStepsDefs {

    @Steps
    SwaglabsLoginSteps swaglabsLoginSteps;

    @Dado("que me encuentro en la pantalla de login de Saucedemo")
    public void que_me_encuentro_en_la_pantalla_de_login_de_saucedemo() {

    }
    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String string, String string2) {

    }
    @Entonces("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String string) {

    }
    @Y("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {

    }



}
