import java.util.Scanner;
 
public class  ScannerName{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("what is  your name :");
         String name = input.nextLine();
        
         System.out.print("Enter the mathematics scores you got:");
         int mathematics = input.nextInt();

         System.out.print("Enter the biology scores you got:");
         int biology = input.nextInt();

           System.out.print("Enter the geography scores you got:");
         int geography = input.nextInt();

         System.out.printf("%n my name is %s ", name);
         System.out.printf("%n i have got %d scores in mathematics ", mathematics);
         System.out.printf("%n i have got %d scores in biology ", biology);
         System.out.printf("%n i have got %d scores in geography ", geography);
    }
}