public class hierarchial_inheritance {
    public static void main(String[] args) {
    Fish shark = new Fish();
    shark.swims();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Fish extends Animal{
    void swims(){
        System.out.println("swins");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}