package DesignPattern.Creational.Factory;

public abstract class Plan {
	protected double rate;
	abstract void getRate();
	public void calculatebill(int unit)
	{
		System.out.println(rate*unit);
	}

}
