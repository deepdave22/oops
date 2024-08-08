public class AbstractExample {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }

    void eats() {
        System.out.println("animal eats");
    }

    abstract void walk(); // abstract method
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called");
    }

    void changeColor() {
        color = "dark brown";
    }

    @Override
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Inside mustang");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken constructor is called");
    }

    void changeColor() {
        color = "yellow";
    }

    @Override
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
