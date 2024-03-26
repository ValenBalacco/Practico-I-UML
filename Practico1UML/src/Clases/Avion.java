package Clases;

public class Avion implements Volador{
    private  int anio;
    private float capacidad;
    private String modelo;

    public Avion(int anio, float capacidad, String modelo) {
        this.anio = anio;
        this.capacidad = capacidad;
        this.modelo = modelo;
    }


    @Override
    public void Volar() {
        System.out.println("El avion esta despegando para realizar su vuelo ");
    }
}
