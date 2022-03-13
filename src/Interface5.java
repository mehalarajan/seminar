/*DEFAULT KEYWORD*/
interface Laptop1{
    void add();
    default void extra(){
        System.out.println("old version laptop....");
    }
}
interface Laptop2{
    void add();
    void sub();
    default void extra(){
        System.out.println("new version laptop....");
    }
}
class Laptop3{
    public void extra(){
        System.out.println("new version laptops.... with extra features");
    }
}

public class Interface5 extends Laptop3 implements Laptop1,Laptop2{
   public void add(){

   }
   public void sub(){

   }
    public static void main(String[] args){
        Interface5 s1=new Interface5();
        s1.extra();
      // Laptop3 l1=new Laptop3();
       //Laptop2 m1=new Laptop2();
       // l1.extra();

    }
}
