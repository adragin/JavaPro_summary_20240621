package com.telran;

import lombok.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Car car1 = new Car();
//        Car car2 = new Car(1, "BMW");

        car1.setName("Bibika");
        System.out.println(car1);
        System.out.println(car1.getName());
    }
}

//@AllArgsConstructor
@Data
//@NoArgsConstructor
class Car{
    private int id;
    private String name;

//    public Car(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
}