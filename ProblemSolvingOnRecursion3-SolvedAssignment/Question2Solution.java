import java.util.Scanner;

public class Question2Solution
{
    public static int mthSummation(int n, int m)
    {
        if (m == 1 && n == 1)
        {
            return 1;
        }
        else if (m == 1)
        {
            return n + mthSummation(n - 1, 1);
        }

        return mthSummation(mthSummation(n, m - 1), 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.print("\nEnter n: ");
        n = sc.nextInt();
        System.out.print("Enter m: ");
        m = sc.nextInt();

        System.out.println("Required sum: " + mthSummation(n, m));
    }
}
