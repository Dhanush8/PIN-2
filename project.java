import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int input=1;
        
        while(input<=3)
        {
            System.out.print("Enter the PIN: ");
            int pin=sc.nextInt();
            
            if(pin==1234)
            {
                System.out.println("Unlocked");
                break;
            }
            else if(pin!=1234 && input<3)
            {
                System.out.println("Try Again");
            }
            input++;
        }
            if(input>3)
                
                System.out.println("Locked");
        
        
    
     
    }
    
}
