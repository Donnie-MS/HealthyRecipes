package ar.com.unahur.obj2.parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NutricionistaTest {
    Cliente cliente = new Cliente(123);
    Receta recetaCaloricaPremiun = new Receta("Hamburgesa de Legumbres", "Gato Dumas", 3000, 5);
    Receta recetaTradicional = new Receta("Guiso de Legumbres", "Mi abuelo", 15000, 50);
    Nutricionista licNutri = new Nutricionista("Nutri");
   


    @Test
    void dadoUnNutricionistaAgregarleUnaRecetaYVerificarQueLaContiene() {
        licNutri.agregarReceta(recetaCaloricaPremiun);
        Receta recetaDefault = new Receta("nula","nulo",0,0);
        String primerReceta = licNutri.getRecetas().stream().findFirst().orElse(recetaDefault).getNombre();
        assertEquals("Hamburgesa de Legumbres", primerReceta);

    }

    @Test
    void dadoUnNutricionistaVisitarAlClienteYEntregarleElBatido() {
        licNutri.visitar(cliente);
        assertTrue(licNutri.getRecetas().isEmpty());
        assertEquals("batido mágico", cliente.getRecetasRecibidas()
        .stream()
        .findFirst()
        .orElse(new Receta("no encontrado", "nombre", 2000, 0))
        .getNombre());
    }


    @Test
    void dadoUnNutricionistaVerificarQueVisitaUnClienteYSVerificaSuNombre() {
        licNutri.agregarReceta(recetaTradicional);
        licNutri.agregarReceta(recetaCaloricaPremiun);
        licNutri.visitar(cliente);
        assertEquals("Nutri", licNutri.getNombre());
        licNutri.vaciarRecetas();
    }

    @Test
    void elNutricionistaVerificaQueElClienteEsElCorrectoSegúnSuDNI() {
        assertEquals(123, cliente.getDni());
    }

    @Test
    void seReconfiguraLaRecetaCaloricaPremiumPorErrorDeCarga() {
        recetaCaloricaPremiun.setAniosTradicion(4);
        recetaCaloricaPremiun.setAutor("Gato Silvestre");
        recetaCaloricaPremiun.setValorNutricional(3500);
        recetaCaloricaPremiun.setNombre("Hamburguesa de espinaca");
        assertEquals(4, recetaCaloricaPremiun.getAniosTradicion());
    }
}
