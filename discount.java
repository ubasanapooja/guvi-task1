import java.util.*;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amt=sc.nextInt();
        double finalamt=0;
        if(amt<500)
        {
            System.out.println(amt);

        }
        else if(amt>500&&amt<1000)
        {
            finalamt=0.9 *amt;
            System.out.println(finalamt);
        }
        else 
        {
            finalamt=0.8*amt;
            System.out.println(finalamt);
        }
        
    }
    
}
