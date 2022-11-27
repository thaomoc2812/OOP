package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Sciene Fiction","George Lucas", 87,24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.print();		// print list DVDs
		
		//anOrder.removeDigitalVideoDisc(dvd2); //delete dvd
		anOrder.print();
		
		anOrder.searchCartId(3);
		anOrder.searchCartId(4);
		anOrder.searchCartTitle("Aladin");
		anOrder.searchCartTitle("KPT");
	}
	
}
