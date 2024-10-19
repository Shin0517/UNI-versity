package Practice.CH7_Inherit;

class CScore{
    private int math, phy;

    CScore(){
        math = 0; phy = 0;
    }
    /* 
    no-arguments constuctor: 
        " forcing initialize input value "
        when create an object without providing any parameter, 
        this constructor will force execute.
    */ 

    CScore(int math, int phy){
        this.math = math;
        this.phy = phy;
    }

    protected void showScore(){
        System.out.print("Math: " + this.math + "\t Physics: " + this.phy);
    }
}

class SonCScore extends CScore{
    private int eng;
    SonCScore(){
        super(); // call constructor from superclass
        eng = 0;
    }

    SonCScore(int math, int phy, int eng){
        super(math, phy); // call parameters from superclass
        this.eng = eng;
    }

    @Override
    public void showScore(){
        super.showScore(); // call function from superclass
        System.out.print("\t English: " + this.eng);
    }
}

public class Inherit_super {
    public static void main(String[] args) {
        CScore Peter = new CScore(30, 50);
        Peter.showScore();
        System.out.println("\n");
        CScore Kevin = new SonCScore(88, 65, 77);
        Kevin.showScore();
    }
}
