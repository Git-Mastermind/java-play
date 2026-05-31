package com.datastructures.ArrayListImplementation;

public class ArrayList {

    public String[] array;
    public static int objectCount;
    public static int elementCounter;

    public ArrayList(int size) {
        array = new String[size];
        objectCount++;
    }

    

    public void add(int index, String value) {
        array[index] = value;
        elementCounter++;
    }

    public int size() {
        return array.length;
    }

    public String get(int index) {
        return array[index];
    }

    public void remove(int index) {
        array[index] = null;
        elementCounter--;
    }

    public int indexOf(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

}



    