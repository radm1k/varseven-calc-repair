package varseven_calc;

public class Oboi extends Material{

	//private double cost; наследуем отт материалов
	private double meter; // переменная обоев про метры
	
	public Oboi() { // конструктор обоев, который зануляет стоимость 
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
	public void generation() { // подсчет стоимости обоев на основе информации о метрах
		 this.setCost(this.meter*150);
	}

}
