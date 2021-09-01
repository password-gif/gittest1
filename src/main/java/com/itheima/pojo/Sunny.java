package com.itheima.pojo;

public class Sunny {
    private Sunny sunny;

    @Override
    public String toString() {
        return "Sunny{" +
                "sunny=" + sunny +
                '}';
    }

    public Sunny getSunny() {
        return sunny;
    }

    public void setSunny(Sunny sunny) {
        this.sunny = sunny;
    }
}
