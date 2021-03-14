package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation;
    int minStation = 0;
    int maxStation = 10;
    int maxVolume = 100;
    int minVolume = 0;
    private int currentVolume;

//    public Radio(int currentStation, int currentVolume) {
//        this.currentStation = currentStation;
//        this.currentVolume = currentVolume;
//    }

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

//    public int getCurrentStation() {
//        return currentStation;
//    }
//
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        this.currentVolume = currentVolume;
//    }
}