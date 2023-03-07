import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MainTest {

    @Test
    void whenGetFlour_thenThrowIOException() {
        try {
            Main.getFlourOutOfFlourSack();
            Assertions.fail("schlecht: Exception nicht aufgetreten");
        } catch (MausException e) {
            // super: die Exception ist aufgetreten
        }
    }
}