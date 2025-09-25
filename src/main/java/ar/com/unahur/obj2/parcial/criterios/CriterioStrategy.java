package ar.com.unahur.obj2.parcial.criterios;

import ar.com.unahur.obj2.parcial.Receta;

public interface CriterioStrategy {
    Boolean leGusta(Receta receta);
}
