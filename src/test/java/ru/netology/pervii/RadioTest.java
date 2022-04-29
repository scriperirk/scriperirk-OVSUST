package ru.netology.pervii;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Станции+
    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From first station'; 6; 0; 0",
                    "'Last station'; 15; 15; 0",
                    "'More maximum station'; 5; 7; 0",
                    "'Less minimum station'; 5; -1; 0"
            }
            , delimiter = ';'
    )
    void setRadioStationNumberTest(String name, int max, int beginning, int expected) {
        Radio radio=new Radio(max);
        radio.setRadioStation(beginning);

        assertEquals(expected, radio.getRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From first station'; 5; 0; 1",
                    "'Go last station'; 5; 4; 4",
                    "'More maximum station'; 0; 5; 0"
            }
            , delimiter = ';'
    )
    void NextRadioStationTest(String name, int max, int beginning, int expected) {
        Radio radio=new Radio(max);
        radio.setRadioStation(beginning);

        radio.nextRadioStation();
        assertEquals(expected, radio.getRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From last station'; 5; 5; 0",
                    "'Go first station'; 5; 1; 0",
                    "'Less minimum station'; 5; 0; 0"
            }
            , delimiter = ';'
    )
    void PrevRadioStationTest(String name, int max, int beginning, int expected) {
        Radio radio=new Radio(max);
        radio.setRadioStation(beginning);

        radio.prevRadioStation();
        assertEquals(expected, radio.getRadioStation());
    }
    //--

    //Громкость++
    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Zero volume'; 0; 1",
                    "'Go max volume'; 99; 100",
                    "'More maximum volume'; 100; 100"
            }
            , delimiter = ';'
    )
    void pressPlusVolumeTest(String name, int start, int expected) {
        Radio radio=new Radio();
        radio.setRadioVolume(start);

        radio.nextVolume();
        assertEquals(expected, radio.getRadioVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Max volume'; 100; 99",
                    "'Go min volume'; 1; 0",
                    "'Less minimum volume'; 0; 0"
            }
            , delimiter = ';'
    )
    void pressMinusVolumeTest(String name, int start, int expected) {
        Radio radio=new Radio();
        radio.setRadioVolume(start);

        radio.prevVolume();
        assertEquals(expected, radio.getRadioVolume());
    }
    //--
}