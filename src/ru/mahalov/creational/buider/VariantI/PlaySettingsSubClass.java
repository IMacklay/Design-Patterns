package ru.mahalov.creational.buider.VariantI;

import ru.mahalov.creational.buider.PlaySettings;

public class PlaySettingsSubClass extends PlaySettings {

    private PlaySettingsSubClass(Builder builder){
        this.balance = builder.balance;
        this.volumeSize = builder.volumeSize;
        this.randomOrderPlaying = builder.randomOrderPlaying;
    }

    public static class Builder{
        private int volumeSize;
        private boolean randomOrderPlaying;
        private int balance;

        public Builder(int volumeSize){
            //Обязательные поля
            this.volumeSize = volumeSize;
            //Значения по умолчанию
            this.balance = 0;
        }

        public Builder setRandomOrderPlaying(boolean randomOrderPlaying) {
            this.randomOrderPlaying = randomOrderPlaying;
            return this;
        }

        public Builder setBalance(int balance) {
            this.balance = balance;
            return this;
        }

        public PlaySettingsSubClass build(){
            return new PlaySettingsSubClass(this);
        }
    }


}
