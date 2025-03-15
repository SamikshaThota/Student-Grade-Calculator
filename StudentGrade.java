import java.util.Scanner;
class student{
    String name;
    int[] marks=new int[5];
    public void inputDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student name: ");
        name=sc.nextLine();
        System.out.println("enter the student marks: ");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
    }
    public int calculateTotal(){
        int total=0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    public int calculateAverage(){
        return calculateTotal()/marks.length;
    }
    public char calculateGrade(){
        int avg=calculateAverage();
        if(avg>=90){
            return 'A';
        }
        else if(avg>=80){
            return 'B';
        }
        else if(avg>=70){
            return 'C';
        }
        else if(avg>=60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public void displayResult(){
        System.out.println("name :"+name);
        System.out.println("total: "+calculateTotal());
        System.out.println("Average: "+calculateAverage());
        System.out.println("Grade: "+calculateGrade());
    }
}
public class StudentGrade{
    public static void main(String[] args) {
        student s=new student();
        s.inputDetails();
        s.displayResult();
    }
}
