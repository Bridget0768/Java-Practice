import java.util.Scanner;
public class scan{
    public static void main(String[] args){
        int age;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name:");
        name = input.nextLine();
        System.out.println("Enter your Age:");
        age = input.nextInt();
        System.out.println(name +" "+"is"+" " + age + " "+ "years old");
    }

}
