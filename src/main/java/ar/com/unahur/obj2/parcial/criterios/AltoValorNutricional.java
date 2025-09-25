package ar.com.unahur.obj2.parcial.criterios;

import ar.com.unahur.obj2.parcial.Receta;

public class AltoValorNutricional implements CriterioStrategy {
    private final Integer cantidadMinimaValorNutricional;

    public AltoValorNutricional(Integer cantidadMinimaValorNutricional) {
        this.cantidadMinimaValorNutricional = cantidadMinimaValorNutricional;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return Boolean.valueOf(receta.getValorNutricional() > cantidadMinimaValorNutricional);
    }

}
