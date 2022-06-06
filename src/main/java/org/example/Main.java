package org.example;

 class Main {
     public void myFurniture() {
         System.out.println("i own a table");
     }

 }
 class electronics extends Main {
     public void myElectronics() {
         System.out.println("i have a heavy machine wofer");
     }

 }
 class place extends Main{
     public void myArea() {
         System.out.println("i live in mirema");
     }
    public static void main(String[] args) {
         Main myObj = new Main();
         electronics elec = new electronics();
         place myPlace = new place();
         myObj.myFurniture();
         myPlace.myArea();
         elec.myElectronics();
       // System.out.println("Hello world!");
    }
}