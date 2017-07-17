package ejer15_t8_blackjack;

import java.util.Scanner;

/**
 *
 * @author Ismael Martín Ramírez
 * [imartinr01@informatica.iesvalledeljerteplasencia.es]
 */
public class Test {

    public static String pedirRespuesta() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Deseas descubrir otra carta? ");
        return entrada.nextLine();

    }

    public static void main(String[] args) {

        Carta[] arrayCartas = new Carta[52];
        BarajaAmericana baraja = new BarajaAmericana(arrayCartas);
        Tapete tapete = new Tapete(baraja);
        System.out.println("------------------");
        System.out.println("   !BLACK JACK!");

        tapete.juego();

    }

}
