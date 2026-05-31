package com.datastructures.ArrayListImplementation;



public class ArrayListTester {

    public static void main(String[] args) {
        //Testing the constructor
        ArrayList constructorTestList = new ArrayList(3);
        //todo: 
        System.out.println(constructorTestList.size()==3);

        //Testing add method
        ArrayList addTestList = new ArrayList(3);
        addTestList.add(0, "zero");
        addTestList.add(1, "one");
        
        //todo: 
        System.out.println(addTestList.get(0).equals("zero"));
        System.out.println(addTestList.get(1).equals("one"));

        //Testing remove method
        ArrayList deleteTestList = new ArrayList(3);
        deleteTestList.add(0, "zero");
        deleteTestList.add(1, "one");
        deleteTestList.remove(1);
        System.out.println(deleteTestList.get(1)==null);

        //Testing indexOf method
        ArrayList indexOfTestList = new ArrayList(3);
        indexOfTestList.add(0, "zero");
        System.out.println(indexOfTestList.indexOf("zero")==0);
        indexOfTestList.add(2, "e");

        

        System.out.println(ArrayList.elementCounter);


        





    }
  

    
}
