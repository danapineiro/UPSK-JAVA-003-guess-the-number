import java.util.Scanner;

// en esta clase representamos el jugador humano
public class HumanPlayer extends Player {
    private Scanner scanner; // se usa para obtener lo que ingrese el usuario

    // aquí el constructor de la clase antes mencionada
    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    public int makeGuess() {
        System.out.print("Ingresa un número: ");
        int guess = scanner.nextInt();
        getGuesses().add(guess);
        return guess;
    }
}
