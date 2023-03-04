import java.util.Scanner;


public class lab_4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int count = 0;
            int main_3 = 0;
            int main_1 = 0 , main_2 = 0;
            System.out.println("Enter your Discline");
            System.out.println("1 for BSCS");
            System.out.println("2 for BSIT");
            System.out.println("3 for BSSE");
            System.out.println("-1 for exit ");
               int make_count =  0;
            while(true){
                System.out.println("Class");
               main_3 = input.nextInt();

                 make_count++;   
                
                 if(main_3 == 1){
                     count = count + 1 ;
            
                 }else if(main_3 == 2){
                     main_1 = main_1 + 1; 
               
                 }else if(main_3 == 3){
                     main_2 = main_2 + 1;
                 
                 }

            

                   if(main_3 == -1){
                    break;
                   }
            

                
            }
            System.out.println("Total number of students in Dept of CS/IT/SE ");
            System.out.println(make_count - 1);



            System.out.println("Discipline wise Strenght");
            
                
                System.out.print("BSCS :");
                System.out.println(count);
          
                System.out.print("BSIT :");
                System.out.println(main_1);
      
                System.out.print("BSSE :");
                System.out.println(main_2);
        
        }
        }

