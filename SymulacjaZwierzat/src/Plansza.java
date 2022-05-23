import java.util.ArrayList;
import java.util.Random;

public class Plansza {
	
	ArrayList<Zwierze> zwierzenta= new ArrayList<Zwierze>();
	Pozycja poleWyjscia=new Pozycja();
	int wielkoscPlanszy;
	
	public Plansza(int liczbaKot, int liczbaMysz, int liczbaSzczur, int wielkoscPlanszy) {
		for(int i=0; i<liczbaKot; i++) {
			zwierzenta.add(new Kot());
		}
		for(int i=0; i<liczbaMysz; i++) {
			zwierzenta.add(new Mysz());
		}
		for(int i=0; i<liczbaSzczur; i++) {
			zwierzenta.add(new Szczur());
		}
		this.wielkoscPlanszy=wielkoscPlanszy;
		
		Random random= new Random();
		
		for(int i=0;i<zwierzenta.size(); i++) {
			random.nextInt(wielkoscPlanszy);
			zwierzenta.get(i).pozycja= new Pozycja();
			random.nextInt(wielkoscPlanszy);
			
		}
	}
		
	public static void main(String[] args) {
		
		
	}
	
	
}
