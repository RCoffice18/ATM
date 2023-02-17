import java.util.Scanner;
public class StudentMark
{
    public static void main(String[] args)
    {
        int n;
        int roll;
        int total = 0;
        int percentage;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Student roll number = ");
        roll = s.nextInt();
        System.out.println("Enter the Student name = ");
        String name = s.next();
        System.out.println("Enter the no of subject = ");
        n = s.nextInt();
        int [] marks = new int[n];
        System.out.println("Enter marks out of 100 :");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("The total mark : "+total);
        System.out.println("The percentage : "+percentage);
        if(percentage > 80){
            System.out.println("Grade : A");
        }
        else if(percentage>=60){
            System.out.println("Grade : B");
        }
        else if(percentage>=45){
            System.out.println("Grade : C");
        }
        else if(percentage>=35){
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Fail");
        }
    }
}