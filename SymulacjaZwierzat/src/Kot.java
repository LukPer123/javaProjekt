
public class Kot extends Zwierze {
	
	public Kot() {
		super(20, "Kot");
	}
	void atak(Zwierze zwierze) {
		if(zwierze.nazwa!="Kot")	
		
			zwierze.obrona(2);
		}
		
	
}
