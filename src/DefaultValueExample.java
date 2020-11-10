
public class DefaultValueExample {
    
    static int v1;
    static double v2;
    static Boolean v3;
    static String v4;
    static Double v6;
        
    void show(){
        int v5=1; //local
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
    public static void main(String[] args) {

        //DefaultValueExample ob=new DefaultValueExample();
        //ob.show();
        System.out.println(v3);
    }
}
