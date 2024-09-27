package assignement26sep;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {


        int num1,num2,num3;


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1,num2,num3");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();


        int greater =  (num1 > num2)  ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("the greatest is :"+greater);

}
}

