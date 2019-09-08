package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(new Chicken());
	farm.add(new Llama());
	farm.add(new Mitchell());
	farm.add(new Globglogabgalab());
	farm.add(new Globglogabgalab());
	farm.add(new Mitchell());
	
	while(true) {
		try {
			Thread.sleep(34);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Animal animal : farm) {
			animal.makeNoise();
			try {
				Thread.sleep(12);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		((Chicken) farm.get(0)).peck();
		((Llama) farm.get(1)).spit();
		((Mitchell) farm.get(2)).playBasketBall();
		((Mitchell) farm.get(5)).playBasketBall();
		((Globglogabgalab) farm.get(3)).read();
		((Globglogabgalab) farm.get(4)).read();
		
	}
	
}
}
