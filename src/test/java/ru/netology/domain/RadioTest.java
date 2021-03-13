package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldControlStationInLimit() {
        Radio radio = new Radio();
        assertEquals(5, radio.countControlStat(5));
    }

    @Test
    public void shouldControlStationUnderLimit() {
        Radio radio = new Radio();
        assertEquals(5, radio.countControlStat(98));
    }

    @Test
    public void shouldControlStationOnMaxLimit() {
        Radio radio = new Radio();
        assertEquals(9, radio.countControlStat(9));
    }

    @Test
    public void shouldControlStationAboveLimit() {
        Radio radio = new Radio();
        assertEquals(5, radio.countControlStat(-1));
    }

    @Test
    public void shouldControlStationOnMinLimit() {
        Radio radio = new Radio();
        assertEquals(0, radio.countControlStat(0));
    }

    @Test
    public void shouldCurrentStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.countCurrentStatNext();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationOnMaxNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.countCurrentStatNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.countCurrentStatPrev();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationOnMinPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.countCurrentStatPrev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentVolumeButtonPlusOnMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.countCurrentVolPlus();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeButtonPlus() {
        Radio radio = new Radio();
        radio.countCurrentVolPlus();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeButtonMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.countCurrentVolMinus();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeButtonPlusOnMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.countCurrentVolMinus();
        assertEquals(0, radio.getCurrentVolume());
    }
}