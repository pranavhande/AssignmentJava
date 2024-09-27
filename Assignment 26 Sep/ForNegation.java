package assignement26sep;

import java.util.Scanner;

public class ForNegation {

    private int  num ;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number");
        num=sc.nextInt();
    }

    public void check(){
        if (!(num>=10 && num<20)){
            System.out.println("Number is not between range");
        }
        else{
            System.out.println("Number is between range 10 to 20");
        }
    }

    public void display ()
    {
        System.out.println("Number: " + num);
    }

}
