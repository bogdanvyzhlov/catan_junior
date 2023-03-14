package com.example.catan_vyzhlov10;

public enum TypLokace {
    BLUECASTLE("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Blue_town.png"),
    YELLOWCASTLE("/Users/bogdanvyzlov/Desktop/catan_vyzhlov10/src/main/resources/com/example/catan_vyzhlov10/pictures/Yellow_town.png");




    public String getImageAdress() {
        return imageAdress;
    }

    TypLokace(String imageAdress) {
        this.imageAdress = imageAdress;
    }

    private String imageAdress;
}
