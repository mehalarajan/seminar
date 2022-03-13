/* ACHIVE MULTIPLE INHERITENCE*/

interface A{
    void Ashow();
    void Adisplay();
}
interface B{
    void Bshow();
    void Bdisplay();
}
class AB implements A,B{
   public void Ashow(){
        System.out.println("1");
    }
  public  void Adisplay(){
        System.out.println("one");
    }
   public void Bshow(){
        System.out.println("2");
    }
 public void Bdisplay(){
        System.out.println("two");
    }
}
public class Interface3 {
    public static void main(String[] args) {
        AB obj = new AB();
        obj.Ashow();
        obj.Adisplay();
        obj.Bshow();
        obj.Bdisplay();

    }
}
