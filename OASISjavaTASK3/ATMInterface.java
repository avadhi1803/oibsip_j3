import operations.Balance;
import operations.Deposit;
import operations.History;
import operations.Quit;
import operations.Transfer;
import operations.Withdraw;
import static java.lang.System.out;
import java.util.Scanner;

class ATMInterface
{
static int CHECK=0;
static int amount=49780;
static String userName2;
static String userPin2;
static String userName1;

static void login() throws Exception
{
Scanner sc = new Scanner(System.in);
out.println("Please enter the username");
userName1 = sc.next();
out.println("Please enter the userpin");
String userPin1 = sc.next();

if((userName1.equals("avadhi") && userPin1.equals("123456")) || (userName1.equals(userName2) && userPin1.equals(userPin2)))
{
functions();
}
else
{
++CHECK;
if(CHECK<3)
{
out.println("Incorrect details.");
login();
}
else
{
out.println("You entered incorrect details 3 times. \nYou can't proceed further now!");
System.exit(0);
}
}
}

static void functions() throws Exception
{
Scanner sc = new Scanner(System.in);
History histry = new History();
Withdraw wthdrw = new Withdraw();
Deposit dpost = new Deposit();
Transfer trnsfr = new Transfer();
Balance blnce = new Balance();
Quit qt = new Quit();
while(true)
{
out.println("Which of the following operations, you want to perform?");
out.println("1) Transactions History \n2) Withdraw \n3) Deposit \n4) Transfer \n5) Check Balance \n6) Quit");
byte func = sc.nextByte();
switch(func)
{
case 1:
histry.history(userName1);
break;

case 2:
amount = wthdrw.withdraw(amount, userName1);
break;

case 3:
amount = dpost.deposit(amount, userName1);
break;

case 4:
amount = trnsfr.transfer(amount, userName1);
break;

case 5:
blnce.balance(amount);
break;

case 6:
qt.quit();
break;

default:
out.println("Invalid choice!");
}
}
}


public static void main(String...ar) throws Exception
{
Scanner sc = new Scanner(System.in);
out.println("Welcome! Please verify yourself. \n1) Already a member \n2) New Account");
byte choice = sc.nextByte();
switch(choice)
{
case 1:
login();
break;

case 2:
out.println("Enter your name");
String fullName = sc.next();
out.println("Enter the username");
userName2 = sc.next();
out.println("Enter the userpin");
userPin2 = sc.next();
out.println("Please proceed to login!");
login();
break;

default:
out.println("Invalid choice");
System.exit(0);
}
}
}