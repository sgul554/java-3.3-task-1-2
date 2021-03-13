package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Lombok {
    private int currentStation;
    int minStation = 0;
    int maxStation = 10;
    int maxVolume = 100;
    int minVolume = 0;
    private int currentVolume;
}
