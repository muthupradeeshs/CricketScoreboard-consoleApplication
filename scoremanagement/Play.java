package scoremanagement;

public class Play {
	static int teams = 0;
	Team teamOne = new Team();
	Team teamTwo = new Team();
	Innings firstInnings = new Innings();
	Innings secondInnings = new Innings();

	public void toss() {
		System.out.println("Toss:Enter 0 or 1");
		int toss = Utility.validateInteger(1);
		if (toss == 0) {
			System.out.println(teamOne.teamName + " have won the toss" + "\n" + teamOne.teamName
					+ " choose 0 to Bat 1 to Bowl ");
			chooseTo(teamOne, teamTwo);
		} else {
			System.out.println(teamTwo.teamName + " have won the toss" + "\n" + teamTwo.teamName
					+ " Choose to: 0 Bat 1 Bowl  : ");
			chooseTo(teamTwo, teamOne);
		}
	}

	private void chooseTo(Team tossWinner, Team tossLoser) {
		int choice = Utility.validateInteger(1);
		if (choice == 0) {
			System.out.println("and choose to Bat first");
			firstInnings.begin(tossWinner, tossLoser);
			secondInnings.begin(tossLoser, tossWinner);
		} else {
			System.out.println("and chose to Bowl first");
			firstInnings.begin(tossLoser, tossWinner);
			secondInnings.begin(tossWinner, tossLoser);
		}
	}
}
