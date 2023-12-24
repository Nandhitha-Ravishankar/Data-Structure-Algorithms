import java.util.*;
public class H_Map {
	public static void main(String args[]) {
		/*HashSet<String> hs=new HashSet<String>();
		hs.add("Sneha");
		hs.add("Apple");
		hs.add("Car");
		hs.add("Orange");
		System.out.println(hs);
		System.out.println(hs.remove("Pineapple"));//boolean,will display true if the element is present in the set
		System.out.println(hs);*/
		HashMap<Integer,String> hs =new HashMap<Integer,String>();
		hs.put(1,"Sneha");
		hs.put(2,"Apple");
		hs.put(3,"Car");
		hs.put(4,"Orange");
		System.out.println(hs);
		System.out.println(hs.get(1));
	}

}
