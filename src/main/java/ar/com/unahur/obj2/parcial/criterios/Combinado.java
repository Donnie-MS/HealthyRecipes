package ar.com.unahur.obj2.parcial.criterios;

import java.util.ArrayList;
import java.util.List;

import ar.com.unahur.obj2.parcial.Receta;

public class Combinado implements CriterioStrategy {
    private List<CriterioStrategy> criterios = new ArrayList<>();

    public Combinado(List<CriterioStrategy> criterios) {
        this.criterios = criterios;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return criterios.stream().allMatch(criterio -> criterio.leGusta(receta));
    }

}
