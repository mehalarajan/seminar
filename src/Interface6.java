/* STATIC KEYWORD*/

interface Apple{
   void iOs();
    static void os(){
        System.out.println("iOs is mobile operating system developed by Apple inc..........");
    }
}
interface Android{
   void Os();
    static void os(){
        System.out.println("Android is a mobile operating system........");
    }
}
class Huawai {
    static void os(){
        System.out.println("Harmony os was developed by Huawai.........");
    }
}
/*class Sample extends Huawai implements Apple,Android{
    public void iOs()
    {
        System.out.println(" ok");
    }
    public void Os()
    {
        System.out.println("better");
    }
}*/
public class Interface6  extends Huawai implements Apple,Android
{
    public void iOs()
    {
        System.out.println(" ok");
    }
    public void Os()
    {
        System.out.println("better");
    }
    public static void main(String[] args){
     Interface6 sc=new Interface6();
      sc.iOs();
      sc.Os();


        Apple.os();
        Android.os();
        Huawai.os();
       //Android.Os();
    }
}
