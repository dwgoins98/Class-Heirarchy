
public class SoccerTeams extends SportsTeam implements Anthem{
	
	private String anthem;
	
	public String sport()	{
		
		return "Soccer";
		
	}
	
	public void setAnthem (String anthem)	{
		
		this.anthem = anthem;
		
	}
	
	public String getAnthem()	{
		
		return anthem;
		
	}
	
	public String toStringName()	{
		
		return "We are " + this.getTeamName();
		
	}
	
	public String toStringTrophies()	{
		
		return "Since our conception in " + this.getYearFormed() + ", we have won " + this.getTrophies() + " trophies";
		
	}
	
	public String toStringRecord() {
		
		return "Our record in our domestic league, " + this.getLeague() + ", is " + 
				this.getRecord(this.getWins(), this.getLosses(), this.getDraws());
		
	}
	
	public String toStringAnthem()	{
		
		return "Our anthem is " + this.getAnthem();
		
	}
	
	public String toString()	{
		
		return toStringName() + "\n" + toStringTrophies() + "\n" + toStringRecord() + "\n" + toStringAnthem();
		
	}
		


}
