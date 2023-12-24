import java.util.*;
class Nodex{
	int RegNo;
	String Name;
	int index;
	Nodex next;
	Nodex prev;
	Nodex(){
		next=null;
	}
	Nodex(int k,String n){
		RegNo=k;
		Name=n;
		next=null;
	}
	Nodex(int k,int index){
		RegNo=k;
		this.index=index;
		next=null;
		prev=null;
	}
}
class Chaining{Nodex a[]=new Nodex[10];
	void insert(int key,String n) {int index;
		index=key%10;
			if(a[index]==null)
				a[index]=new Nodex(key,n);
			else 
			{
				Nodex t=a[index];
				a[index]=new Nodex(key,n);
				a[index].next=t;
			}
			
		
}
	void delete(int key) {int index;
	index=key%10;
	Nodex p=a[index];
	Nodex t=a[index];
	if(t.RegNo==key&&t.next==null) {a[index]=null;}
	else if(t.RegNo==key&&t.next!=null) {a[index]=a[index].next;}
	else {
		while(t.RegNo!=key){
			p=t;
			t=t.next;
		}
	p.next=t.next;}
	System.out.println("The key value "+key+" has been deleted");	
	}
	boolean search(int key) {int index;
	boolean flag=false;
		index=key%10;
		if(a[index]==null)System.out.println("There is no element at key "+index);
		else {Nodex t=a[index];
			while(t!=null) {
				if(t.RegNo==key) {flag=true;System.out.println("The element is found\nThe value at this key is "+t.Name);break;}
				t=t.next;
				}
			if(flag!=true)flag=false;
			}
		return flag;
	}
	void display() {
		System.out.println("***The mod 10 value of each input is taken***");
		System.out.println("The Hash Table is:");
		for(int i=0;i<10;i++)
		{	System.out.print("Bucket "+i);
			Nodex temp=a[i];
			if(temp==null) 
				System.out.print(" --> Null");
			else {
					while(temp!=null) {
						System.out.print(" --> "+temp.RegNo+"|"+temp.Name);
						temp=temp.next;
						}
				}System.out.println();
		}
		
	}
}
public class Hashtable_Chaining {

	public static void main(String[] args) {Scanner scan=new Scanner(System.in);
	int choice;
	Chaining c=new Chaining();
	int count=0;
	do {if(count==0) System.out.println("***Chaining***\nChoose\n1.Insert\n2.Delete\n3.Search\n4.Display all elements\n0.Exit");
	else System.out.println("\n***Chaining***\nChoose\n1.Insert\n2.Delete\n3.Search\n4.Display all elements\n0.Exit");
	choice=scan.nextInt();int key;count++;
	switch(choice) {
	case 1:	do {
			System.out.println("Enter a positive key(Enter -1 to terminate) ");
			key=scan.nextInt();
			if(key!=-1) {System.out.println("Enter a name");String n=scan.next();c.insert(key,n);}
			else ;
				}while(key!=-1);break;
	case 2:System.out.println("Enter the key value of the item to be deleted");
			int k=scan.nextInt();
			if(c.search(k)==false)break;
			else c.delete(k);
			break;
	case 3:System.out.println("Enter the key value of the item to be searched");
		  	int ke=scan.nextInt();
		  	if(c.search(ke));
		  	else System.out.println("The element is not found");break;
	case 4:c.display();break;
	case 0: break;
	}
	}while(choice!=0);
	
   }
}

