package javaproject;
import java.util.Scanner;
public class SumOfEvennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number,i,evenSum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
number=sc.nextInt();
for(i=1;i<=number;i++)
{
	if(i%2==0)
	{
		evenSum=evenSum + i++;
		System.out.println("\the sum of Even Number" +evenSum);
	}
}

	}

}
