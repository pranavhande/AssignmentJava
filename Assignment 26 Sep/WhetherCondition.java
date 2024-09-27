package assignement26sep;

import java.util.Scanner;

public class WhetherCondition {

    private int  tempurature ;
    private boolean wheather;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temp");
        tempurature=sc.nextInt();
        wheather = sc.nextBoolean();
    }

    public void check(){
        if ((tempurature>=20 && tempurature<30 && !wheather)){
            System.out.println("Tempurature is between 20 to 30");
        }
        else{
            System.out.println("It should not be raining");
        }
    }

    public void display ()
    {
        System.out.println("temperature: " + tempurature);
        System.out.println("wheather :"+ wheather);
    }
}
