import java.lang.Math;
public class LineComparison {
    public static void main(String[] args) {
        int L1x1=4;
        int L1y1=5;
        int L1x2=7;
        int L1y2=9;
        int L2x1=4;
        int L2y1=5;
        int L2x2=7;
        int L2y2=9;

        double Length1=Math.sqrt(Math.pow(L1x2-L1x1,2)+Math.pow(L1y2-L1y1,2));
        double Length2=Math.sqrt(Math.pow(L2x2-L2x1,2)+Math.pow(L2y2-L2y1,2));

        String L1=String.valueOf(Length1);
        String L2=String.valueOf(Length2);

        if(L1.equals(L2))
        {
            System.out.println("Length is equal!");
        }
        int value=L1.compareTo(L2);

        if(value<0)
        {
            System.out.println("Line 2 is Bigger");
        }

        else if(value>0)
        {
            System.out.println("Line 1 is Bigger");
        }

    }
}
