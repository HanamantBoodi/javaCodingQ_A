package coding_Q_and_A;

import java.util.HashMap;

public class Count_of_each_Word {

	public static void main(String[] args) {
		String s="Hello World Hello World Hello";
		String[] s1=s.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		for(String c:s1)
		{
		if(map.containsKey(c))
		{
			int x=map.get(c);
			map.put(c, x+1);
		}
		else	
		{
		map.put(c, 1);	
		}
			
		}
		System.out.println(map);
	}

}
