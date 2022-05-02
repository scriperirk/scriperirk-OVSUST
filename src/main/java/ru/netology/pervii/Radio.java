package ru.netology.pervii;

public class Radio {

    private int radioVolume;

    private int maxRadioVolume = 100;
    private int minRadioVolume = 0;

    private int radioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;

    //конструкторы+
    public Radio() {
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }
    //--

    //Станции+
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
    //--

    //Громкость+

    public int getRadioVolume() {
        return this.radioVolume;
    }

    public void setRadioVolume(int forwardRadioVolume) {
        if (forwardRadioVolume > maxRadioVolume || forwardRadioVolume < minRadioVolume) {
            return;
        }
        this.radioVolume = forwardRadioVolume;
    }

    public void nextVolume() {
        setRadioVolume(radioVolume + 1);
    }

    public void prevVolume() {
        setRadioVolume(radioVolume - 1);
    }
    //--
}