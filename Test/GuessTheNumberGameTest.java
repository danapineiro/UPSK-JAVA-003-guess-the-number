import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class GuessTheNumberGameTest {

    @Test
    // en este método verifica si el número que genera el método startGame está dentro del rango que se espera
    public void testStartGameNumberGeneratedInRange() {

        //GuessTheNumberGame game = new GuessTheNumberGame();
        // esta linea me toco comentarla porque me decía que no se podía instanciar a guessthenumbergame y que game no estaba siendo usada

        // aquí se ejecuta el código que se está probando
        GuessTheNumberGame.startGame(); // aquí llamar al método para generar el número

        // aquí se realizan las afirmaciones sobre el comportamiento del código en la prueba
        // aquí se verifica si el número generado estÁ dentro de 1 al 100
        int targetNumber = GuessTheNumberGame.getTargetNumber(); // aquí obtenemos el número que se genera automáticamente
        assertTrue(targetNumber >= 1 && targetNumber <= 100, "el número que fue generado está dentro del rango que se esperaba");
        // aquÍ se comprueba si el número generado está dentro de lo esperado usando el método asserttrue

    }
}
/*
    @Test
    public void testWelcomeMessage() {
        // Arrange
        String playerName = "Dana";
        String expectedWelcomeMessage = "\u001B[35m¡Hola, " + playerName + "! Comencemos el juego.\u001B[35m";

        // Simulamos la entrada del usuario con Mockito
        Scanner mockedScanner = mock(Scanner.class);
        when(mockedScanner.nextLine()).thenReturn(playerName);

        // Redirigimos la salida estándar a ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Act
        GuessTheNumberGame game = new GuessTheNumberGame(mockedScanner);
        GuessTheNumberGame.startGame();

        // Assert
        assertTrue(outputStream.toString().contains(expectedWelcomeMessage), "El mensaje de bienvenida es incorrecto");

        // Restauramos la salida estándar
        System.setOut(originalOut);
    }
}*/



    /* @Test
    public void testCheckGuess_MessageForLowerGuess() {
        // Arrange
        GuessTheNumberGame game = new GuessTheNumberGame();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirigir la salida estándar a outputStream*/

        // Inicia el juego para establecer el número secreto
        /*GuessTheNumberGame.startGame();
        // Obtiene el número secreto
        int secretNumber = GuessTheNumberGame.getTargetNumber();
        Player player = new HumanPlayer("Player");

        // Act
        game.checkGuess(player, secretNumber - 90); // Suposición del jugador más baja que el número secreto

        // Assert
        String expectedMessage = "Player hizo una suposición de " + (secretNumber - 90) + ". Más alto...\n";
        assertEquals(expectedMessage, outputStream.toString());
    }*/

