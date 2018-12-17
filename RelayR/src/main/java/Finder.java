import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Finder {
	
	//HashMap to hold the sorted word as key and actual words as List of values.
	//This will find the word in O(1) time
	private Map<String, ArrayList<String>> dict = new HashMap<String,ArrayList<String>>();
	
	// actual find method, runs in O(k.log k) time, where k is the length of the string
	public String[] find(String s){
		ArrayList<String> ans;
		ans = dict.get(sort(s));
		if(ans == null)
			return new String[] {};
		return ans.toArray(new String[0]);
	}
	
	
	// constructor, loads the string array to HashMap
	Finder(String[] list){
		String key;
		ArrayList<String> val;
		
		if(list != null) { //handles null pointer, empty array
			for(String s : list) {
				key = sort(s);
					// if key is not found, insert key and a new list
					if(!dict.containsKey(key)) {
						val = new ArrayList<String>();
						val.add(s);
						dict.put(key, val);
					}  //if key is already present, append the val to its list
					else{
						val = dict.get(key);
						val.add(s);
						dict.put(key, val);
					}
			}
		}
	}
	
	// sort string s in ascending order in O(k.log k ) time, where k is the length of the string s
	private String sort(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return Arrays.toString(ch);
	}
		
}
