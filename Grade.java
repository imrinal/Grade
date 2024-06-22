import java.util.*;
public class Grade {
    //Main Class;
    public static void main(String[] args) {
        try(Scanner s=new Scanner(System.in)){
            //initializing the variables;
            double eng,sst,sci,cmp,tmarks;
            int avg=0;
            String Grade="",name,rollno;

            //Taking input from the user;
            System.out.print("Enter Your Name: ");
            name=s.nextLine();
            System.out.print("Enter Your Roll No: ");
            rollno=s.nextLine();
            System.out.println();

            //Entering the marks;
            System.out.println("______Marks Entry (Out of 100)______");
            System.out.print("English:");
            eng=s.nextDouble();
            System.out.print("Social Studies:");
            sst=s.nextDouble();
            System.out.print("Science:");
            sci=s.nextDouble();
            System.out.print("Computer:");
            cmp=s.nextDouble();
            System.out.println();

            //Total Marks of all the four subjects;
            tmarks=eng+sst+sci+cmp;
            //Average Marks of the four subjects;
            avg=(int)(tmarks/4);

            /* Grading according to the average marks obtained;
            Marks           Grade
            Above 90        A+ (Excellent)
            81 to 90        A (Very Good)
            71 to 80        B+ (Good)
            61 to 70        B (Satisfactory)
            51 to 60        C+ (Acceptable performance)
            35 to 50        C (Minimum passing grade)
            Below 35        F (Fail)
            */
            if(avg > 90)
            {
                Grade="A+";
            }
            else if(avg > 80 && avg <= 90)
            {
                Grade="A";
            }
            else if(avg > 70 && avg <= 80)
            {
                Grade="B+";
            }
            else if(avg > 60 && avg <= 70)
            {
                Grade="B";
            }
            else if(avg > 50 && avg <= 60)
            {
                Grade="C+";
            }
            else if(avg > 35 && avg <= 50)
            {
                Grade="C";
            }
            else{
                Grade="F";
            }

            //Displaying the desired Output;
            System.out.println("_______Report Card:_______");
            System.out.println("Name: "+name);
            System.out.println("Roll No: "+rollno);
            System.out.println();
            System.out.println("Total Marks: "+tmarks+"/400");
            System.out.println("Average Marks: "+avg);
            System.out.println("Grade: "+Grade);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());}
    }
}
