import java.util.Random; // se importa para utilizarse en la clase random y generar los numero aleaotorios
import java.util.Scanner; // se importa scanner para la entrada de usuario.

public class GuessTheNumberGame {
    // hacemos una instancia estatica proporcionar números aleatorios
private static Random random = new Random();
    // este atributo almacena el número que los jugadores intentan adivinar
private static int targetNumber;

    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game!");
        System.out.println("La computadora generará un número entre 0 y 100. Tendrás varias oportunidades " + "para averiguar cuál es el número. ¡Buena suerte!");
        // Se imprime un msj de bienvenida a los jugadores

        // permite agregar el nombre del jugador humano
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String playerName = scanner.nextLine();

        System.out.println("¡Hola, " + playerName + "! Comencemos el juego.");
        // aqui inicia el juego para lanzar el numero aleatorio
        startGame();

        // aquí se crean ambos jugadores
        // Se crea un objeto ComputerPlayer con el nombre "Computer Player"
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer Player");
        // Se crea un objeto HumanPlayer con el nombre "Human Player"
        HumanPlayer humanPlayer = new HumanPlayer("playerName");

        playGuessingGame();

        for (int i = 0; i < 5; i++) {
            checkGuess(humanPlayer);
            checkGuess(computerPlayer);
        }
    }

    private static void startGame() {
        targetNumber = random.nextInt(100) + 1;
        //System.out.println("Número generado para la partida: " + targetNumber);
    }

    private static void checkGuess(Player player) {
        int guess = player.makeGuess();

        if (guess == targetNumber) {
            System.out.println(player.getName() + " Adivinaste el número. ¡Ganaste!");
        } else{
           System.out.println(player.getName() + " supuso " + guess + " Sigue intentado");
        }
    }

    private static void playGuessingGame() {
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Adivina el número (entre 1 y 100): ");
            int intento = scanner.nextInt();
            intentos++;


            if (intento < numeroSecreto) {
                System.out.println("Más alto...");
            } else if (intento > numeroSecreto) {
                System.out.println("Más bajo...");
            } else {
                System.out.println("¡Correcto! Adivinaste en " + intentos + " intentos.");
                break;
            }

        }
    }
        }
