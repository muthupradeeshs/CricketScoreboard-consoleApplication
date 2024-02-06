package scoremanagement;

public class Player {
	private byte wicketsTaken, maidenOvers;
	private int runsScored, ballsPlayed, runsGiven, ballsBowled, oversBowled;
	private boolean captain, wicketKeeper;
	private char typeOfOut;
	private String playerName, takenBy = "", fieldedBy = "";

	public byte getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(byte wicketsTaken) {
		this.wicketsTaken += wicketsTaken;
	}

	public byte getMaidenOvers() {
		return maidenOvers;
	}

	public void setMaidenOvers(byte maidenOvers) {
		this.maidenOvers = maidenOvers;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored += runsScored;
	}

	public int getBallsPlayed() {
		return ballsPlayed;
	}

	public void setBallsPlayed(int ballsPlayed) {
		this.ballsPlayed += ballsPlayed;
	}

	public int getRunsGiven() {
		return runsGiven;
	}

	public void setRunsGiven(int runsGiven) {
		this.runsGiven += runsGiven;
	}

	public int getBallsBowled() {
		return ballsBowled;
	}

	public void setBallsBowled(int ballsBowled) {
		this.ballsBowled += ballsBowled;
	}

	public int getOversBowled() {
		return oversBowled;
	}

	public void setOversBowled(int oversBowled) {
		this.oversBowled += oversBowled;
	}

	public boolean isCaptain() {
		return captain;
	}

	public void setCaptain(boolean captain) {
		this.captain = captain;
	}

	public boolean isWicketKeeper() {
		return wicketKeeper;
	}

	public void setWicketKeeper(boolean wicketKeeper) {
		this.wicketKeeper = wicketKeeper;
	}

	public char getTypeOfOut() {
		return typeOfOut;
	}

	public void setTypeOfOut(char modeOfOut) {
		this.typeOfOut = modeOfOut;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getTakenBy() {
		return takenBy;
	}

	public void setTakenBy(String takenBy) {
		this.takenBy = takenBy;
	}

	public String getFieldedBy() {
		return fieldedBy;
	}

	public void setFieldedBy(String fieldedBy) {
		this.fieldedBy = fieldedBy;
	}

}
