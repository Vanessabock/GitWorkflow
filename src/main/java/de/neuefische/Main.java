package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Coordinates> coordinates = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            coordinates.add(new Coordinates(i, i));
        }
        System.out.println(coordinates);
        Coordinates coordinates2 = new Coordinates(3, 7);
    }
}