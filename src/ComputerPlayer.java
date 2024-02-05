import java.util.Random;

// por aqui creamos la clase CP que extiende de la clase padre player(abstracta)
public class ComputerPlayer extends Player {
    private Random random; // aquí tenemos un atributo privado que lo que hace es representar
    // el generador de numeros aleatorios obviamente para las suposiciones de CP

    // por aca el constructor que hace el llamado al constructor de la clase padre player y genera los numeros random
    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }


    // aqui ya tenemos implementaod el metodo MG que tenemos en la clase padre player
    public int makeGuess() {
        int guess = random.nextInt(100) + 1; // se genera la suposicion aleatoria
        guesses.add(guess); // agregamos la suposicion a la lista
        return guess; // retornamos la suposicion que se generó
    }
}
