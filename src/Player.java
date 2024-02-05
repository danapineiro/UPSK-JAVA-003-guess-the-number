import java.util.List; //
import java.util.ArrayList; // importamos la clase arrayList para almacenar las suposiciones

// aqui se definne la clase abstracta player
abstract class Player {
    protected String name; // almacenamos el nombre del jugador con atributo protegido
    public List<Integer> guesses; // aqui se guarda la lista de las suposiciones

    // aqui el constructor que iniciliza con el nombre y las suposiciones
    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>(); // aqui dejamos vacio el arrayList para tomar al final los numeros de ambos jugadores
    }

    // aqui tenemos un metodo abstracto que será implementado por sus clases hijas
    public abstract int makeGuess();

    // tenemos aqui el metodo para obtener el nombre del player
    public String getName() {
        return name;
    }

    // metodo para obtener la lista de suposiciones del player
    public List<Integer> getGuesses() {
        return guesses;
    }
}
