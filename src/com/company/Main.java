package com.company;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe = new FootballPlayer("Joe");
	BaseballPlayer pat = new BaseballPlayer("Pat");
	SoccerPlayer beckham = new SoccerPlayer("Beckham");

	Team someTeam = new Team("Warsaw");
	someTeam.addPlayer(joe);
	someTeam.addPlayer(pat);
	someTeam.addPlayer(beckham);
        System.out.println(someTeam.numPlayers());
    }
}
