
public class Zwierze {
		
	String nazwa;
	Pozycja pozycja= new Pozycja();
	int zdrowie;
	public Zwierze(int poczZdrowie, String nazwa) {
		zdrowie=poczZdrowie;
		this.nazwa=nazwa;
	}
	void obrona(int obrazenia) {
		zdrowie=zdrowie-obrazenia;
	}
	void atak(Zwierze zwierze) {
			
	}
	
	public static void main(String[] args) {
		Zwierze kot= new Kot();
		//kot.pozycja.x=10;
		//kot.pozycja.y=10;
		Zwierze mysz = new Mysz();
		Zwierze szczur = new Szczur();
		
		kot.atak(mysz);
		szczur.atak(mysz); //szczur nie zaatakuje(obrazen)
		System.out.println(mysz.zdrowie);
		kot.atak(szczur);
		szczur.atak(kot);
		System.out.println(szczur.zdrowie);
		System.out.println(kot.zdrowie);
	}

}
