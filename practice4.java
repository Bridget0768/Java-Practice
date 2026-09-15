
class animal{
    void cat(){
        System.out.println ("My cat is sick");

    }
}
class Dog extends animal{
    void rat(){
        System.out.println("rat ate all my maize");
    }
}
public class practice4{

public static void main(String[]args){
    Dog dog = new Dog();
dog.cat();
dog.rat();

}
}