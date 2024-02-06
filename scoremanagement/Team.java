package scoremanagement;
import java.util.ArrayList;

public class Team {
	String teamName;
	ArrayList<Player> teamList = new ArrayList<>();
	int teamPlayers = 0;

	public Team() {
		Play.teams++;
		System.out.print("\nTeam "+ Play.teams+": " );
		teamName = Main.scanner.nextLine();
		addPlayers();
	}

	private void addPlayers() {
		System.out.println("\n\t "+ teamName.toUpperCase() + " players list");
		while (teamPlayers != 11) {
			teamList.add(new Player());
			teamList.get(teamPlayers++).setPlayerName(Main.scanner.nextLine());
		}
		displayPlayers(teamList);
		System.out.print("\n\tChoose "+teamName.toUpperCase()+" Captain: ");
		teamList.get(Utility.validateInteger(10)).setCaptain(true);
		displayPlayers(teamList);
		System.out.print("\n\tChoose "+teamName.toUpperCase()+" Wicket Keeper: ");
		teamList.get(Utility.validateInteger(10)).setWicketKeeper(true);
	}

	public static void displayPlayers(ArrayList<Player> team) {
		int choice = 0;
		System.out.println();
		for (Player player : team) {
			System.out.print("(" + (choice++) + ") " + player.getPlayerName());
			if (player.isCaptain())
				System.out.print(" (c)");
			if (player.isWicketKeeper())
				System.out.print(" (wk)");
			System.out.println();
		}
	}
}