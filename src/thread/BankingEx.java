package thread;

class Bank 
{   
   synchronized void withdrawn(String name, int withdrawal)  
   {	
	    int total = 10;
        if (total >= withdrawal)
        {
            System.out.println(name + " withdrawn " + withdrawal);
 
            total = total - withdrawal;
            
            System.out.println("Balance after withdrawal: " + total +  "   You can not withdraw money below 500" );
            
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e)
            {            
                e.printStackTrace();
            }
        }       
        else
        {
            System.out.println(name + " you can not withdraw "  + withdrawal);
 
            System.out.println("your balance is unsufficient : " + total);
   
            try 
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
 
   synchronized void deposit(String name, int deposit)
    {
    	 int total = 10;
        System.out.println(name + " deposited " + deposit);
        
        System.out.println("Balance after deposit: " + total);
        
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BankingEx
{
    public static void main(String[] args)
    {      
        Bank obj = new Bank();
       
        obj.withdrawn("Divya", 50);
        obj.withdrawn("Kamal", 300);
        obj.deposit("Sayali", 100);
        obj.withdrawn("Kartik", 100);
        obj.withdrawn("Manish", 50);
    }
}

