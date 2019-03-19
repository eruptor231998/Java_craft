
public class inventaire {
	Objets[] inventaire = new Objets[60];
	Main m = new Main();
	
	public void echange(int n) { //prend la pile entiere
		Objets tampon = m.tenu;
		m.tien(inventaire[n]);
		inventaire[n]= tampon;
	}

}
