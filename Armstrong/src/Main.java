import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int total=0,step=0,number;
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();

            int tempNumber = number;
           while (tempNumber != 0){
               tempNumber /= 10;
               step++;
           }
           tempNumber = number;
           while (tempNumber != 0){
               int value = tempNumber % 10;
               total += Math.pow(value,step);
               tempNumber /= 10;
           }
           if(total == number){
               System.out.println(number+" armstrong is a number.");
           }else{
               System.out.println(number+" armstrong is not a number.");
           }
    }
}
