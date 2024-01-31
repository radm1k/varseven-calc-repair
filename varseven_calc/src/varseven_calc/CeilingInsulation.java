package varseven_calc;

public class CeilingInsulation extends Material{
	private double meter; 
	
	public CeilingInsulation() { 
	this.setCost(0.0);
	this.meter = 0.0;
	}
	
	public double getMetr() {
		return this.meter;
	}
	
	public void setMetr(double info) {
		this.meter = info;
	}
	
	@Override
	public void generation() {
		 this.setCost(this.meter*110);
	}

}
