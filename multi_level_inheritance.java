public class multi_level_inheritance {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        
    }
    
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//derived class
class Mammal extends Animal{
    int legs;
}

//derived class 
class Dog extends Mammal{
    String breed;
}