package pizzaci;

public class PizzaciTest {
 
	public static void main(String[] args) {
		Pizzaci psPizza = new PasaportPizza();
		Pizzaci drPizza = new DrPizza();
 
		Pizza pizza = psPizza.pizzaSiparisVer("kasarli");
		System.out.println(pizza.getIsim() + "\n");
 
		pizza = drPizza.pizzaSiparisVer("kasarli");
		System.out.println(pizza.getIsim() + "\n");

		pizza = psPizza.pizzaSiparisVer("karisik");
		System.out.println(pizza.getIsim() + "\n");
 
		pizza = drPizza.pizzaSiparisVer("karisik");
		System.out.println(pizza.getIsim() + "\n");

		pizza = psPizza.pizzaSiparisVer("vejeteryan");
		System.out.println(pizza.getIsim() + "\n");
 
		pizza = drPizza.pizzaSiparisVer("vejeteryan");
		System.out.println(pizza.getIsim() + "\n");

	}
}
