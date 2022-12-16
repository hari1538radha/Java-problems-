import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int a=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>(long)arr[j]*2)
                {
                   a++;
                }
            }
        }
        System.out.println(a);
    }
}