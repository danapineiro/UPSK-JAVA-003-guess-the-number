import java.util.ArrayList;
import java.util.List;

// clase abstracta que lo que hace es representar a un jugador x dentro del juego
public abstract class Player {
    private String name; // aqui representamos el nombre del jugador
    private List<Integer> guesses; // aqui una lista que almacena los números que supone el jugador

    // aqui el constructor de la clase player
    public Player(String name) {
        this.name = name; // inicializa con el nombre del jugador
        this.guesses = new ArrayList<>(); // Inicializa esta lista de supusiciones
    }

    // getName metodo para obtener el nombre del jugador
    public String getName(){
        return this.name;
    }
    // setName metodo para establecer el nombre del jugador
    public void setName(String name){
        this.name = name;
    }

    // makeGuess metodo abstracto que tiene que ser implementado por las subclases y asi poder hacer la suposicion
    public abstract int makeGuess();

    // con este metodo se obtiene el historial de suposiciones del jugador
    public List<Integer> getGuesses() {
        return this.guesses;
    }
}
