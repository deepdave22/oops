public class overriding {

    public static void main(String[] args) {
        deer dr = new deer();
        dr.eat();
        
    }
    
}

class Animal{
    void eat(){
        System.out.println("Eats anything ");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}