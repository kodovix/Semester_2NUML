import java.util.Random;
import java.util.stream.IntStream;

public class lab_4_2{
        public static void main(String[] args) {
            Random ran = new Random();
            Random ran_1 = new Random();
            
                
            IntStream number = ran.ints(5,0,9999);
            IntStream number_1 = ran.ints(1,1000,9999);
            
                System.out.println("Printing 5 Different 4 Digit pins");
                number.forEach(System.out::println);

        System.out.print("4 digits pins : ");
        number_1.forEach(System.out::println);

        System.out.println("Printing 5 Different 4-digit pins using loop ");
                int range = 1000;
                int rang_2 = 1000;
                
                int i = 1;
                while(i<=5){
                        IntStream new_1 = ran_1.ints(1 , 1000 , 9999);
                        System.out.printf("PIN %d :",i );
                       
                        
                       
                        new_1.forEach(System.out::print);
                        System.out.println();
                        
                        i++;
                }



            
        }





}