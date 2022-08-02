package day38_Inhertance_Continue.animalTask;

public class Cat extends Animal{
    public Cat(String breed, String name, String color, String size, char gender, int age) {
        super(breed, name, color, size, gender, age);
    }

    @Override
    public void eat(String s) {
        super.eat(breed+" "+name+" is eating"+s+" every day");
    }
}
