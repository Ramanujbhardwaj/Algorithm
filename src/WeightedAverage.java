import java.util.ArrayList;
import java.util.Random;

public class WeightedAverage {

	public static void main(String[] args) {
		java.util.List<WeightedItem> list = new ArrayList<WeightedItem>();
		
		list.add(new WeightedItem(3, 5));
		list.add(new WeightedItem(4, 31));
		list.add(new WeightedItem(5, 29));
		list.add(new WeightedItem(6, 1));
		double totalWeight = 0;
		WeightedItem selected = null;
		Random rand = new Random();
		for(WeightedItem item: list) {
			double r = rand.nextDouble() * (totalWeight + item.weights);
			if(r >= totalWeight) {
			selected = item;
			totalWeight +=item.weights; 
			}
		}
		System.out.println(selected.getItem());
	}
}

class WeightedItem{
	int item;
	WeightedItem(int it, int we){
		this.item = it;
		this.weights = we;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public int getWeights() {
		return weights;
	}
	public void setWeights(int weights) {
		this.weights = weights;
	}
	int weights;

}