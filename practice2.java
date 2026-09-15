class animal{
    void cat(){
        
        System.out.println("My cat is hungry");
        System.out.println(" cat is cute");
        
    }}
    class Dog extends animal{
        void bark(){
            System.out.println("my dog is barking");
        }
    }

public class practice2 {
    public static void main(String[] args){
    Dog dog = new Dog();
dog.cat();
    dog.bark();
}
}