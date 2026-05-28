package com.datastructures.ArrayListImplementation;

public class ArrayListImplementation {

    String[] array = {"a", "b", "c", "d", "e"};

    public void delete(String valueToErase) {
        String[] newArray = new String[array.length - 1];

        int indexOfValueToErase = -1;

        for (int i = 0; i <= newArray.length; i++) {
            if (indexOfValueToErase != -1) {
                if (array[i] != valueToErase) {
                    newArray[i - 1] = array[i];
                }
            }
            else {
                if (array[i] == valueToErase) {
                    indexOfValueToErase = i + 1;
                }
                else {
                    newArray[i] = array[i];
                }
            }
        }
        
        turnArrayToStringRepresentation(newArray);
    }

    public void turnArrayToStringRepresentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public boolean isEmpty() {
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                length++;
            }
        }

        if (length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
