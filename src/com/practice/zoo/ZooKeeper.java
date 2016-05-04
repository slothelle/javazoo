package com.practice.zoo;

import com.practice.mammals.Sloth;

/**
 * Created by liz on 5/3/16.
 */
public class ZooKeeper {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setName("Liz's Amazing Wildlife Refuge");

        Sloth sloth = new Sloth();
        sloth.setName("Mossy");
        sloth.setAge(1);

        zoo.addAnimal(sloth);

        System.out.println(zoo.getAnimals().size());
    }
}
