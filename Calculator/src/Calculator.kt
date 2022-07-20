
    import java.util.Scanner;

    public class Calculator {
        private Scanner scanner = new Scanner(System.in);
        public Calculator(){
            System.out.println("Calculator");
        }
        public void addition(){
            System.out.println("Please Enter Your Values: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double sum = a+b;
            System.out.println("Addition of: "+a+" + "+b+ " = " + sum);
        }
        public void subtraction(){
            System.out.println("Please Enter Your Values: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double sub = a-b;
            System.out.println("Subtraction of: "+a+" - "+b+ " = " + sub);
        }
        public void multiplication(){
            System.out.println("Please Enter Your Values: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double mul = a*b;
            System.out.println("Multiplication of: "+a+" * "+b+ " = " + mul);
        }
        public void division(){
            System.out.println("Please Enter Your Values: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double div = a/b;
            System.out.println("Division of: "+a+" / "+b+ " = " + div);
        }