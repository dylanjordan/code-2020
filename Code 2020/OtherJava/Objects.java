package OtherJava;
public class Objects {

    String name, eyeColour;
    int age, HeightInInches;
    
    public Objects() {
        
    }

    public void speak() {
        System.out.println("Hello, my name is " + name + ".\nI am " + HeightInInches + 
        " inches tall.\nI am " + age + " years old. \nMy eye colour is " + eyeColour);
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void wak(){
        System.out.println("walking....");
    }
    public void work(){
        System.out.println("working...");
    }
}