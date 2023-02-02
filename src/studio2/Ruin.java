package studio2;

public class Ruin {

	public static void main(String[] args) {
		int ruin= 0;
		int WinLimit= 100;
		int Dollars = 15;
		double WinChance = .15;
		double X = Math.random();
	
		int SimulationCount = 0;
while((Dollars > ruin)&& (Dollars < WinLimit)) {
	SimulationCount ++ ;
if (X > WinChance)
{
	Dollars = Dollars +5;
	System.out.println("Simulation " + SimulationCount + " " + Dollars + " Win" ); 
}
else 
{ Dollars = Dollars -5; 
	System.out.println("Simulation " + SimulationCount + " " + Dollars + " Lose " ) ;
}

}
	
}
}





