class library{
    void borrow(){
        System.out.println("i love borrowing books from the library");
    }

}
class book extends library{
    void economics(){
      System.out.println("i love reading ECONOMICS from the library");  
    }
}
public class practice3 {
    public static void main(String[] args){
    book Book = new book();
    Book.borrow();
    Book.economics();
}}
