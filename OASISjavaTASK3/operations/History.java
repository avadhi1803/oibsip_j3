package operations;

import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class History
{
public void history(String userName1) throws Exception
{
out.println("TRANSACTIONS HISTORY\n");
File file2 = new File("C:\\Users\\lenovo\\Desktop\\OASISjavaTASK3\\operations\\history"+userName1+".txt");
FileReader fr = new FileReader(file2);
BufferedReader br = new BufferedReader(fr);
String hist;
while((hist=br.readLine())!=null)
out.println(hist);
}
}