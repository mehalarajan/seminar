interface Features{
    void dialing();
    void messaging();
}
interface Add_On_Features{
    void vcalling();
    void mms();
    void storeage();
}
class Normalphone{
    public  void dialing(){
        System.out.println("it is dialing....");
    }
    public  void messaging(){
        System.out.println("it is messaging....");
    }
}
class Smartphones implements Features, Add_On_Features  {
    public  void dialing(){
        System.out.println("it is dialing again.......");
    }
    public  void messaging(){
        System.out.println("it is messaging again....");
    }
    public void vcalling(){
        System.out.println("v calling is supporting...");
    }
    public void mms(){
        System.out.println("mms is also supporting...");
    }
    public void storeage(){
        System.out.println("there is a sufficient storage....");
    }
}
public class Interface4 {
    public static void main(String[] args){
        Normalphone np=new Normalphone();
        Smartphones sp=new Smartphones();
        np.dialing();
        sp.dialing();
        np.messaging();
        sp.messaging();
        sp.vcalling();
        sp.mms();
        sp.storeage();

    }

}
