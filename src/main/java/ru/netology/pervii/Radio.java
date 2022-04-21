package ru.netology.pervii;

public class Radio {

    private int radioVolume;

    private int maxVolume = 100;
    private int minVolume = 0;

    private int radioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;

    //конструкторы+
    public Radio() {
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }
    //-


    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getRadioStation() {
        return this.radioStation;
    }

    public void setRadioStation(int forwardRadioStation) {
        if (forwardRadioStation > maxRadioStation || forwardRadioStation < minRadioStation) {
            return;
        }
        this.radioStation = forwardRadioStation;
    }

    public void nextRadioStation() {
        if (radioStation == maxRadioStation) {
            setRadioStation(minRadioStation);
        } else {
            setRadioStation(radioStation + 1);
        }
    }

    public void prevRadioStation() {
        if (radioStation == minRadioStation) {
            setRadioStation(maxRadioStation);
        } else {
            setRadioStation(radioStation - 1);
        }
    }

}