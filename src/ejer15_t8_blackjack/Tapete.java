package ejer15_t8_blackjack;

/**
 *
 * @author Ismael Martín Ramírez
 * [imartinr01@informatica.iesvalledeljerteplasencia.es]
 */
public class Tapete {

    private BarajaAmericana baraja;

    public Tapete() {
    }

    public Tapete(BarajaAmericana baraja) {
        this.baraja = baraja;
    }

    public void setBaraja(BarajaAmericana baraja) {
        this.baraja = baraja;
    }

    public BarajaAmericana getBaraja() {
        return baraja;
    }

    public void juego() {

        int puntuacionJugador = 0;
        int puntuacionMaquina = 0;
        int contador = 0;
        String respuesta;
        boolean turnoMaquina = true;

        baraja.rellenarBaraja();
        baraja.barajar();
        System.out.print("Carta del jugador: ");
        baraja.repartirCarta();

        puntuacionJugador = puntuacionJugador + baraja.getArrayCartasBaraja()[contador].getValor();
        contador++;

        System.out.print("Carta de la Banca: ");
        baraja.repartirCarta();
        puntuacionMaquina = puntuacionMaquina + baraja.getArrayCartasBaraja()[contador].getValor();
        contador++;

        System.out.println("------------------");
        System.out.println("¡Turno del jugador!");

        do {

            System.out.print("Con " + puntuacionJugador + " de suma.");
            respuesta = Test.pedirRespuesta();

            if (respuesta.equalsIgnoreCase("Si")) {
                System.out.print("Carta del jugador: ");
                baraja.repartirCarta();

                if (baraja.getArrayCartasBaraja()[contador].getNombre().equalsIgnoreCase("As")) {

                    if (puntuacionJugador >= 10) {
                        baraja.getArrayCartasBaraja()[contador].setValor(1);

                    }
                }
                puntuacionJugador = puntuacionJugador + baraja.getArrayCartasBaraja()[contador].getValor();
                contador++;

                if (puntuacionJugador == 21) {

                    System.out.println("¡Black Jack!");
                    System.out.println("¡Ganaste!");
                    turnoMaquina = false;
                }

                if (puntuacionJugador > 21) {
                    System.out.println("¡Te pasaste!");
                    System.out.println("No has podido ganar");
                    turnoMaquina = false;
                }

            }

        } while ((respuesta.equalsIgnoreCase("Si")) && (puntuacionJugador != 21) && (puntuacionJugador < 22));

        if (turnoMaquina == true) {

            System.out.println("------------------");
            System.out.println("¡Turno de la banca!");

            do {

                System.out.print("Con " + puntuacionMaquina + " de suma.");

                baraja.repartirCarta();

                if (baraja.getArrayCartasBaraja()[contador].getNombre().equalsIgnoreCase("As")) {

                    if (puntuacionJugador >= 10) {
                        baraja.getArrayCartasBaraja()[contador].setValor(1);

                    }
                }
                puntuacionMaquina = puntuacionMaquina + baraja.getArrayCartasBaraja()[contador].getValor();
                contador++;

                if (puntuacionMaquina == 21) {

                    System.out.println("¡Black Jack de la Banca!");
                    turnoMaquina = false;

                }
              
                if (puntuacionMaquina > 21) {
                    System.out.println("¡La Banca se pasó, "+ puntuacionMaquina +" !");
                    System.out.println("!Ganaste!");
                    turnoMaquina=false;
                }

                if ((puntuacionMaquina > puntuacionJugador)&& (turnoMaquina == true)) {

                    System.out.println("La Banca superó tus puntos sin parsese, " + puntuacionMaquina);
                    System.out.println("No has podido ganar");
                    turnoMaquina=false;
                }

            } while (turnoMaquina == true);
        }

    }

}
