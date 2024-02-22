import java.util.Scanner;

public class Armstrong
{
public static void main(String args[])
{
    System.out.print("Enter  the number : ");
    

    int num= sc.nextInt();
    
    int temp=num;
    int rem=0;
    int sum=0;
    while(num!=0)
    {
     rem=num%10;
     sum=sum+rem*rem*rem;
     num=num/10;
    }
  if(sum == temp)
     System.out.println(temp + " is an Armstrong number.");
  
  else
     System.out.println(temp + " is not an Armstrong number.");
}
}


    

 