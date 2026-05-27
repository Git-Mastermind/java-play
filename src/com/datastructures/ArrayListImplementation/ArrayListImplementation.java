package com.datastructures.ArrayListImplementation;

public class ArrayListImplementation {

    String[] array = {"a", "b", "c", "d", "e"};

    public void delete(String valueToErase) {
        String[] newArray = new String[array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != valueToErase) {
                newArray[i] = array[i];
            }
            
        }
        turnArrayToStringRepresentation(newArray);
    }

    public void turnArrayToStringRepresentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    
}
