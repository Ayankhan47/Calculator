import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("WELCOME TO CALCULATOR !!");
            System.out.println("enter the numbers : ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println("1.press 1 to add \n2.prees 2 to subtract \n3.pree 3 to mutiply \n4.press 4 to divide");
            System.out.println("enter the opration number : ");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("sum = "+(num1+num2));
            } else if (a == 2) {
                if(num1>num2) {
                    System.out.println("difference = " + (num1 - num2));
                }else{
                    System.out.println("difference = "+ (num2-num1));
                }
            } else if (a == 3) {
                System.out.println("product = " + (num1 * num2));
            } else if (a == 4) {
                double ans = (num1 / num2);
                System.out.println("ans = " + ans);
            }
            System.out.println("please prees 1 to restar !!");
            n = sc.nextInt();
            if (n!=1){
                System.out.println("invalid input !");
            }
        } while (n == 1);
    }
}