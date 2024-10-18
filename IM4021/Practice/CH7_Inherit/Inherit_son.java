package Practice.CH7_Inherit;

class CMath{
    protected void getMax(int a, int b){
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        System.out.println("The maximum number between " + a + " and " + b + " is " + max);
    }
}

class SonCMath extends CMath{
    protected void getFactorial(int a){
        int ans = 1, i;
        System.out.print(a + "! = ");
        for(i = 1; i <= a-1; i++){
            System.out.print(i + "*");
            ans *= i;
        }
        ans *= a;
        System.out.println(a + " = " + ans);
    }
}

public class Inherit_son {
    public static void main(String[] args) {
        SonCMath math1 = new SonCMath();
        math1.getMax(52, 78);
        math1.getFactorial(5);
    }
}