import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class task_1 {
   public static void main(String[] args){


    Scanner input = new Scanner(System.in);
      
    System.out.println("Enter your character :");
    String main = input.next(); 

    System.out.println("With println");
    System.out.println(main + "     " + main + "     " +main + "     " +main + "     "+ main );
    System.out.println("With printf\n");

    System.out.printf("%s     %s     %s     %s     %s ",main,main,main,main,main);
   }
}
