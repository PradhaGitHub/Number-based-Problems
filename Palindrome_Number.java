import java.util.*;
public class Palindrome_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0,temp=n;
        while(n!=0){
            int rev=n%10;
            res=res*10+rev;
            n=n/10;
        }
        if(temp==res){
            System.out.print("Palindrome Number");
        }
        else{
            System.out.print("Not a Palindrome Number");
        }
    }
        
}
