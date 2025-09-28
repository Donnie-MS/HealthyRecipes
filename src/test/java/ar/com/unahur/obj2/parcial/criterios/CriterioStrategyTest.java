package ar.com.unahur.obj2.parcial.criterios;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.com.unahur.obj2.parcial.Cliente;
import ar.com.unahur.obj2.parcial.Receta;

public class CriterioStrategyTest {
    Cliente cliente = new Cliente(123);
    Receta recetaCaloricaPremiun = new Receta("Hamburgesa de Legumbres", "Gato Dumas", 3000, 5);
    Receta recetaTradicional = new Receta("Guiso de Legumbres", "Mi abuelo", 15000, 50);

    @Test
    void dadoUnClienteQueComeTutti_leGustaCualquierReceta() {
        cliente.setCriterio(new ComeTutti());
        assertTrue(cliente.leGusta(recetaCaloricaPremiun));
    }

    @Test
    void dadoUnClienteQueComeConAltoValorNutricional_leGustaLaRecentaQueSuperaElMinimoDelValorNutricional() {
        cliente.setCriterio(new AltoValorNutricional(2999));
        assertTrue(cliente.leGusta(recetaCaloricaPremiun));
    }

    @Test
    void dadoUnClienteQueComeConAltoValorNutricional_NoleGustaLaRecentaQueNoSuperaElMinimoDelValorNutricional() {
        cliente.setCriterio(new AltoValorNutricional(3000));
        assertFalse(cliente.leGusta(recetaCaloricaPremiun));
    }

    @Test
    void dadoUnClientePremium_leGustanLasRecetasDeGatoDumas() {
        List<String> autores = Arrays.asList("Gato Dumas"); 
        cliente.setCriterio(new Premiun(autores));
        assertTrue(cliente.leGusta(recetaCaloricaPremiun));
    }

    @Test
    void dadoUnClienteTradicional_leGustanLasRecetasTradicionales() {
        cliente.setCriterio(new Tradicional());
        assertFalse(cliente.leGusta(recetaCaloricaPremiun));
        assertTrue(cliente.leGusta(recetaTradicional));
    }

    @Test
    void dadoUnClienteCombinado_leGustanLasRecetasCombinadas() {
        List<CriterioStrategy> criterios = new ArrayList<>();
        criterios.add(new Tradicional());
        criterios.add(new ComeTutti());

        cliente.setCriterio(new Combinado(criterios));
        assertFalse(cliente.leGusta(recetaCaloricaPremiun));
        assertTrue(cliente.leGusta(recetaTradicional));
    }

}
