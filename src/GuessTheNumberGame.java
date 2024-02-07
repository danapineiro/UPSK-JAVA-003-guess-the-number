import java.util.Random; // importamos la clase random para generar los numeros aleaotiros
import java.util.Scanner; // importamos la clase scanner para poder ver la entrada del usuario

public class GuessTheNumberGame {
    private static final Random random = new Random(); // en esta clase instanciamos un objeto para generar # aleatorios de la clase random
    private static int targetNumber; // aqui almacenamos el numero a adivinar


    public static void main(String[] args) {
        // msj de bienvenida
        System.out.println("\u001B[35m¡Hola y bienvenidos a Adivina con Dana!\u001B[35m");

        // usamos scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: "); // por aqui solicitamos el nombre del usuario
        String playerName = scanner.nextLine();

        // msj saludado al usuario con su nombre
        System.out.println("\u001B[35m¡Hola, " + playerName + "! Comencemos el juego.\u001B[35m");

        // indicaciones del juego
        System.out.println("\u001B[34mLa computadora generará un número entre 0 y 100. " + playerName +
                ", tendrás varias oportunidades para averiguar cuál es el número.¡Buena suerte!\u001B[34m");

        // aqui creamos a los jugadores (clases HP y CP)
        HumanPlayer humanPlayer = new HumanPlayer(playerName);
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer Player");

        // aqui tenemos el bucle principal
        while (true) {
            GuessTheNumberGame.startGame(); // aqui iniciamos el juego

            // tenemos esta variable para guardar el ganador del juego
            Player winner = playGame(humanPlayer, computerPlayer);

            // aqui mostramos el resultado
            if (winner != null) {
                System.out.println("\u001B[36m¡Felicidades, " + winner.getName() + "! Adivinaste el número. Fin del juego.\u001B[36m");
                // suposiciones de human y computer
                System.out.println("\u001B[34mSuposiciones de " + humanPlayer.getName() + ": \u001B[34m" + humanPlayer.getGuesses());
                System.out.println("\u001B[34mSuposiciones de " + computerPlayer.getName() + ": \u001B[34m" + computerPlayer.getGuesses());
            } else {
                // adicional agregué un msj si los jugadores no adivinan
                System.out.println("\u001B[31mNingún jugador adivinó el número. Reiniciando el juego.\u001B[31m");
            }

            // también agregué si quieres jugar otra vez
            System.out.print("\u001B[37m¿Quieres jugar otra vez? (Sí/No): \u001B[37m");
            String playAgain = scanner.nextLine().toLowerCase(); // lee la proxima linea de la entrada del usuario (por medio del objeto scanner)
             // en playAgain se almacena la respuesta y toLowerCase para cambiar mayusculas o mixtas a minusculas

            // si no respondes si, saldriamos del bucle y se termina la partida
            if (!playAgain.equals("si")) {
                System.out.println("\u001B[35mGracias por jugar. ¡Hasta luego!\u001B[35m");
                break;
            }
        }
    }
// aqui iniciamos una nueva partida y generamos un nuevo numero

    public static void startGame() {
        targetNumber = random.nextInt(100) + 1;
        System.out.println("Número generado para la partida: " + targetNumber);
    }

    public static int getTargetNumber() {
        return targetNumber;
    }


    // aqui jugamos lass partidas por turnos
    private static Player playGame(HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
        Player winner = null; // variable que guarda el ganador

        // aqui en este bucle colocamos solo 5 turnos en la partida
        for (int i = 0; i < 5; i++) {
            int humanGuess = humanPlayer.makeGuess(); // aqui obtenemos la susposicion de HP
            checkGuess(humanPlayer, humanGuess); // se verifica la suposión

            // colocamos esta condicional para asignar a HP como ganador si adivina el numero
            if (humanGuess == targetNumber) {
                winner = humanPlayer;
                break;
            }

            int computerGuess = computerPlayer.makeGuess(); // obetenemos la suposicion del CP
            checkGuess(computerPlayer, computerGuess); // la verificamos

            // agregamos otra condición si el CP gana se le asigna como ganador
            if (computerGuess == targetNumber) {
                winner = computerPlayer;
                break;
            }
        }

        return winner; // aqui retornamos al ganador ( ya sea HP y CP)
    }

    // en este metodo verificamos la suposicion y se muestran msj de alto o bajo segun sea el caso
    private static void checkGuess(Player player, int guess) {
        int numeroSecreto = targetNumber;

        // se compara la suposicion del jugador con el numero secreto
        if (guess < numeroSecreto) {
            System.out.println(player.getName() + " hizo una suposición de " + guess + ". Más alto...");
        } else if (guess > numeroSecreto) {
            System.out.println(player.getName() + " hizo una suposición de " + guess + ". Más bajo...");
        }
    }
}

// revisar que no lo tengo boolean pero no le quise mover ya al codigo pero si lo tengo de esta forma el checkGuess aparece como que no se está usando.
   /* private static boolean checkGuess(Player player, int guess) {
        int numeroSecreto = targetNumber;

        if (guess == numeroSecreto) {
            System.out.println(player.getName() + " adivinó el número " + guess + ". ¡Correcto!");
            return true;
        } else if (guess < numeroSecreto) {
            System.out.println(player.getName() + " hizo una suposición de " + guess + ". Más alto...");
        } else {
            System.out.println(player.getName() + " hizo una suposición de " + guess + ". Más bajo...");
        }

        return false;
    }*/