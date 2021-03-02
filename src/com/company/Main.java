package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");

	Team<FootballPlayer> someTeam = new Team<>("Warsaw");
	someTeam.addPlayer(joe);
//	someTeam.addPlayer(pat);
//	someTeam.addPlayer(beckham);
        System.out.println(someTeam.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Lublin");
        baseballPlayerTeam.addPlayer(pat);

		Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Chełm");
		soccerPlayerTeam.addPlayer(beckham);

		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Gordon");
		melbourne.addPlayer(banks);

		Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle= new Team<>("Fremantle");

		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(someTeam, 3, 8);

		someTeam.matchResult(fremantle, 2, 1);
//		someTeam.matchResult(baseballPlayerTeam, 1, 1);

		System.out.println("Rankings");
		System.out.println(someTeam.getName() + ": " + someTeam.ranking());
		System.out.println(melbourne.getName() + ": " + melbourne.ranking());
		System.out.println(fremantle.getName() + ": " + fremantle.ranking());
		System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

		System.out.println(someTeam.compareTo(melbourne));
		System.out.println(someTeam.compareTo(hawthorn));
		System.out.println(hawthorn.compareTo(someTeam));
		System.out.println(melbourne.compareTo(fremantle));

//		ArrayList<Team> teams;
//		Collections.sort(teams);
    }
}
