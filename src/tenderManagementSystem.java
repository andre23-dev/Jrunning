
public class tenderManagementSystem {

	public static void main(String[] args) {
		Athlete a1 = new Athlete("Mario", "Rossi", "100 metri", 10.20);
		Athlete a2 = new Athlete("Franco", "Verdi", "100 metri", 10.61);
		Athlete a3 = new Athlete("Fabio", "Grossi", "100 metri", 9.99);
		Athlete[] list1 = new Athlete[3];
		list1[0]=a1;
		list1[1]=a2;
		list1[2]=a3;
		Organizer o1 = new Organizer("Matteo", "Bini");
		Competition c1 = new Competition("Olimpiadi", o1, 10, list1);
		
		int cont=1;
		for (int i=0; i<list1.length; i++)
		{
			System.out.println("il partecipatne nuemro "+cont+" "+list1[i].getFirstName()+ " "+list1[i].getLastName()+ " che partecipa alla gare "+list1[i].getCategory()+" ha totalizzato un tempo di: "+list1[i].getTime()+" secondi.");
			cont++;
		}
		
		c1.findWinner(a1, 10.20, a2, 10.61, a3, 9.99);
		
		
	}

}
