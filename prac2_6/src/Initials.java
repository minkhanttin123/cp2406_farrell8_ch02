/**
 * Created by jc339438 on 22/11/2016.
 */
public class Initials {

    private String name;
    public Initials (String n)
    {
        name = n;

    }
    public String getName()
    {

        return name;

    }

    public void setName(String n) {
        name = n;
    }

    public void displayIntialss(){

        String [] initial = name.split(" ");
        char first = initial[0].charAt(0);
        char second = initial[1].charAt(0);
        char third = initial[2].charAt(0);
        System.out.println(first + " . " + second + " . " + third + " . ");

    }

}
