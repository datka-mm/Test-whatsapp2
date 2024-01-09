package com.company;

public class Main {

    public static void main(String[] args) {


        // write your code here
        Character archer1 = new Archer("Sanjar", 10, "1-level", "1-level");
        Character archer2 = new Archer("Erjan", 5, "4-level", "4-level");
        Character warrior1 = new Warrior("Adilet", 6, "5-level", "5-level");
        Character warrior2 = new Warrior("Kutman", 11, "5-level", "5-level");

        Character[] characters = {archer1, archer2, warrior1, warrior2};

        for (Character c : characters) {
            System.out.println(c);
            if (c instanceof Archer) {
                c.setWeapon(new Weapon(WeaponType.BOW));
                c.attack();
                System.out.println(c.toString());
                System.out.println("_________________ " );
            } else if (c instanceof  Warrior){
                c.setWeapon(new Weapon(WeaponType.AXE));
                System.out.println(c.toString());
                c.attack();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }
    }
}

