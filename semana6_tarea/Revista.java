/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6_tarea;

/**
 *Modificado para que Git lo detecte 
 * @author User
 */
public class Revista extends MaterialBibliografico {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }
    public void setNumeroEdicion(int numeroEdicion) { this.numeroEdicion = numeroEdicion; }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de edición: " + numeroEdicion);
    }
}