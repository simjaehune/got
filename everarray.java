package helloworld;

import java.util.ArrayList;

public class everarray {
	public static ArrayList<String> savehuman = new ArrayList<String>();
	public static ArrayList<String> savewoodea = new ArrayList<String>();
	public static ArrayList<Integer> savedate = new ArrayList<Integer>();
	public static ArrayList<Integer> saveea = new ArrayList<Integer>();
	public static ArrayList<Integer> saveresult = new ArrayList<Integer>();
	
	public void addalldata(String adl, String kid, String human, String woodea, int 
			user_id, int kid_price, int adult_price, int date, int ea, int result, int discount,
			int ordercount, int type) {
		
		savedate.add(date);
		savehuman.add(human);
		saveea.add(ea);
		saveresult.add(result);
		savewoodea.add(woodea);
		
	}
}
