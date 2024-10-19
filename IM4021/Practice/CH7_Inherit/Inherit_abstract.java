package Practice.CH7_Inherit;

abstract class CScore{
    protected int chia, math;

    protected CScore(int chia, int math){
        this.chia = chia;
        this.math = math;
    }

    public abstract double avgScore();
}

class SimpleAvg extends CScore{
    SimpleAvg(int chia, int math){
        super(chia, math);
    }

    @Override
    public double avgScore(){
        return (float) (chia + math) / 2;
    }
}

class WeightAvg extends CScore{
    private int w1, w2;

    WeightAvg(int chia, int math, int w1, int w2){
        super(chia, math);
        this.w1 = w1;
        this.w2 = w2;
    }

    @Override
    public double avgScore(){
        return (double) (chia*w1 + math*w2) / (w1 + w2);
    }
}

public class Inherit_abstract {
    public static void main(String[] args) {
        String name = "Tommy";
        int chia = 88, math = 79;
        SimpleAvg avg1 = new SimpleAvg(chia, math);
        System.out.println("Name \tChinese \tMath \t Simple Average");
        System.out.println(name + "\t" + chia + "\t\t" + math + "\t\t" + avg1.avgScore());

        System.out.println("-----------------------------------");
        
        int w1 = 2, w2 = 3;
        WeightAvg avg2 = new WeightAvg(chia, math, w1, w2);
        System.out.println("Name \tChinese \tMath \t Weight Average");
        System.out.printf("%s\t%d\t\t%d\t\t%2.1f", name, chia, math, avg2.avgScore());
    }
}
