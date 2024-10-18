package Practice.CH7_Inherit;

// functions can still be call or inherit between different file under same package using "protected"
class CMath{
    protected void getMax(int a, int b){
        int max;
        if(a > b)
            max = a;
        else
            max = b;
        System.out.println("The maximum number between " + a + " and " + b +" is " + max);
    }
}

class SonCMath extends CMath{
    protected void getFactorial(int a){
        int i, ans = 1;
        System.out.print(a + "! = ");
        for (i = 1; i < a; i++){
            ans *= i;
            System.out.print(i + "*");
        }
        ans *= i;
        System.out.println(a + " = " + ans);
    }
}

class GrandSonCMath extends SonCMath{
    protected void getFabonacci(int a){
        int firstnum = 0, secondnum = 1;
        System.out.print("The Fabonacci is: ");
        System.out.print(firstnum + ", " + secondnum);
        int i, ans;
        for (i = 2; i < a; i++){
            ans = firstnum + secondnum;
            System.out.print(", " + ans);
            firstnum = secondnum;
            secondnum = ans;
        }

    }
}
public class Inherit_grandson {
    public static void main(String[] args) {
        GrandSonCMath math2 = new GrandSonCMath();
        math2.getMax(66, 88);
        math2.getFactorial(3);
        math2.getFabonacci(5);
    }
}

