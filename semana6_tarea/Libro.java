/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6_tarea;

/**
 *Modificado para que Git lo detecte 
 * @author User
 */
public class Libro extends MaterialBibliografico {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
