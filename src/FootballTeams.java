
public class FootballTeams extends SportsTeam implements Mascot{
	
	private String mascot;
	
	public String sport()	{
		
		return "football";
		
	}
	
	
	public void setMascot(String mascot)	{
		
		this.mascot = mascot;
		
	}
	
	public String toStringName()	{
		
		return "We are the " + this.getTeamName();
		
	}
	
	public String toStringTrophies()	{
		
		return "Since our conception in " + this.getYearFormed() + ", we have won " + this.getTrophies() + " trophies";
		
	}
	
	public String toStringRecord() {
		
		return "Our record in our domestic league, " + this.getLeague() + ", is " + 
				this.getRecord(this.getWins(), this.getLosses(), this.getDraws());
		
	}
	
	public String getMascot()	{
		
		return mascot;
		
	}
	
	public String toStringMascot()	{
		
		return "Our mascot is " + this.getMascot();
		
	}
	
	public String toString()	{
		
		return toStringName() + "\n" + toStringTrophies() + "\n" + toStringRecord() + "\n" + toStringMascot() + "\n";
				
	}

}
