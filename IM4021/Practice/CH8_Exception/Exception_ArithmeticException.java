package Practice.CH8_Exception;

public class Exception_ArithmeticException {
    public static void main(String[] args) {
        int a = 7, b = 0, c;
        try{
            c = a / b;
            System.out.println(b + " divided by " + a + " is " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero error.");
            System.out.println("The error message is: " + e.toString());
        }
    }
}


