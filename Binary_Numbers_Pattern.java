import java.util.Scanner;
public class Binary_Numbers_Pattern {

    /*
    1
    1 0
    1 0 1
    1 0 1 0
    1 0 1 0 1
    1 0 1 0 1 0
    */
    private static void Pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==0) // check column wise even or not......
                {
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
                
            }
            System.out.println();
        }

    }
    /*
    1 
    0 0
    1 1 1
    0 0 0 0 
    1 1 1 1 1
    0 0 0 0 0 0
    */
    private static void Pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0) // check row wise even or not......
                {
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
                
            }
            System.out.println();
        }

    }
    /*
    1
    0 1
    0 1 0
    1 0 1 0
    1 0 1 0 1
    0 1 0 1 0 1 
    */
    private static void Pattern3UsingThirdVar_k(int n)
    {
        int k=1;
        for(int i=1;i<=n;i++)
        {
           
            for(int j=1;j<=i;j++)
            {
                if(k%2==0) // check column wise even or not......
                {
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
                k++;
                
            }
            System.out.println();
        }

    }
    /*
    1
    1 1
    1 0 1
    1 0 0 1
    1 0 0 0 1
    1 1 1 1 1
    */
    private static void Zeros_Inside_HalfBinaryPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1||i==n||i==j||j==1) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern1(6);
        Pattern2(6);
        Pattern3UsingThirdVar_k(6);
        Zeros_Inside_HalfBinaryPyramid(6);

    }
}
