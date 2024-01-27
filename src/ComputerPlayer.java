import java.util.Random;

// en esta clase representamos el computador cuando juega
public class ComputerPlayer extends Player {
    private Random random; // se usa para obtener lo que ingrese el usuario

    // aqui el constructor de la clase que mencionamos antes
    public ComputerPlayer (String name) {
        super(name);
        this.random = new Random();
    }
    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        getGuesses().add(guess);
        return guess;
    }
}
