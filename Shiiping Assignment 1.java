import java.util.Scanner;

public class App {



 public static void main(String[] args) {
    
   

        //creating prompt

        System.out.println("Please enter a weight value");

        Scanner scanner= new Scanner(System.in);
        double weight = scanner.nextDouble();


        //output display
        System.out.println("The calculated weight is:" +weight+"pounds");

        //applying if and else to calculate for shippping cost
        if (weight>2 && weight<=2){
            System.out.println("Shipping cost is 2.5 pounds for " + weight+ "pounds");
        }
        else if(weight>2 && weight<=4){
            System.out.println("Shipping cost is 4.5 pounds for " + weight+ "pounds");
        }
        else if(weight>4 && weight<=10){
            System.out.println("Shipping cost is 7.5 pounds for " + weight+ "pounds");
        }
        else if(weight>10 && weight<=20){
            System.out.println("Shipping cost is 10.5 pounds for " + weight+ "pounds");
        }

         
        }

    }
    
