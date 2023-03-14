package com.example.catan_vyzhlov10;

public class Game {
    static Player pl1;
    static Player pl2;
    static Player curentPl;

    public Game() {
        pl1= new Player("Blue");
        pl2= new Player("Yellow");
        curentPl=pl1;

    }

    public static void changeCurrentPlayer(){
        if(curentPl==pl1){
            curentPl=pl2;
        }else
            curentPl=pl1;
    }

    public static void giveResourses(int a){
        if (a==1){
            curentPl.setPocetSaber(curentPl.getPocetSaber()+1);
            curentPl.setPocetWool(curentPl.getPocetWool()+1);

        }
        if (a==2){
            curentPl.setPocetWood(curentPl.getPocetWood()+2);
            curentPl.setPocetPineapple(curentPl.getPocetPineapple()+2);

        }
        if (a==3){
            curentPl.setPocetWood(curentPl.getPocetWood()+3);
            curentPl.setPocetMillet(curentPl.getPocetMillet()+3);

        }
        if (a==4){
            curentPl.setPocetSaber(curentPl.getPocetSaber()+4);
            curentPl.setPocetPineapple(curentPl.getPocetPineapple()+4);

        }
        if(a==5){
            curentPl.setPocetMillet(curentPl.getPocetMillet()+5);
            curentPl.setPocetWool(curentPl.getPocetWool()+5);

        }
        if(a==6){
            curentPl.setPocetSaber(pl1.getPocetSaber()+1);
            curentPl.setPocetWool(pl1.getPocetWool()+1);

        }

    }
}
