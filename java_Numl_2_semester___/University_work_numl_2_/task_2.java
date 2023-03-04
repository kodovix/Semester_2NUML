import java.util.Scanner;

public class task_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String name = input.nextLine();
        System.out.println("Enter your last name :");
        String name_1 = input.nextLine();

        System.out.println("Enter your  city :");
        String  n_1_ = input.nextLine();

        System.out.println("Enter your mobile number :");
        int  n_1 = input.nextInt();


        System.out.println("Name : "+name+" "+name_1);
        System.out.println("City : "+n_1_);
        System.out.println("Mobile number: "+n_1);

    }
}
