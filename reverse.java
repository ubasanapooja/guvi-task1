import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int reverse=0;
        int rem=0;
        while(n>0)
        {
            rem=n%10;
            reverse= (reverse*10)+rem;
            n=n/10;

        }
        System.out.println("reversed number is :"+reverse);
    }
    
}
