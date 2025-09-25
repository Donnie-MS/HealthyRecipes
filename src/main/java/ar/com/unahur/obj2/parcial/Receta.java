package ar.com.unahur.obj2.parcial;

public class Receta {
    private String nombre;
    private String autor;
    private Integer valorNutricional;
    private Integer aniosTradicion;

    public Receta(String nombre, String autor, Integer valorNutricional, Integer aniosTradicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricional = valorNutricional;
        this.aniosTradicion = aniosTradicion;
    }

    public Boolean esTradicional() {
        return Boolean.valueOf(aniosTradicion >= 20);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getValorNutricional() {
        return valorNutricional;
    }

    public void setValorNutricional(Integer valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    public Integer getAniosTradicion() {
        return aniosTradicion;
    }

    public void setAniosTradicion(Integer aniosTradicion) {
        this.aniosTradicion = aniosTradicion;
    }

}
