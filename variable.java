public class variable {
    int age;
    String name;
    public variable(String name,int age){
        this.name=name;
        this.age=age;

    }
    public static void main(String[] args){
        variable myobj = new variable("Brimar",21);
        System.out.println(myobj.name);
        System.out.println(myobj.age);
    }
}