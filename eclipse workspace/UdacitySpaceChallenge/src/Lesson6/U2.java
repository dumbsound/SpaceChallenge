package Lesson6;

public class U2 extends Rocket{
	
	public U2(int weight,int maxWeight,int cost){
		this.cost=cost;
		this.weight=weight;
		this.maxWeight=maxWeight;
		
	}
	
	public boolean land() {
		
		int random=(int)Math.random()*100+1;		
		double landExplosion=(percentagechanceOflandingCrash/100)*(weight/maxWeight);
		
		if(landExplosion<=random) {
			return false;
		}
		else {
			return true;
		}	
		
	}
	
	public boolean launch() {
		
		int random=(int)Math.random()*100+1;		
		double launchExplosion=(percentagechannceOflaunchExplosion/100)*(weight/maxWeight);
		
		if(launchExplosion<=random) {
			return false;
		}
		else {
			return true;
		}
	
	}

}
