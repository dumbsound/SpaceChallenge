package Lesson6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Simulation {

	public ArrayList loadItems(String filename) {
		
		ArrayList<Item> itemList=new ArrayList<>();
		
		try {
			List<String> readEachLine=Files.readAllLines(Paths.get(filename));
			for (String itemeachLine : readEachLine) {
				StringTokenizer tokenizer=new StringTokenizer(itemeachLine, "=");
				Item item=new Item(tokenizer.nextToken(),Integer.parseInt(tokenizer.nextToken()));
				itemList.add(item);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return itemList;
		
	}
	
	public ArrayList loadU1(ArrayList<Item> itemList) {
		
		U1 u1=null;
		ArrayList<U1> u1List=new ArrayList<>();
		
		for (Item item : itemList) {
			if(u1==null) { 			//check if U1 is empty
				u1=new U1(10,18,100); //create a new instance of U1
			}
			if(u1.canCarry(item)) {  //check if current instance of U1 can carry item
				u1.carry(item);
			}
			else {
				u1List.add(u1);  	
				u1=new U1(10,18,100);
				u1.carry(item);
			}
			
		}
		return u1List;
		
	}
	
	public ArrayList loadU2(ArrayList<Item> itemList) {
		
		U2 u2=null;
		ArrayList<U2> u2List=new ArrayList<>();
		
		for (Item item : itemList) {
			if(u2==null) { 			//check if U1 is empty
				u2=new U2(18,29,120); //create a new instance of U1
			}
			if(u2.canCarry(item)) {  //check if current instance of U1 can carry item
				u2.carry(item);
			}
			else {
				u2List.add(u2);  	
				u2=new U2(18,29,120);
				u2.carry(item);
			}
		}
		return u2List;
		
	}
	public int runSimulation(ArrayList<Rocket> rocketList) {
		
		int budgetCost=0;
				
		for (Rocket rocket : rocketList) {
			budgetCost+=rocket.getCost();
			while(!rocket.launch()) {
				rocket.launch();
			}
			while(!rocket.land()) {
				rocket.land();
				
			}
			
		}
		
		return budgetCost;
		
	}
}

