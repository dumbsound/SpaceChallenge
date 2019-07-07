package Lesson6;

public class Rocket implements Spaceship {
	
	int currentWeight;
	int weight;
	int maxWeight;
	int cost;
	int percentagechannceOflaunchExplosion;
	int percentagechanceOflandingCrash;	
	

	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getMaxWeight() {
		return maxWeight;
	}


	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getPercentagechannceOflaunchExplosion() {
		return percentagechannceOflaunchExplosion;
	}


	public void setPercentagechannceOflaunchExplosion(int percentagechannceOflaunchExplosion) {
		this.percentagechannceOflaunchExplosion = percentagechannceOflaunchExplosion;
	}


	public int getPercentagechanceOflandingCrash() {
		return percentagechanceOflandingCrash;
	}


	public void setPercentagechanceOflandingCrash(int percentagechanceOflandingCrash) {
		this.percentagechanceOflandingCrash = percentagechanceOflandingCrash;
	}


	public boolean launch() {		
		
		
		return true;
	}

	
	public boolean land() {
		
		return true;
	}

	
	public boolean canCarry(Item item) {
		
		if(currentWeight+item.getWeight()<=maxWeight) {
			return true;
		}
		else {
			return false;
		}
		
	}


	public void carry(Item item) {
		
		maxWeight+=item.getWeight();
		
	
	}

}
