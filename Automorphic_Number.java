/*logi==>
Example
For number 25:
Square:25^2=625
Last digits of 625 = 25 (same as the original number).
So, 25 is an Automorphic Number*/
import java.util.*;
public class Automarphic_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0;
        int m=n*n;
        boolean flag=false;
        if(n%10!=0){
        while(n!=0){
                int rev=n%10;
                b=b*10+rev;
                n/=10;
            }
        while(m!=0){
            int rec=m%10;
            a=a*10+rec;
            if(b==a){
                flag=true;
            }
            m/=10;
        }
        }
        else{
            flag=false;
        }
        if(flag==true){
            System.out.print("Automorphic Number");
        }
        else{
            System.out.print("Not a Automorphic Number");
        }
}
}