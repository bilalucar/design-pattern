package pizzaci;

public abstract class Pizzaci {
 
	abstract Pizza pizzaUret(String pizzaTuru);
 
	public Pizza pizzaSiparisVer(String pizzaTuru) {
		Pizza pizza = pizzaUret(pizzaTuru);
		System.out.println("---" + pizza.getIsim() + " üretiliyor---");
		pizza.hazirla();
		pizza.pisir();
		pizza.kes();
		pizza.kutula();
		return pizza;
	}
}
