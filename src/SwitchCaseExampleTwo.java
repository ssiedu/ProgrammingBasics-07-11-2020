
public class SwitchCaseExampleTwo {

    public static void main(String[] args) {

        String state="R";
        
        switch(state){
            case "MP":
                System.out.println("Bhopal..");
            break;
            case "MH":
                System.out.println("Mumbai..");
            break;
            case "RJ":
                System.out.println("Jaipur..");
            break;
            default:
                System.out.println("Invalid Input..");
        }
        
    }
}
