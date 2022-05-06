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

    //Станции GET
    public int getRadioStation() {
        return this.radioStation;
    }

    //Громкость GET
    public int getRadioVolume() {
        return this.radioVolume;
    }

    //Станции SET
    public void setRadioStation(int forwardRadioStation) {
        if (forwardRadioStation < 0) {
            return;
        }
        if (forwardRadioStation > maxRadioStation - 1) {
            return;
        }
        this.radioStation = forwardRadioStation;
    }

    //Громкость SET
    public void setRadioVolume(int forwardRadioVolume) {
        if (forwardRadioVolume > maxRadioVolume || forwardRadioVolume < minRadioVolume) {
            return;
        }
        this.radioVolume = forwardRadioVolume;
    }

    //Станции+
    public void nextRadioStation() {
        if (radioStation >= maxRadioStation - 1) {
            radioStation = 0;
            return;
        }
        setRadioStation(radioStation + 1);
    }

    public void prevRadioStation() {
        if (radioStation <= 0) {
            this.radioStation = maxRadioStation - 1;
            return;
        }
        this.radioStation = radioStation - 1;
    }
    //--

    //Громкость+
    public void nextVolume() {
        setRadioVolume(radioVolume + 1);
    }

    public void prevVolume() {
        setRadioVolume(radioVolume - 1);
    }
    //--
}