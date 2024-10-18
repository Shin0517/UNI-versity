package Practice.CH8_Exception;

public class Exception_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] myarray = new int[10];
            try{
                // myarray[10] only got index 0~9
                myarray[10] = 250;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The Exception Message is:" + e.toString());
            }
    }
}
