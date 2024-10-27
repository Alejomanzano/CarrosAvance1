public class Producto {
    private String marca;
    private String modelo;
    private String tipo;
    private int year;
    private float precio;

    // Constructor
    public Producto(String marca, String modelo, String tipo, int year, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.year = year;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nTipo: " + tipo +
                "\nAño: " + year + "\nPrecio: $" + String.format("%.2f", precio);
    }
}
