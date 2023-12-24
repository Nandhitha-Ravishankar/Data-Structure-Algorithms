import java.util.*;
class QuadraticProbing{
	Nodex a[]=new Nodex[10];

	void insert(int key,String n) {int index;
	int probes=0;
	index=key%10;
	int t=index;
		if(a[index]==null)
			a[index]=new Nodex(key,n);
		else 
			{
				while(a[index]!=null) {
					index=(t+(probes*probes))%10;
					probes+=1;
				
				}a[index]=new Nodex(key,n);
			}System.out.println("The number of probes is "+probes);
		}
	void delete(int key) {int index;int probes=0;
	index=key%10;
	int t=index;
	if(a[index]==null) {probes=1;
		do {
			index=(t+(probes*probes))%10;
			probes+=1;
		}while(a[index].RegNo!=key);
	a[index]=null;
	}
	else if(a[index].RegNo!=key) {
		while(a[index].RegNo!=key) 
			{index=(t+(probes*probes))%10;
			probes+=1;}
		a[index]=null;}
	else a[index]=null;
	System.out.println("The key value "+key+" has been deleted");	
	}

	boolean search(int key) {int index;int probes=0;
	boolean flag=false;
	index=key%10;
	int t=index;
	 if(a[index]==null) {probes=1;
			do {
				index=(t+(probes*probes))%10;
				
				probes+=1;
				if(a[index]!=null&&a[index].RegNo==key)break;
			}while(a[index]!=null);
				
		if(a[index]!=null&&a[index].RegNo==key) {System.out.println("The element at key "+key+" is "+a[index].Name);flag=true;}
		else ;
	}


	else if(a[index].RegNo!=key) {while(a[index].RegNo!=key) 
							{
								index=(t+(probes*probes))%10;
								probes+=1;
							}
	System.out.println("The element at key "+key+" is "+a[index].Name);flag=true;

	}
	else {System.out.println("The element at key "+key+" is "+a[index].Name);flag=true;}
		
	return flag;
	}
	void display() {
	System.out.println("***The mod 10 value of each input is taken***");
	System.out.println("The Hash Table is:");
	int i=0;

	while(i!=10) {Nodex temp=a[i];
		if(temp==null)System.out.println("Bucket "+i+" --> Null");
		else System.out.println("Bucket "+i+" --> "+temp.RegNo+"|"+temp.Name);
		i++;
		
		}
	}
}
public class Hashtable_QuadraticProbing {
	public static void main(String[] args) {Scanner scan=new Scanner(System.in);
	int choice;
	QuadraticProbing q=new QuadraticProbing();
	int count=0;
	do {if(count==0) System.out.println("***Quadratic Probing***\nChoose\n1.Insert\n2.Delete\n3.Search\n4.Display all elements\n0.Exit");
	else System.out.println("\n***Quadratic Probing***\nChoose\n1.Insert\n2.Delete\n3.Search\n4.Display all elements\n0.Exit");
	choice=scan.nextInt();int key;count++;
	switch(choice) {
	case 1:	do {
			System.out.println("Enter a positive key(Enter 0 to terminate) ");
			key=scan.nextInt();
			if(key!=0) {System.out.println("Enter a name");String n=scan.next();q.insert(key,n);}
			else ;
				}while(key!=0);break;
	case 2:System.out.println("Enter the key value of the item to be deleted");
			int k=scan.nextInt();
			if(q.search(k)==false) {System.out.println("Element not found");break;}
			else q.delete(k);
			break;
	case 3:System.out.println("Enter the key value of the item to be searched");
		  	int ke=scan.nextInt();
		  	if(q.search(ke));
		  	else System.out.println("The key is not found");break;
	case 4:q.display();break;
	case 0: break;
	}
	}while(choice!=0);
	
   }


}
