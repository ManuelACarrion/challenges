package com.smallworldfs.challenge4;

public class TennisGameRefactored {
	private Integer p1Point = 0;
	private Integer p2Point = 0;

	private final String player1Name;
	private final String player2Name;

	public TennisGameRefactored(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
	}

	public String getScorePoint(Integer point) {
		if (point == 0)
			return "Love";
		if (point == 1)
			return "Fifteen";
		if (point == 2)
			return "Thirty";
		if (point == 3)
			return "Forty";
		return "";
	}

	public String getScore() {
		int difference = p1Point - p2Point;
		
		if (difference > 1 && p1Point > 3)
			return "Win for player1";
		if (difference == 1 && p1Point > 3)
			return "Advantage player1";
		if (difference == 0 && p1Point <= 2)
			return getScorePoint(p1Point) + "-All";
		if (difference == 0 && p1Point > 2)
			return "Deuce";
		if (difference == -1 && p2Point > 3)
			return "Advantage player2";
		if (difference < -1 && p2Point > 3)
			return "Win for player2";
		return getScorePoint(p1Point) + "-" + getScorePoint(p2Point);
	}

	private void p1Score() {
		p1Point++;
	}
	private void p2Score() {
		p2Point++;
	}

	public void wonPoint(String player) {
		if (player.equals(this.player1Name))
			p1Score();
		if (player.equals(this.player2Name))
			p2Score();
	}
}