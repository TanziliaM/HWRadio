package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private boolean on;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private boolean next;
    private boolean prev;
    private boolean plus;
    private boolean minus;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public boolean isPlus() {
        return plus;
    }

    public void setPlus(boolean plus) {
        this.plus = plus;
    }

    public boolean isMinus() {
        return minus;
    }

    public void setMinus(boolean minus) {
        this.minus = minus;
    }

    public boolean isNext() {
        return next;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isPrev() {
        return prev;
    }

    public void setPrev(boolean prev) {
        this.prev = prev;
    }


    public void changeNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
    }

    public void changePrevRadioStation() {
        currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }

    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }


    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }


    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
        return;
    }


    public void setMaxRadioStation(int maxRadioStation) {

        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {

        this.minRadioStation = minRadioStation;
    }


    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public int getMinRadioStation() {

        return minRadioStation;
    }
}