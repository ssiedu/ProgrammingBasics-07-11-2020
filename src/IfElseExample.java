
public class IfElseExample {

    public static void main(String[] args) {

        int marks=26;
        
        if(marks>=60){
            System.out.println("I-Div");
        }else if(marks>=45){
            System.out.println("II-Div");
        }else if(marks>=33){
            System.out.println("III-Div"); 
        }else{
            System.out.println("Fail...");
        }
        
        
    }
}
/*
    >=60            I-Div
    >=45    <60     II-Div
    >=33    <45     III-Div
    <33             Fail
*/