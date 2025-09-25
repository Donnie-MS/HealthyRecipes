package ar.com.unahur.obj2.parcial.criterios;

import ar.com.unahur.obj2.parcial.Receta;

public class ComeTutti implements CriterioStrategy {

    @Override
    public Boolean leGusta(Receta receta) {
        return Boolean.TRUE;
    }

}
