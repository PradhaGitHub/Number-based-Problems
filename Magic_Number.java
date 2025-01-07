/*logic==>
For example, consider n=1729
sum of digits = (1 + 7 + 2 + 9 => 19)
The reverse of 19 is 91
(19 X 91 = 1729)*/
import java.util.*;
public class Magic_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dupli=n;
        int res=0,rec=0;
        while(n!=0){
            int rem=n%10;
            res=res+rem;
            n=n/10;
        }
        int temp=res;
        while(res!=0){
            int rem=res%10;
            rec=rec*10+rem;
            res/=10;
        }
        if(temp*rec==dupli){
            System.out.print("Magic Number");
        }
        else{
            System.out.print("Not a Magic Number");
        }
}
}