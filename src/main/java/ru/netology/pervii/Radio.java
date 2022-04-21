package ru.netology.pervii;

public class Radio {

    private int radioVolume = 5;
    int maxVolume = 10;
    int minVolume = 0;
    private int radioStation = 5;
    int maxRadioStation = 9;
    int minRadioStation = 0;

    //Станция
    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        this.radioStation = radioStation;
    }

    public int theStationByRemoteControl(int intendedStation) {
        if (intendedStation <= 9 && intendedStation >= 0) {
            radioStation = intendedStation;
        }

        return radioStation;
    }


    public void theStationByNextButton() {
        if (radioStation == maxRadioStation) {
            radioStation = 0;
        } else {
            radioStation += 1;
        }
    }

    public void theStationByPrevButton() {
        if (radioStation == minRadioStation) {
            radioStation = 9;
        } else {
            radioStation -= 1;
        }
    }

    //Громкость
    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int radioVolume) {
        this.radioVolume = radioVolume;
    }

    public void increaseVolume() {
        if (radioVolume == maxVolume) {
            return;
        } else {
            radioVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (radioVolume == minVolume) {
            return;
        } else {
            radioVolume -= 1;

        }
    }
}