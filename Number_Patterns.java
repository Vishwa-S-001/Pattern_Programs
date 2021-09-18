import java.util.Scanner;
public class Number_Patterns
{
    public static Scanner sc= new Scanner(System.in);

    /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
    */
    private static void HalfPyramidIncreasing()
    {
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*
        1
        2 3 
        4 5 6
        7 8 9 10
        11 12 13 14
    */
    private static void FloydsTriangle()
    {
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        int val=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((val++)+" ");
            }
            System.out.println();
        }
    }
    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */
    private static void ReverseHalfPyramidIncreasing()
    {
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
   /*
    1 2 3 4 5
    2 3 4 5
    3 4 5
    4 5
    5
    */
    private static void ReverseHalfPyramidIncreasingModel_1()
    {
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1 
    2 3
    3 4 5
    4 5 6 7
    5 6 7 8 9
    */
    private static void HalfPyramidIncreasingModel_2()
    {
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=(i*2)+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    5 6 7 8 9
    4 5 6 7
    3 4 5
    2 3
    1
    */
    private static void ReverseHalfPyramidIncreasingModel_2()
    {
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=(i*2)-1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1 3 5 7 9
    3 5 7 9
    5 7 9
    7 9
    9
    */
    private static void ReverseHalfPyramidIncreasingModel_3()
    {
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n*2;i+=2)
        {
            for(int j=i;j<=(n*2)-1;j+=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    1 2 3
    1 2 3 4 5 
    1 2 3 4 5 6
    1 2 3 4 5 6 7
    */
    private static void OddNoOfCols(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i*2;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    1
    2 4 
    1 3 5
    2 4 6 8
    1 3 5 7 9
    */
    private static void OddEvenAlternatingRows(int n)
    {
        int k;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0) k=2;
            else k=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print((k)+" ");
                k+=2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
       // HalfPyramidIncreasing();
        //FloydsTriangle();
       // ReverseHalfPyramidIncreasing();
        //ReverseHalfPyramidIncreasingModel_1();
       // ReverseHalfPyramidIncreasingModel_2();
       // ReverseHalfPyramidIncreasingModel_3();
        //HalfPyramidIncreasingModel_2();
        OddNoOfCols(5);
        OddEvenAlternatingRows(5);


    }
}