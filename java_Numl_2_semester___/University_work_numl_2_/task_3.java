import java.util.Scanner;
public class task_3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student attendence ");
        int main = input.nextInt();
        System.out.println("Obtained marks in quizes (Total = 30)");
        int a = input.nextInt ();
        System.out.println("Students obtained marks in assignment");
        int  ab = input.nextInt();

        int total_marks = a + ab ;
        int new_1 = total_marks / 50 * 100;
        
        if(main > 75 && new_1 > 70){
            System.out.println("Student is eligible for the exam ");
        }else{
            System.out.println("Student is not eligible for the exam ");
        }

    }
}
