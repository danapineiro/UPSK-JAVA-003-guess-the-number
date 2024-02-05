import java.util.Scanner;

// aqui se define la clase hp que se extiende su la clase padre Player (padre clase abstracta)
public class HumanPlayer extends Player {
    // tenemos el constructor que llama al constructor de player la clase padre
    public HumanPlayer(String name) {
        super(name);
    }

    // implementacion el metodo MG de la clase padre (player clase abstracta)
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in); // aqui se crea una instancia de S para poder leer la entrada del usuario
        System.out.print("\u001B[35mAdivina el número (entre 1 y 100): \u001B[35m"); // con este msj solicito al jugador ingresar un numero
        int guess = scanner.nextInt(); // se lee la suposicion
        guesses.add(guess); // se agrega esa suposicion a la lista
        return guess; // retornamos la suposicion que ingresó el jugador
    }
}
