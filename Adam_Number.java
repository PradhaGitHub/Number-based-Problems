/*logic ==>
Example
Check if 12 is an Adam Number:
Reverse 12:reverse(12)=21.
Compute Squares:
12^2=144
21^2=441
Reverse the Square of 21:
Reverse 441: 
reverse(441)=144.
Compare:
12^2=144
reverse(21^2)=144
Conclusion: 12 is an Adam Number.
*/
import java.util.*;
public class Adam_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n*n;
        int res=0;
        while(n!=0){
            int rev=n%10;
            res=res*10+rev;
            n/=10;
        }
        int b=res*res;
        int rel=0;
        while(b!=0){
            int rev=b%10;
            rel=rel*10+rev;
            b/=10;
        }
        if(a==rel){
            System.out.print("Adam Number");
        }
        else{
            System.out.print("Not a Adam Number");
        }

    }
        
}
