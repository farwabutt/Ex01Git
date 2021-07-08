package com.example;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    Map<String,Integer> maps;
    HashMaps(){
        maps=new HashMap<>();
    }
    public void addKeyValue(String Key,int val){ maps.put(Key,val); }
    public int getValue(String Key){
        return maps.get(Key);
    }
    public void removePair(String Key){
        maps.remove(Key);
    }
    public void deleteAllRecord(){
        maps.clear();
    }
    public void showRecord(){
        System.out.println(maps);
    }
    public Map<String,Integer> getMaps(){
        return maps;
    }

    public static void main (String[] args) {
        HashMaps data = new HashMaps();
        data.addKeyValue("Civic", 2020);
        data.addKeyValue("Mercedes", 2018);
        data.addKeyValue("Ferrari", 2016);
        data.addKeyValue("Sportage",2020);
        System.out.println("Our Showroom has the following collections with Models released as:");
        data.showRecord();

        data.removePair("Sportage");
        System.out.println("After calling remove function");
        data.showRecord();
        }
    }
