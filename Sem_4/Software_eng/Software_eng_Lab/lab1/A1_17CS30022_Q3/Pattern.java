import java.util.Scanner;

public class Pattern
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter number of lines:- ");
        int num = scan.nextInt();
        scan.close();
        int cnt=1,line_cnt=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=line_cnt;j++)
                System.out.printf("%d ",cnt++);
            line_cnt++;
            System.out.println();
        }
    }
}
