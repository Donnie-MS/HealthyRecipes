package ar.com.unahur.obj2.parcial;

import java.util.ArrayList;
import java.util.List;

public class Nutricionista {
    private List<Receta> recetas = new ArrayList<>();
    private String nombre;

    public Nutricionista(String nombre) {
        this.nombre = nombre;
    }

    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    public void vaciarRecetas() {
        recetas.clear();
    }

    public List<Receta> getRecetas() {
        return new ArrayList<>(recetas);
    }

    public void visitar(Cliente cliente) {
        Receta recetaAEntregar = recetas.stream()
                .filter(receta -> cliente.leGusta(receta))
                .findFirst()
                .orElse(new Receta("batido mágico", nombre, 2000, 0));
        cliente.recibirReceta(recetaAEntregar);
        recetas.remove(recetaAEntregar);
    }
}
