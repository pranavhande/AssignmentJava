package assignement26sep;

import java.util.Scanner;

public class JobApplication {

    private boolean degree ;
    private boolean experience;
    private boolean criminalRecord;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Degree,CriminalRecord");
        degree=sc.nextBoolean();
        experience=sc.nextBoolean();
        criminalRecord=sc.nextBoolean();
    }

    public void checkDegree() {
        if (degree || experience && criminalRecord) {
            System.out.print("Eligible for job");
        } else {
            System.out.println("Not Eligible for job");
        }
    }


        public void display ()
        {
            System.out.println("Bachelor's Degree : " + degree);
            System.out.println("Experience : " + experience);
            System.out.println("Criminal Case : " + criminalRecord);
        }

    }
