package operations;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Date;

public class Deposit
{
public int deposit(int amount, String userName1) throws Exception
{
Scanner sc = new Scanner(System.in);
FileWriter file = new FileWriter("C:\\Users\\lenovo\\Desktop\\OASISjavaTASK3\\operations\\history"+userName1+".txt",true);
out.println("Enter amount to be deposited");
int dpstAmt = sc.nextInt();
if(dpstAmt>=100)
{
amount = amount + dpstAmt;
out.println("Amount deposited successfully");
String dpstDetail = "\nAmount of Rs. "+dpstAmt+" deposited successfully at ";
file.write(dpstDetail+new Date());
file.close();
}
else
out.println("Minimum amount that can be deposited is 100 Rs.");
return amount;
}
}