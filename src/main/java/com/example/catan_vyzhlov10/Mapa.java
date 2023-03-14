package com.example.catan_vyzhlov10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa {
    private int castle =32;




    List<String> idCastle= new ArrayList();
    static Map<String,TypLokace> mapHra= new HashMap<>();

    public void initCards(){
        for (int i = 0; i < castle; i++) {
            idCastle.add("castleId"+i);
        }
    }

    public void initMap(){
        for (int i = 0; i < castle; i++) {
            TypLokace castleBlue = TypLokace.BLUECASTLE;
            mapHra.put(idCastle.get(i),castleBlue );
            idCastle.remove(i);
        }

    }

}
