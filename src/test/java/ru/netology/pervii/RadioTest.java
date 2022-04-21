package ru.netology.pervii;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void maxStationTest(){
        int expected=15;
        Radio radio=new Radio(expected);

        assertEquals(expected, radio.getMaxRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From first station'; 5; 0; 0",
                    "'Last station'; 14; 14; 14",
                    "'More maximum station'; 5; 7; 0",
                    "'Less minimum station'; 5; -1; 0"
            }
            , delimiter = ';'
    )
    void setRadioStationNumberTest(String name, int max, int start, int expected) {
        Radio radio=new Radio(max);
        radio.setRadioStation(start);

        assertEquals(expected, radio.getRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From first station'; 5; 0; 1",
                    "'Go last station'; 5; 4; 5",
                    "'More maximum station'; 5; 5; 0"
            }
            , delimiter = ';'
    )
    void NextRadioStationTest(String name, int max, int start, int expected) {
        Radio radio=new Radio(max);
        radio.setRadioStation(start);

        radio.nextRadioStation();
        assertEquals(expected, radio.getRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From last station'; 5; 5; 4",
                    "'Go first station'; 5; 1; 0",
                    "'Less minimum station'; 5; 0; 5"
            }
            , delimiter = ';'
    )
    void PrevRadioStationTest(String name, int max, int start, int expected) {
        Radio radio=new Radio(max);
        radio.setRadioStation(start);

        radio.prevRadioStation();
        assertEquals(expected, radio.getRadioStation());
    }

}