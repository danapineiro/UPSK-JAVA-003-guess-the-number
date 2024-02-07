import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class GuessTheNumberGameTest {

    @Test
    // en este metodo verifica si el numero que genera el metodo startGame está dentro del rango que se espera
    public void testStartGameNumberGeneratedInRange() {
        // Arrange
        //GuessTheNumberGame game = new GuessTheNumberGame();
        // esta linea me toco comentarla porque me decía que no se podia instanciar a guessthenumbergame y que game no estaba siendo usada

        // Act
        GuessTheNumberGame.startGame(); // aqui llamar al metodo para generar el numero

        // Assert
        // aquí se verifica si el numero generado esta dentro de 1 al 100
        int targetNumber = GuessTheNumberGame.getTargetNumber(); // aqui obtenemos el numero que se genera automaticamente
        assertTrue(targetNumber >= 1 && targetNumber <= 100, "el número que fue generado está dentro del rango que se esperaba");
        // aqui se comprueba si el numero generado esta dentro de lo esperado usando el metodo asserttrue
    }

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


}
