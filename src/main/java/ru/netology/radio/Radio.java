package ru.netology.radio;


public class Radio {
    private int numberOfStation = 10;
    private int minCurrentStation = 0;
    public int currentStation = minCurrentStation;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    public int currentVolume;


    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > numberOfStation - 1) {
            return;
        }
        if (newCurrentStation < minCurrentStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextCurrentStation() {
        if (currentStation < numberOfStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minCurrentStation;
        }
    }

    public void prevCurrentStation() {
        if (currentStation > minCurrentStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = numberOfStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxCurrentVolume) {
            return;
        }
        if (newCurrentVolume < minCurrentVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
