package ar.com.unahur.obj2.parcial;

import java.util.ArrayList;
import java.util.List;

import ar.com.unahur.obj2.parcial.criterios.ComeTutti;
import ar.com.unahur.obj2.parcial.criterios.CriterioStrategy;

public class Cliente {
    private final Integer dni;
    private CriterioStrategy criterio = new ComeTutti();
    private List<Receta> recetasRecibidas = new ArrayList<>();

    public Cliente(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public CriterioStrategy getCriterio() {
        return criterio;
    }

    public void setCriterio(CriterioStrategy criterio) {
        this.criterio = criterio;
    }

    public Boolean leGusta(Receta receta) {
        return criterio.leGusta(receta);
    }

    public void recibirReceta(Receta receta) {
        recetasRecibidas.add(receta);
    }
}
