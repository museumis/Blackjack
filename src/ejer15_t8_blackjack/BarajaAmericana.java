/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer15_t8_blackjack;

/**
 *
 * @author Ismael Martín Ramírez
 * [imartinr01@informatica.iesvalledeljerteplasencia.es]
 */
public class BarajaAmericana {

    private Carta[] arrayCartasBaraja;
    private int cartaActual = 0;

    public BarajaAmericana() {
    }

    public BarajaAmericana(Carta[] arrayCartas) {
        this.arrayCartasBaraja = arrayCartas;
    }

    public BarajaAmericana(Carta[] arrayCartasBaraja, int cartaActual) {
        this.arrayCartasBaraja = arrayCartasBaraja;
        this.cartaActual = cartaActual;
    }

    public void setCartaActual(int cartaActual) {
        this.cartaActual = cartaActual;
    }

    public void setArrayCartasBaraja(Carta[] arrayCartasBaraja) {
        this.arrayCartasBaraja = arrayCartasBaraja;
    }

    public int getCartaActual() {
        return cartaActual;
    }

    public Carta[] getArrayCartasBaraja() {
        return arrayCartasBaraja;
    }

    public void mostrarBaraja() {

        int i;

        for (i = 0; i < arrayCartasBaraja.length; i++) {
            System.out.println(arrayCartasBaraja[i].getNombre() + " de " + arrayCartasBaraja[i].getPalo() + " " + arrayCartasBaraja[i].getValor());
        }

    }

    public void rellenarBaraja() {
        
        System.out.println("------------------");
        System.out.println("¡Baraja Nueva!");

        int[] valores = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        String[] nombre = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo", "Rey"};

        int contadorValorNombre = 0;
        int contadorPalo = 0;
        int j;
        String palo = "";

        //relleno de bajara
        for (j = 0; j < arrayCartasBaraja.length; j++) {

            if (contadorValorNombre == 13) {
                contadorValorNombre = 0;
            }

            if (contadorPalo < 12) {
                palo = "Rombos";
            }
            if ((contadorPalo > 12) && (contadorPalo < 25)) {
                palo = "Tréboles";
            }
            if ((contadorPalo > 25) && (contadorPalo < 38)) {
                palo = "Corazones";
            }
            if ((contadorPalo > 38) && (contadorPalo < 51)) {
                palo = "Picas";
            }

            this.arrayCartasBaraja[j] = new Carta(valores[contadorValorNombre], palo, nombre[contadorValorNombre], false);
            contadorValorNombre++;
            contadorPalo++;

        }

    }

    public void barajar() {

        int aleatorio,i;
        Carta cartaAux;
       
        for (i = 0; i < 52; i++) {

            aleatorio = (int) Math.floor(((Math.random() * 20)));
            cartaAux = arrayCartasBaraja[i];
            arrayCartasBaraja[i]=arrayCartasBaraja[aleatorio];
            arrayCartasBaraja[aleatorio]=cartaAux;
        }

        System.out.println("------------------");
        System.out.println("!Barajada!");
        System.out.println("------------------");
    }

    
    public void repartirCarta(){    
        
        System.out.println(arrayCartasBaraja[cartaActual].getNombre() + " de " + arrayCartasBaraja[cartaActual].getPalo());
        cartaActual++;
    }
}
