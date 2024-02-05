import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {

    @Test
    public void testMakeGuess(){
        ComputerPlayer computerPlayer = new ComputerPlayer("ComputerPlayer");

        // aquí se realiza varias suposiciones y se verifica si estan dentro del rango predefinido o correcto
        for (int i = 0; i < 500; i++) {
            int guess = computerPlayer.makeGuess();
            assertTrue(guess >= 1 && guess <= 100, "La suposición debería estar entre 1 y 100");

        }
        // aquí se verifica que las suposiciones se agreguen a la lista
        assertEquals(500, computerPlayer.getGuesses().size(), "debería haber mil suposiciones en la lista");
    }
}
