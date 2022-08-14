package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio rad = new Radio();
    @ParameterizedTest
    @CsvSource({
            "-10,0",
            "10,0"
    })

    public void shouldNotSetStation(int newStation, int expected) {
        rad.setCurrentStation(newStation);
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "7,8",
            "8,9",
            "9,0"
    })
    public void nextStation(int station, int expected) {
        rad.setCurrentStation(station);
        rad.nextCurrentStation();
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2,1",
            "1,0",
            "0,9"
    })
    public void prevStation(int station, int expected) {
        rad.setCurrentStation(station);
        rad.prevCurrentStation();
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "98,99",
            "99,100",
            "100,100",
            "110,1",
            "-1,1"
    })
    public void increaseVolume(int volume, int expected) {
        rad.setCurrentVolume(volume);
        rad.increaseVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "2,1",
            "1,0",
            "0,0"
    })
    public void decreaseVolume(int volume, int expected) {
        rad.setCurrentVolume(volume);
        rad.decreaseVolume();
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}



