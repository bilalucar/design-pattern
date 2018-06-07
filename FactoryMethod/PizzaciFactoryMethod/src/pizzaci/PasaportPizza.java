package pizzaci;

public class PasaportPizza extends Pizzaci {

        @Override
	Pizza pizzaUret(String item) {
		if (item.equals("kasarli")) {
			return new PasaportPizzaKasarliPizza();
		} else if (item.equals("vejeteryan")) {
			return new PasaportPizzaVejeteryanPizza();
		} else if (item.equals("karisik")) {
			return new PasaportPizzaKarisikPizza();
		} 
                else return null;
	}
}
