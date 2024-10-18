package Practice.CH7_Inherit;

class CScore{
    // attributes
    private int chia, eng;

    // default constructor
    CScore(){
        chia = 0; eng = 0;
    }

    // parameterized constructor
    CScore(int chia, int eng){
        this.chia = chia;
        this.eng = eng;
    }

    // function
    public void showScore(){
        System.out.print("Chinese: " + this.chia + "\t English: " + this.eng);
    }
}

class SonCScore extends CScore{
    private int math;

    SonCScore(){
        super();
        math = 0;
    }

    SonCScore(int chia, int eng, int math){
        super(chia, eng);
        this.math = math;
    }

    public void showScore(){
        super.showScore();
        System.out.print("\t Math: " + this.math);
    }
}


public class Inherit_review {
    public static void main(String[] args) {
        // parameter is defined here
        CScore Tom = new CScore(50, 90);
        Tom.showScore();
        System.out.print("\n");
        SonCScore Jack = new SonCScore(99, 40, 100);
        Jack.showScore();
    }
}
