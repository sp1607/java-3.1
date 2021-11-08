package ru.netology.domian;

public class Radio {
    private int currentStation; //текущая станция
    private int stationMin = 0;
    private int stationMax = 9;
    private int currentVolume; //текущая громкость
    private int volumeMax = 10;
    private int volumeMin = 0;

    //радиостанции
    public void nextStation() {
        if (currentStation >= stationMin & currentStation < stationMax) {
            this.currentStation = currentStation + 1;
        }

        if (currentStation == stationMax | currentStation < stationMin) {
            this.currentStation = stationMin;
        }

        if (currentStation > stationMax) {
            this.currentStation = stationMax;
        }

    }

    public void prevStation() {
        if (currentStation > stationMin & currentStation <= stationMax) {
            this.currentStation = currentStation - 1;
        }

        if (currentStation == stationMin | currentStation > stationMax) {
            this.currentStation = stationMax;
        }

        if (currentStation < stationMin) {
            this.currentStation = stationMin;
        }

    }

    //громкость
    public void volumeUp() {
        if (currentVolume >= volumeMin & currentVolume < volumeMax) {
            this.currentVolume = currentVolume + 1;
        }

        if (currentVolume >= volumeMax) {
            this.currentVolume = volumeMax;
        }

        if (currentVolume < volumeMin) {
            this.currentVolume = volumeMin;
        }

    }

    public void volumeDown() {
        if (currentVolume > volumeMin & currentVolume <= volumeMax) {
            this.currentVolume = currentVolume - 1;
        }

        if (currentVolume <= volumeMin) {
            this.currentVolume = volumeMin;
        }

        if (currentVolume > volumeMax) {
            this.currentVolume = volumeMax;
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