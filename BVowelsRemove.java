import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="";
        char ch[]=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=sc.next().charAt(0);
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='A'||ch[i]=='E'||ch[i]=='e'||ch[i]=='i'||ch[i]=='I'||ch[i]=='O'||ch[i]=='o'||ch[i]=='U'||ch[i]=='u')
            continue;
            str+=ch[i];
        }
        System.out.println(str); StringBuffer s=new StringBuffer(str);
        
        System.out.println(s.reverse());
     
    }
}
