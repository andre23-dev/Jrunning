
public class tenderManagementSystem {

	public static void main(String[] args) {
		Athlete a1 = new Athlete("Mario", "Rossi", "100 metri", 10.22);
		Athlete a2 = new Athlete("Franco", "Verdi", "100 metri", 10.61);
		Athlete a3 = new Athlete("Fabio", "Grossi", "100 metri", 10.55);
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
		
		Athlete winner = list1[0];
		
		for (int i=0; i<list1.length; i++)
		{
			if(list1[i].getTime()<winner.getTime())
			{
				winner=list1[i];
			}
		}
		
		System.out.println("Il vincitore della gara dei 100 metri della competizione "+c1.name +" è: "+winner.getFirstName()+" "+winner.getLastName()+".");
	}

}
