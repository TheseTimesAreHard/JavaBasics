package com.careerdevs.objectfactories.animalfactory;

public class Animal {

    private String name;
    private String breed;
    private int pounds;

    public Animal(String name, String breed, int pounds) {

        this.name = name;
        this.breed = breed;
        this.pounds = pounds;

    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getPounds() {
        return pounds;
    }

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", pounds=" + pounds +
                '}';
    }
}
