package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;

public class BirdRepository {

//    private ArrayList<Bird> birdList = new ArrayList();

    private HashSet<Bird> birdList = new HashSet<>();
    private static BirdRepository instance;

    private BirdRepository() {

    }

    static BirdRepository getInstance() {
        if (instance == null) {
            instance = new BirdRepository();
        }
        return instance;
    }

    public void add(Bird bird) {
        birdList.add(bird);
    }

    public void remove(Bird bird){
        birdList.remove(bird);
    }

    public HashSet<Bird> getBirdList() {
        return birdList;
    }

    public Bird getBird(String birdName) {
        
    }

}
