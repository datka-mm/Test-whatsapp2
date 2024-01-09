package com.company;

public class Character implements Attack {
    private String name;
    private int speed;
    private String force;
    private String dexterity;
    private Weapon weapon;

    public Character(String name, int speed, String force, String dexterity) {
        this.name = name;
        this.speed = speed;
        this.force = force;
        this.dexterity = dexterity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public String getDexterity() {
        return dexterity;
    }

    public void setDexterity(String dexterity) {
        this.dexterity = dexterity;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return
                "name: " + name + "\n" +
                "speed: " + speed + "\n" +
                "force: " + force + "\n" +
                "dexterity: " + dexterity + "\n" +
                "weapon=" + weapon;
    }

    @Override
    public void attack() {
        System.out.println("attack");
    }
}
