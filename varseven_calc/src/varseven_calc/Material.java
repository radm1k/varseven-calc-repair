package varseven_calc;

public abstract class Material {
	private double cost;
	public abstract void generation();
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
