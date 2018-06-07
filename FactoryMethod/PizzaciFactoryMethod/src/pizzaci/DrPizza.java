package pizzaci;

public class DrPizza extends Pizzaci {

        @Override
	Pizza pizzaUret(String item) {
        	if (item.equals("kasarli")) {
            		return new DrPizzaKasarliPizza();
        	} else if (item.equals("vejeteryan")) {
        	    	return new DrPizzaVejeteryanPizza();
        	} else if (item.equals("karisik")) {
        	    	return new DrPizzaKarisikPizza();
        	} 
                else return null;
	}
}
