import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input_2 = new Scanner(System.in);
        while(true){
        System.out.println("Categories ");
        System.out.println("A -- 50%");
        System.out.println("B -- 30%");
        System.out.println("C -- 15%");
            System.out.println("Enter the name of the 1 item");
            String main = input_2.nextLine();

            System.out.println("Price of the 1 item :");
            int main_1 = input.nextInt();

            System.out.println("Quantity of the 1 item :");
            int main_1_  =input.nextInt();

            System.out.println("Enter the name of the 2 item");
            String _new_2= input_2.nextLine();

            System.out.println("Price of the 2 item :");
            int new_2_ = input.nextInt();

            System.out.println("Quantiy of the 2 item :");
            int new_2__ = input.nextInt();

            System.out.println("Enter the name of the 3 item :");
            String new_3 = input_2.nextLine();

            System.out.println("Price of the 3 item :");
            int new_3_ = input.nextInt();
            System.out.println("Quantiy of the 3 item :");
            int new_3__ = input.nextInt();




            System.out.println("Category");
            String new__4___ = input.next();

            System.out.println("Total bill : ");
            int new__4__ = input_2.nextInt();

            if(new__4___ == "A"){
                int dc = new__4__ - 50;
                System.out.println("you have to pay :");
                System.out.println(dc);
            }else if(new__4___ == "B"){
                int dc = new__4__ - 30;
                System.out.println("you have to pay :");
                System.out.println(dc);
            }else if(new__4___ == "C"){
                int dc = new__4__ - 15;
                System.out.println("you have to pay :");
                System.out.println(dc);
            }else{
                System.out.println("invalid choice");
            }
            
        
            System.out.println("Do you want to quit  : ");
            String a_1 = input.next();
            if (a_1 == "y"){
                break;
            }else{
                continue;
            }
        }
    }
   
}
