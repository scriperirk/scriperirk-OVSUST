package ru.netology.pervii;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //радиостанции
    @Test
    void theStationByRemoteControl() {
        Radio radio = new Radio();
        assertEquals(8, radio.theStationByRemoteControl(8));
    }

    @Test
    void theStationByRemoteControlIfNumberIsWrong() {
        Radio radio = new Radio();
        assertEquals(5, radio.theStationByRemoteControl(12));
    }

    @Test
    void theStationByRemoteControlIfNumberIsWrongMinus() {
        Radio radio = new Radio();
        assertEquals(5, radio.theStationByRemoteControl(-1));
    }

    @Test
    void theStationByButtonNextIfCurrentIsNine() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.theStationByNextButton();
        assertEquals(0, radio.getRadioStation());
    }

    @Test
    void theStationByButtonNext() {
        Radio radio = new Radio();
        radio.theStationByNextButton();
        assertEquals(6, radio.getRadioStation());
    }

    @Test
    void theStationByPrevButtonIfCurrentIsNull() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.theStationByPrevButton();
        assertEquals(9, radio.getRadioStation());
    }

    @Test
    void theStationByPrevButton() {
        Radio radio = new Radio();
        radio.theStationByPrevButton();
        assertEquals(4, radio.getRadioStation());
    }

    //громкость

    @Test
    void increaseVolumeUnderMax() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(6, radio.getRadioVolume());
    }

    @Test
    void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setRadioVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getRadioVolume());
    }

    @Test
    void increaseVolumeUnderMinimum() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(4, radio.getRadioVolume());
    }

    @Test
    void increaseVolumeAboveMinimum() {
        Radio radio = new Radio();
        radio.setRadioVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getRadioVolume());
    }
}