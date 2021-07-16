import java.util.Scanner;
public class floyed_triangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,j;
        int a=1;
        System.out.println("Enter the value which you want to make the triangle:  ");
        n=sc.nextInt();
        for ( i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
                System.out.printf("%d\t",a++);
            System.out.printf("\n");
        }

    }
}
