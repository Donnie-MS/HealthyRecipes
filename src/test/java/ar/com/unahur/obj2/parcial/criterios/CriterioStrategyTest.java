package ar.com.unahur.obj2.parcial.criterios;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.com.unahur.obj2.parcial.Cliente;
import ar.com.unahur.obj2.parcial.Receta;

public class CriterioStrategyTest {
    Cliente cliente = new Cliente(123);
    Receta recetaCaloricaPremiun = new Receta("Hamburgesa de Legumbres", "Gato Dumas", 3000, 5);

    @Test
    void dadaUnClienteQueComeTutti_leGustaCualquierReceta() {
        cliente.setCriterio(new ComeTutti());
        assertTrue(cliente.leGusta(recetaCaloricaPremiun));
    }

    @Test
    void dadaUnClienteQueComeConAltoValorNutricional_leGustaLaRecentaQueSuperaElMinimoDelValorNutricional() {
        cliente.setCriterio(new AltoValorNutricional(2999));
        assertTrue(cliente.leGusta(recetaCaloricaPremiun));
    }

    @Test
    void dadaUnClienteQueComeConAltoValorNutricional_NoleGustaLaRecentaQueNoSuperaElMinimoDelValorNutricional() {
        cliente.setCriterio(new AltoValorNutricional(3000));
        assertFalse(cliente.leGusta(recetaCaloricaPremiun));
    }
}
