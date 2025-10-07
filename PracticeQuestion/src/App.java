public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static String utility(int number) {

        // write your code here


        

        System.out.println(number);
        Switch (number);{
            
            case 1:
                return "One";
                break; 
            case 2:
                return "Two";
                break;
            case 3:
                return "Three";
                break;
            case 4:
                return "Four";
                break;
            case 5:
                return "Five";
                break;
            case 6:
                return "Six";
                break;
                
            case 7:
                return "Seven";
                break;
            case 8:
                return "Eight";
                break;
            case 9:
                return "Nine";
                break;
            default:
                return "Unknown";
                break;
               
        }
        
        
    }
}

