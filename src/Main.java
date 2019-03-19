
public class Main {

	Objets tenu;
	
	public Main() {
		tenu = (new Objets(0,1,false));//créer une main avec un objet inexistant
	}
	public void tien (Objets obj) {
		this.tenu = obj;
	}
}
