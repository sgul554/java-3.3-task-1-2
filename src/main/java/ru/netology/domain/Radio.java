package ru.netology.domain;

public class Radio {
    private int currentStation;
    int minStation = 0;
    int maxStation = 10;
    int maxVolume = 100;
    int minVolume = 0;
    private int currentVolume;

    public Radio(){

    }

    public Radio(int currentStation, int minStation, int maxStation, int maxVolume, int minVolume, int currentVolume) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int countControlStat(int controlStat) {
        if (controlStat <= maxStation && controlStat >= minStation) {
            currentStation = controlStat;
        }
        return currentStation;
    }

    public void countCurrentStatNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
    }

    public void countCurrentStatPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
    }

    public void countCurrentVolPlus() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume += 1;
        }
    }

    public void countCurrentVolMinus() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume -= 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}