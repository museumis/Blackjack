package ejer15_t8_blackjack;

/**
 *
 * @author Ismael Martín Ramírez
 * [imartinr01@informatica.iesvalledeljerteplasencia.es]
 */
public class Carta {

    private int valor;
    private String palo;
    private String nombre;

    public Carta() {
    }

    public Carta(int valor, String palo, String nombre, boolean repartida) {
        this.valor = valor;
        this.palo = palo;
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setRepartida(boolean repartida) {

    }

    public void setValor(int valor) {
        this.valor = valor;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }

}
