package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldControlStationInLimit() {
        Radio radio = new Radio(5,0,10,100,0,5);
        assertEquals(5, radio.countControlStat(5));
    }

    @Test
    public void shouldControlStationUnderLimit() {
        Radio radio = new Radio();
        assertEquals(0, radio.countControlStat(11));
    }

    @Test
    public void shouldControlStationOnMaxLimit() {
        Radio radio = new Radio();
        assertEquals(10, radio.countControlStat(10));
    }

    @Test
    public void shouldControlStationAboveLimit() {
        Radio radio = new Radio(5,0,10,100,0,5);
        assertEquals(5, radio.countControlStat(-1));
    }

    @Test
    public void shouldControlStationOnMinLimit() {
        Radio radio = new Radio();
        assertEquals(0, radio.countControlStat(0));
    }

    @Test
    public void shouldCurrentStationNext() {
        Radio radio = new Radio(5,0,10,100,0,5);
        radio.countCurrentStatNext();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationOnMaxNext() {
        Radio radio = new Radio(10,0,10,100,0,5);
        radio.countCurrentStatNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationPrev() {
        Radio radio = new Radio(9,0,10,100,0,5);
        radio.countCurrentStatPrev();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationOnMinPrev() {
        Radio radio = new Radio(0,0,10,100,0,5);
        radio.countCurrentStatPrev();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentVolumeButtonPlusOnMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.countCurrentVolPlus();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeButtonPlus() {
        Radio radio = new Radio(5,0,10,100,0,5);
        radio.countCurrentVolPlus();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeButtonMinus() {
        Radio radio = new Radio(5,0,10,100,0,5);
        radio.countCurrentVolMinus();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentVolumeButtonPlusOnMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.countCurrentVolMinus();
        assertEquals(0, radio.getCurrentVolume());
    }
}