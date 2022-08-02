package day39_Recap.animalTask;

public class Crocodile extends WildAnimal{


    public Crocodile(String name,  String size, String color, char gender, int age) {
        super(name, "Crocodile", size, color, gender, age);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting ");
    }
}
