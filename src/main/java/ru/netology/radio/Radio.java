package ru.netology.radio;


public class Radio {
    private int maxCurrentStation = 9;
    private int minCurrentStation = 0;
    public int currentStation = minCurrentStation;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    public int currentVolume;


    public void setMinCurrentStation(int minCurrentStation) {
        this.minCurrentStation = minCurrentStation;
    }

    public int getMaxCurrentVolume() {
        return maxCurrentVolume;
    }

    public void setMaxCurrentVolume(int maxCurrentVolume) {
        this.maxCurrentVolume = maxCurrentVolume;
    }

    public int getMinCurrentVolume() {
        return minCurrentVolume;
    }

    public void setMinCurrentVolume(int minCurrentVolume) {
        this.minCurrentVolume = minCurrentVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxCurrentStation) {
            return;
        }
        if (newCurrentStation < minCurrentStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextCurrentStation() {
        if (currentStation < maxCurrentStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minCurrentStation;
        }
    }

    public void prevCurrentStation() {
        if (currentStation > minCurrentStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxCurrentStation;
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
