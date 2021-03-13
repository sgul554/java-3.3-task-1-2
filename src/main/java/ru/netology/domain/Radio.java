package ru.netology.domain;

public class Radio {
    private int currentStation = 5;
    int minStation = 0;
    int maxStation = 9;
    int maxVolume = 10;
    int minVolume = 0;
    private int currentVolume = 7;

    public int countControlStat(int controlStat) {
        if (controlStat <= 9 && controlStat >= 0) {
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
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void countCurrentVolMinus() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
