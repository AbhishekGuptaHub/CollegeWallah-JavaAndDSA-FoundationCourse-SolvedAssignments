import java.util.Scanner;

public class Question1Solution
{
    public static int countDigits(int n)
    {
        if (n / 10 == 0)
        {
            return 1;
        }

        return countDigits(n / 10) + 1;
    }

    public static int checkArmstrong(int n, int digits)
    {
        if (n / 10 == 0)
        {
            return (int)Math.pow(n % 10, digits);
        }

        return checkArmstrong(n / 10, digits) + (int)Math.pow(n % 10, digits);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter a number n: ");
        n = sc.nextInt();

        int digits = countDigits(n);

        if (checkArmstrong(n, digits) == n)
        {
            System.out.println("Given number is an armstrong number!");
        }
        else
        {
            System.out.println("Given number is not an armstrong number!");
        }
    }
}
