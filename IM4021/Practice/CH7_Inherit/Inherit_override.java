package Practice.CH7_Inherit;

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
    @Override
    protected void getMax(int a, int b){
        if(a > b)
            System.out.println("The maximum number between " + a + " and " + b +" is " + a);
        else if (b > a)
            System.out.println("The maximum number between " + a + " and " + b +" is " + b);
        else
            System.out.println(a + " equals " + b);
    }
}

public class Inherit_override {
    public static void main(String[] args) {
        CMath math3 = new CMath();
        math3.getMax(5, 9);
        CMath math4 = new SonCMath();
        math4.getMax(5, 5);
    }   
}
