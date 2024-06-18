package com.pace.collection.set;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> citySet = new HashSet<String>();
		citySet.add("Hyderabad");
		citySet.add("Pune");
		citySet.add("Bengaluru");
		citySet.add("Hyderabad");
		
		for(String city : citySet) {
			System.out.println(city);
		}

	}

}
