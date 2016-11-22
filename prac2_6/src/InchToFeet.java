/**
 * Created by jc339438 on 22/11/2016.
 */
public class InchToFeet {

    public static void main(String[] args)
    {
        InchToFeetApp in  = new InchToFeetApp();
        int inchesNum = in.getNum();
        int feet = 12;


        System.out.println(inchesNum + " inches becomes " + inchesNum/feet + " feet and " + inchesNum % feet + " inches " );


    }



}
