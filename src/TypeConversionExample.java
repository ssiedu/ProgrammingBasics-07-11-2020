
public class TypeConversionExample {

    public static void main(String[] args) {

        int v1=10;          //types are same no conversion required.
        double v2=5;        //types are diff but container is large, implicit conversion will take place
        int v3=(int)2.5;    //types are diff and container is small, explicit conversion required
        //double v4=true;     //conversion is not allowed 
    }
}
