
public class TestHarness {

	public static void main(String[] args) {
		
		SoccerTeams Liverpool = new SoccerTeams();
		SoccerTeams Dortmund = new SoccerTeams();
		FootballTeams Dolphins = new FootballTeams();
		FootballTeams Broncos = new FootballTeams();
		
		
		// Liverpool FC
		Liverpool.setTeamName("Liverpool FC");
		
		Liverpool.setYearFormed(1892);
		Liverpool.setWins(25);
		Liverpool.setDraws(7);
		Liverpool.setLosses(1);
		Liverpool.setLeague("The English Premier League");
		
		
		Liverpool.setTrophies(58);
		
		Liverpool.setAnthem("You'll Never Walk Alone");
		
		System.out.println(Liverpool.toString());
		
		System.out.println();
		
		// Borussia Dortmund
		Dortmund.setTeamName("Borussia Dortmund");
		Dortmund.setYearFormed(1909);
		Dortmund.setWins(19);
		Dortmund.setDraws(6);
		Dortmund.setLosses(3);
		Dortmund.setLeague("The Bundesliga");
		
		Dortmund.setTrophies(20);
		
		Dortmund.setAnthem("You'll Never Walk Alone");	
		// Yes, I completely forgot their anthem was the same as Liverpool's. Feel free to Google it.
		
		System.out.println(Dortmund.toString());
		
		System.out.println();
		
		
		// Miami Dolphins
		Dolphins.setTeamName("Miami Dolphins");
		Dolphins.setYearFormed(1966);
		Dolphins.setWins(7);
		Dolphins.setDraws(0);
		Dolphins.setLosses(9);
		Dolphins.setLeague("The National Football League");
		
		Dolphins.setTrophies(2);
		
		Dolphins.setMascot("dolphin");
		
		System.out.println(Dolphins.toString());
		
		System.out.println();
		
		// Denver Broncos
		Broncos.setTeamName("Denver Broncos");
		Broncos.setYearFormed(1960);
		Broncos.setWins(6);
		Broncos.setDraws(0);
		Broncos.setLosses(10);
		Broncos.setLeague("The National Football League");
		
		
		Broncos.setTrophies(3);
		
		Broncos.setMascot("bronco");
		
		System.out.println(Broncos.toString());
		
		System.out.println();

	}

}
