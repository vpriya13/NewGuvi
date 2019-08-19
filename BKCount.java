import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int k=sc.nextInt();
      int count=0;
      
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        if(arr[i]==k)
        count++;
          
      }
      System.out.println(count);
     
    }
}
