package io.xo;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class TestField {

	@Test
	public void testSetFigure() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(0,0);
		final Figure inputfigure = Figure.O;
		
		field.setFigure(inputPoint, inputfigure);
		final Figure actualFigure = field.getFigure(inputPoint);
		
		assertEquals(actualFigure, inputfigure);	
	}
	
	@Test
	public void testGetSize() throws Exception {
		Field field = new Field();
		
		assertEquals(3, field.getSize());

	}

}
