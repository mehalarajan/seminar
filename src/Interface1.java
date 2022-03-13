interface Animals{
    void lion();
}
class Birds implements Animals{
    public void lion(){
        System.out.println("the king of forest");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Birds A = new Birds();
       // Animals s=new Animals();
        A.lion();
      // Animals.lion();
    }
}
