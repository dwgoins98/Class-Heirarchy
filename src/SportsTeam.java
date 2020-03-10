public abstract class SportsTeam {	

	private int wins;
	private int losses;
	private int draws;
	private int trophies;
	private String teamName;
	private String league;
	private int yearFormed;
	
	// Getters and Setters
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public int getTrophies() {
		return trophies;
	}
	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void setYearFormed(int yearFormed) {
		
		this.yearFormed = yearFormed;
		
	}
	
	public int getYearFormed()	{
		
		return yearFormed;
		
	}
	
	public void setLeague(String league)	{
		
		this.league = league;
		
	}
	
	public String getLeague()	{
		
		return league;
		
	}
	
	public String getRecord(int wins, int losses, int draws)	{
		
		String teamRecord;
		
		teamRecord = "" + wins + "-" + draws + "-" + losses;
		
		return teamRecord;
		
	}
	
	public abstract String sport();
	
	
	
}


