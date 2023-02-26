import org.example.mavenradio.services.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondRadioTest {
    @Test
    public void test() {
        Radio radio = new Radio(20 );
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void testCount() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountZero() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOne() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountOn() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}

