package ru.netology.domian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();

        assertEquals(2, radio.getCurrentStation());

    }

    @Test
    public void shouldNextStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldNextStation10() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();

        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldNextStationMin1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());

    }
    @Test
    public void shouldPrevStation10() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStationMin1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prevStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldVolumeUp1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeUp();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUp11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeUp();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeUpMin1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeUp();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeDown();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDownMin1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();

        assertEquals(0, radio.getCurrentVolume());
    }

}




