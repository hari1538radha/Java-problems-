import java.util.*;
public class HelloWorld {

    public static void main(String []args) {
        // System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter the order of matrix"); 
        int n = scan.nextInt();
            System.out.println("Enter the matrix elements"); 
        int arr[][] = new int[n][n];
        for(int i=0; i<n ; i++) 
        {
            for(int j =0; j<n;j++)
            {
                 arr[i][j]=scan.nextInt();
            }
           
        }  
        System.out.println("Output of the 90 degree matrix"); 
        for(int i=0; i<n ; i++) 
        {
            for(int j =n-1; j>=0;j--)
            {
                    System.out.print(arr[j][i] + " "); 
            }
                    System.out.println(" "); 
            
           
        } 
        System.out.println("Output of the 180 degree matrix"); 
        for(int i=n-1; i>=0 ; i--) 
        {
            for(int j =n-1; j>=0;j--)
            {
                    System.out.print(arr[i][j] + " "); 
            }
                    System.out.println(" "); 
            
           
        }
       
    }
}
