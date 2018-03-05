package com.avinash.learn.tdd.BowlingGame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.avinash.learn.tdd.BowlingGame.Game.Game;

public class BowlingTest {
	private Game g;

	private void rollmany(int n, int pins) {
		for (int i = 0; i < n; i++) {
			g.roll(pins);
		}
	}

	private void roolStrike() {
		g.roll(10);
	}

	private void rollSpare() {
		g.roll(5);
		g.roll(5);
	}

	@Before
	public void Setup() {
		g = new Game();
	}

	@Test
	public void getGutterGame() {
		rollmany(20, 0);
		assertEquals(0, g.score());

	}

	@Test
	public void allOnes() {

		rollmany(20, 1);

		assertEquals(20, g.score());

	}

	@Test
	public void oneSpare() {
		rollSpare();
		g.roll(3);
		rollmany(17, 0);
		assertEquals(16, g.score());

	}

	@Test
	public void OneStrike() {
		roolStrike();
		g.roll(3);
		g.roll(4);
		rollmany(16, 0);
		assertEquals(24, g.score());

	}
	
	@Test
	public void perfectGame() {
		rollmany(12,10);
		assertEquals(300, g.score());
		
	}

}
