//program to find balance

class Bank
{
int currentbal=50000;

public void getCurrentBalance()
{
 
 System.out.println("Initial Current Balance is"  +currentbal);
 //return currentbal;
}

public void deposit(int dep_amt)
{
 currentbal=currentbal+dep_amt;
 System.out.println("balance after deposit "  +currentbal);
}

public void withdraw(int with_amt)
{
  if (with_amt > currentbal)
   {
    System.out.println("Invalid ");
   }
  else
  {
    currentbal=currentbal-with_amt;
   System.out.println("valid");
   System.out.println(" Current Balance after withdraw  is"  +currentbal);

  }
}

public static void main(String args[])
{
Bank b=new Bank();
b.getCurrentBalance();
b.deposit(30000);
b.withdraw(2000);
}
}

