import  java.util.*;
public class erothostheves {
    public static void main (String args[]){
         int j;
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter the number upto where you want prime numbers");
        int n = Sc.nextInt();
        int a[]= new int[n];
        for (int i=0; i<n;i++)
        {
            a[i]=i+1;
        }
        for (int i=2;i<n;i++)
        {
            for( j= 1;j<n;j++)
            { if(a[j]==i)
                continue;
              if(a[j] % i == 0){
                a[j]=0;
            }
            // j=2;
        }
    }
    
        
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            System.out.print(a[i]+ " ");
        }}

  
}
