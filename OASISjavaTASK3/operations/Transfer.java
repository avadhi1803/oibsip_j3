package operations;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Date;

public class Transfer
{
public int transfer(int amount, String userName1) throws Exception
{
Scanner sc = new Scanner(System.in);
FileWriter file = new FileWriter("C:\\Users\\lenovo\\Desktop\\OASISjavaTASK3\\operations\\history"+userName1+".txt",true);
out.println("Enter the account number, to which you wish to transfer the amount");
long transAcct = sc.nextLong();
out.println("Enter their bank name");
String bankName = sc.next();
out.println("Enter the account holder name");
String transName = sc.next();
out.println("Enter the amount to be transferred");
int transAmt = sc.nextInt();
if(transAmt + 1000 <= amount)
{
amount = amount - transAmt;
out.println("Amount transferred successfully");
String transdetail = "\nAmount of Rs. "+transAmt+" transferred successfully to "+transName+" at ";
file.write(transdetail+new Date());
file.close();
}
else
out.println("Insufficient balance!");
return amount;
}
}