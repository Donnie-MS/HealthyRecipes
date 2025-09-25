package ar.com.unahur.obj2.parcial.criterios;

import java.util.ArrayList;
import java.util.List;

import ar.com.unahur.obj2.parcial.Receta;

public class Premiun implements CriterioStrategy {

    private List<String> autores = new ArrayList<>();

    public Premiun(List<String> autores) {
        this.autores = autores;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return autores.contains(receta.getAutor());
    }

}
