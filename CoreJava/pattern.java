import java.util.Scanner;
public class pattern
{
    public static void main(String args[]) 
    {
        int n, i, j, space = 2,count=1;
        //System.out.print("Enter the number of rows: ");
       // Scanner s = new Scanner(System.in);
       // n = s.nextInt();
        //space = 2; //3 - 1;
        for (j = 1; j <= 3; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print("   ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print(5*count+" "); 
				count++;
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= 2; j++) //3-1
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print("   ");
            }
            space++;
            for (i = 1; i <= 2 * (3 - j) - 1; i++) 
            {
                System.out.print(5*count+" ");
				count++;
            }
            System.out.println("");
        }
    }
}