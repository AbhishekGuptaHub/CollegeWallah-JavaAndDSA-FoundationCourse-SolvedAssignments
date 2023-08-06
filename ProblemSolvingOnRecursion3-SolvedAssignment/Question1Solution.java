import java.util.Scanner;

public class Question1Solution
{
    public static void printPattern(int n)
    {
        if (n <= 0)
        {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printPattern(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter a number n: ");
        n = sc.nextInt();

        System.out.println("Required pattern is follows below:");
        printPattern(n);

        System.out.print("\n");
    }
}
