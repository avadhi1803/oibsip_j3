package operations;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Date;

public class Withdraw
{
public int withdraw(int amount, String userName1) throws Exception
{
Scanner sc = new Scanner(System.in);
FileWriter file = new FileWriter("C:\\Users\\lenovo\\Desktop\\OASISjavaTASK3\\operations\\history"+userName1+".txt",true);
out.println("Enter amount to be withdrawn");
int withdrawAmt = sc.nextInt();
if(withdrawAmt + 1000 <= amount)
{
amount = amount - withdrawAmt;
out.println("Amount withdrawn successfully");
String withdrawDetail = "\nAmount of Rs. "+withdrawAmt+" withdrawn successfully at ";
file.write(withdrawDetail+new Date());
file.close();
}
else
out.println("Insufficient balance!");
return amount;
}
}