package co.edu.unipiloto.labtoolbar;

public class Proyecto {

    private String nombre; // Cambié a minúscula
    private String descripcion;
    private String categoria;

    public Proyecto(String nombre, String descripcion, String categoria) {
        this.nombre = nombre; // Inicialización correcta
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre; // Cambié a minúscula
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }
}
