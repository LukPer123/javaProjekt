
public class Szczur extends Zwierze {
		
	public Szczur() {
			super(15,"Szczur");
		}
	void atak(Zwierze zwierze) {
		if(zwierze.nazwa=="Kot")
			zwierze.obrona(3);
	
	}
}
