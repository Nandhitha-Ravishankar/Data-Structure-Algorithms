import java.util.*;
import java.util.Scanner;
public class Hashtable {
	

	public static void main(String[] args) {
		
		int index,key,a[]=new int[10];
		System.out.println("***This is the implementation of a Normal Hashtable***\n***The mod value is 10***");
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Enter a positive key(>=0)");
			key=s.nextInt();
			if(key>=0)
			{
				index=key%10;
				a[index]=key;
			}
		}
		while(key>0);
		System.out.println("Hash Table is:");
		for(int i=0;i<10;i++)
		{
			System.out.println("bucket"+i+"-->"+a[i]);
		}

	}

}