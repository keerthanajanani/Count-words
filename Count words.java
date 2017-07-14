# Count-words
import java.io.*;
import java.util.*;
public class Count words
{
public static void main(String args[])throws IOException
{
int i,count=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the input string:");
String s=br.readLine();
for(i=0;i<s.length()-1;i++)
{
if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
{
count++;
}
}
System.out.println("Number of words in a String : "+count);
}
}
