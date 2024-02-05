import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

@Test()
    public void testMakeGuess() {
    // hacemos la configuración para simular que el usuario ingrese el numero 99
    String userInput = "99\n";
    InputStream simulatedInput = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(simulatedInput);

    // creamos el human player y le pedimos que ingrese la soposicion
    HumanPlayer humanPlayer = new HumanPlayer("HumanPlayer");
    int guessedNumber = humanPlayer.makeGuess();

    // aqui restauramos la entrada estandar
    System.setIn(System.in);


    assertEquals(99, guessedNumber, "la suposicón deberia ser 99");
    assertEquals(1, humanPlayer.getGuesses().size(), "deberia haber una suposición en la lista");
    assertEquals( 99, humanPlayer.getGuesses().get(0), "la suposicion en la lista no coincide con la que ingreso el usuario");
}

}