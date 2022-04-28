package ru.netology.pervii;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Станции+
    @Test
    void maxStationTest(){
        int expected = 15;
        int quantity = 14;
        Radio radio=new Radio(expected, quantity);

        assertEquals(expected, radio.getMaxRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From first station'; 6; 0; 0; 0",
                    "'Last station'; 15; 15; 15; 15",
                    "'More maximum station'; 5; 7; 0; 0",
                    "'Less minimum station'; 5; -1; 0; 0"
            }
            , delimiter = ';'
    )
    void setRadioStationNumberTest(String name, int max, int beginning, int expected, int quant) {
        Radio radio=new Radio(max,quant);
        radio.setRadioStation(beginning);

        assertEquals(expected, radio.getRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From first station'; 5; 0; 1; 0",
                    "'Go last station'; 5; 4; 5; 5",
                    "'More maximum station'; 5; 5; 0; 5"
            }
            , delimiter = ';'
    )
    void NextRadioStationTest(String name, int max, int beginning, int expected, int quant) {
        Radio radio=new Radio(max,quant);
        radio.setRadioStation(beginning);

        radio.nextRadioStation();
        assertEquals(expected, radio.getRadioStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'From last station'; 5; 5; 4; 4",
                    "'Go first station'; 5; 1; 0; 0",
                    "'Less minimum station'; 5; 0; 5; 5"
            }
            , delimiter = ';'
    )
    void PrevRadioStationTest(String name, int max, int beginning, int expected, int quant) {
        Radio radio=new Radio(max,quant);
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