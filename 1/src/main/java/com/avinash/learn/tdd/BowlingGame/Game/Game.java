package com.avinash.learn.tdd.BowlingGame.Game;

public class Game {
	private int rolls[] = new int[21];
	private int currentRoll = 0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int score = 0;
		int firstInframe = 0;

		for (int frame = 0; frame < 10; frame++) {
			if(isStrike(firstInframe))
			{
				
				score += 10  + nextTwoBallsForStrike(firstInframe);

				firstInframe++;
			}
			else if (isSpare(firstInframe)) {
				score +=10 + nextBallToSpare(firstInframe);
				firstInframe += 2;

			} else {
				score += twoBallInFrame(firstInframe);
				firstInframe += 2;
			}
		}

		return score;
	}

	public int twoBallInFrame(int firstInframe) {
		return rolls[firstInframe] + rolls[firstInframe + 1];
	}

	public int nextBallToSpare(int firstInframe) {
		return rolls[firstInframe+2];
	}

	public int nextTwoBallsForStrike(int firstInframe) {
		return rolls[firstInframe + 1] + rolls[firstInframe + 2];
	}
	
	public void nexttwoBallsforStrike()
	{}

	public boolean isStrike(int firstInframe) {
		return rolls[firstInframe] == 10;
	}

	public boolean isSpare(int firstInframe) {
		return rolls[firstInframe] + rolls[firstInframe] == 10;
	}

}
