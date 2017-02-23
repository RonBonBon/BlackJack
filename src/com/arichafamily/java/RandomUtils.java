package com.arichafamily.java;

import java.util.Random;

/**
 * Created by hackeru on 16/02/2017.
 */
public class RandomUtils {
    //No instances allowed
    private RandomUtils(){}

    //Private fields
    private static Random randGen = new Random();

    public static int getInt(){
        return randGen.nextInt();
    }

    public static int getInt(int from, int to){
        int range = to - from;
        return from + randGen.nextInt(range + 1);
    }
}
