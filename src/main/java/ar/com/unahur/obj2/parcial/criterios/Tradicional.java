package ar.com.unahur.obj2.parcial.criterios;

import ar.com.unahur.obj2.parcial.Receta;

public class Tradicional implements CriterioStrategy {

    @Override
    public Boolean leGusta(Receta receta) {
        return receta.esTradicional();
    }

}
