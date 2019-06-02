package io.xo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testGetName() throws Exception {
		final String inputValue = "Sergo";
		final String expectedValue = inputValue;
		
		final Player player = new Player("Sergo",null);
		final String actualValue = player.getName();
		
		assertEquals(expectedValue, actualValue);
		
	}
	
	@Test
	public void testGetFigure() throws Exception {
		final Figure inputValue = Figure.X;
		final Figure expectedValue = inputValue;
		
		final Player player = new Player(null,inputValue);
		final Figure actualValue = player.getFigure();
		
		assertEquals(expectedValue, actualValue);		
	}

}
