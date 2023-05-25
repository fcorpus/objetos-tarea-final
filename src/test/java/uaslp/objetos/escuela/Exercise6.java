package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
    @Test
    public void validarCuandoAYBSonIguales(){
        //given:
        Dependencia dependencia = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia,dependencia,dependencia);
        //when:
        algoritmoX.algoritmoACubrir(3,3,"string");
        //then:
        Assertions.assertTrue(dependencia.isSaved());
        Assertions.assertTrue(dependencia.isRecovered());
    }
    @Test
    public void validarCuandoAEsMenorQueB(){
        //give:
        Dependencia dependencia = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia, dependencia, dependencia);
        //when:
        algoritmoX.algoritmoACubrir(3,5,"string");
        //then
        Assertions.assertTrue(dependencia.isPrinted());
        Assertions.assertTrue(dependencia.isRecovered());
    }
    @Test
    public void validarCuandoAesMayorQueB(){
        //give:
        Dependencia dependencia = new Dependencia();
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia, dependencia, dependencia);
        //when:
        algoritmoX.algoritmoACubrir(5,3,"string");
        //then:
        Assertions.assertTrue(dependencia.isSent());
        Assertions.assertTrue(dependencia.isRecovered());
    }
}
