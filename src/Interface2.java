/*MULTIPLE*/
interface Snake
{
    void Alion();
        }
 interface Eagle
        {
    void Blion();
        }
class Fish implements Snake,Eagle{
    public void Alion(){
        System.out.println("the king of forest");
    }
    public void Blion(){
        System.out.println("the king of next forest");
    }
}
public class Interface2 {
    public static void main(String[] args){
        Fish f1=new Fish();
        f1.Alion();
        f1.Blion();

    }

}
