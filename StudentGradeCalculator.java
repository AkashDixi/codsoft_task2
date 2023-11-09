import java.util.Scanner;
public class StudentGradeCalculator

{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total number of subjects");
        int sub = sc.nextInt();
        int sum =0,avg =0, marks;
        System.out.println("enter marks of all subjects");

        for(int i=0;i<sub;i++)
        {
            marks = sc.nextInt();
            sum +=marks;


        }
        avg =sum/sub;
        if (avg>91 && avg<=100)
        {
            System.out.println("the avg marks you scored is"+avg);
            System.out.println("Grade :Outstanding 'O' ");
            
        
        }
        else if(avg>81 && avg<=90)
        {
             System.out.println("the avg marks you scored is"+avg);
             System.out.println("Grade :Excellent 'A+' ");

        }
        else if(avg>71 && avg<=80)
        {
             System.out.println("the avg marks you scored is"+avg);
             System.out.println("Grade :Very Good 'A' ");

        }
        else if(avg>61 && avg<=70)
        {
             System.out.println("the avg marks you scored is"+avg);
             System.out.println("Grade : Good 'B+' ");

        }
        else if(avg>51 && avg<=60)
        {
             System.out.println("the avg marks you scored is"+avg);
             System.out.println("Grade :Above Average 'B' ");

        }
        else if(avg>41 && avg<=50)
        {
             System.out.println("the avg marks you scored is"+avg);
             System.out.println("Grade :Average 'C' ");

        }
         else if(avg>31 && avg<=40)
        {
             System.out.println("the avg marks you scored is"+avg);
             System.out.println("Grade :Pass 'C' ");


        }
        else
        {
            System.out.println("the avg marks you scored is"+avg);
             System.out.println("Grade :FAIL 'F' ");
            
        }


        sc.close();

        



        


        
    }
}