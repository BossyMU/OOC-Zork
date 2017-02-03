package io.ooc.muic.zork;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameMapGenerator {

    Boolean hasStair;
    ArrayList<ArrayList<Room>> generateMap(int level){
        ArrayList<ArrayList<Room>> zorkMap = new ArrayList<ArrayList<Room>>();
        for (int i = 0; i < 3*level; i++){
            ArrayList<Room> zorkMapInner = new ArrayList<Room>();
            for (int j= 0; j < 3*level; j++) {
                if(i==2*level && j==2*level){
                    Room createRoom = new Room(level,true);
                    zorkMapInner.add(createRoom);
                }else{
                    Room createRoom = new Room(level,false);
                    zorkMapInner.add(createRoom);
                }
            }
            zorkMap.add(zorkMapInner);
        }
        return  zorkMap;
    }
}
