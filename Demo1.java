import java.util.Scanner;
public class Demo1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no");
  int n=sc.nextInt();
  int k=0;
  for(int i=0;i<n;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(k);
    k++;
   }
   System.out.println();
  }

 }

}