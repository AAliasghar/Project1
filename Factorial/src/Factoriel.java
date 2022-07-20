import java.util.Scanner;

public class Factoriel {
    private int number;

    private Scanner scanner = new Scanner(System.in);
    public Factoriel(){
        System.out.println("Factorial Running Here: ");
    }
    //Factorial Using While Loop
    public void factorialForLoop(){
        int fact_var = 1;
        System.out.println("Factorial Using For Loop ");
        System.out.println("Please Enter Your Number: ");
        number = scanner.nextInt();
        for (int i = 1; i <=number;i++){
            fact_var = fact_var * i;
        }
        System.out.println("Factorial Number of "+number+"! = " +fact_var);

    }
    //Factorial Using For Loop
    public void factorialWhileLoop(){
        int fact_var = 1;
       // while ()
        System.out.println("Please let me if you want to try more factorial");
       // char answer = scanner.ne
       // if ()
        System.out.println("Factorial Using While Loop ");
        System.out.println("Please Enter Your Number: ");
        int i =1;
        number = scanner.nextInt();
        while(i <= number){
            fact_var = fact_var * i;
            i++;
        }
        System.out.println("Factorial Number of "+number+"! = " +fact_var);
    }


}
