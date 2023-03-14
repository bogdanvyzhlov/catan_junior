package com.example.catan_vyzhlov10;

public class Player {
private String colour;

    @Override
    public String toString() {
        return "Pocet Bodu=" + pocetBodu;

    }

    public void setPocetBodu(int pocetBodu) {
        this.pocetBodu = pocetBodu;
    }

    private    int pocetBodu;

  private  int pocetWood;
  private  int pocetSaber;
   private  int pocetMillet;
    private int pocetWool;
    private int pocetPineapple;
  private int cisloCastle;

    public String getColour() {
        return colour;
    }

    public int getPocetBodu() {
        return pocetBodu;
    }

    public int getCisloCastle() {
        return cisloCastle;
    }

    public int getPocetWood() {
        return pocetWood;
    }

    public int getPocetSaber() {
        return pocetSaber;
    }

    public int getPocetMillet() {
        return pocetMillet;
    }

    public int getPocetWool() {
        return pocetWool;
    }

    public int getPocetPineapple() {
        return pocetPineapple;
    }

    public void setPocetWood(int pocetWood) {
        this.pocetWood = pocetWood;
    }

    public void setPocetSaber(int pocetSaber) {
        this.pocetSaber = pocetSaber;
    }

    public void setPocetMillet(int pocetMillet) {
        this.pocetMillet = pocetMillet;
    }

    public void setPocetWool(int pocetWool) {
        this.pocetWool = pocetWool;
    }

    public void setPocetPineapple(int pocetPineapple) {
        this.pocetPineapple = pocetPineapple;
    }

    public Player(String colour) {
        this.colour = colour;
        this.pocetWood = 10;
        this.pocetSaber = 10;
        this.pocetMillet = 10;
        this.pocetWool = 10;
        this.pocetPineapple = 10;
        this.pocetBodu = 0;
        this.cisloCastle=0;

    }
}
