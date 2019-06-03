package io.xo;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import io.xo.exceptions.AlreadyOccupiedException;
import io.xo.exceptions.InvalidPointException;

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
		final Field field = new Field();
		
		assertEquals(3, field.getSize());
	}
	
	@Test
	public void testGetFigureWhenFigureIsNotSet() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(0,0);
		
		final Figure actualFigure = field.getFigure(inputPoint);
		
		assertNull(actualFigure);
	}
	
	@Test
	public void testGetFigureWhenXIsLessThenZero() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(-1,0);
		
		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch(final InvalidPointException e) {}
		
	}
	
	@Test
	public void testGetFigureWhenYIsLessThenZero() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(0,-1);
		
		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch(final InvalidPointException e) {}
		
	}
	
	@Test
	public void testGetFigureWhenXIsMoreThenFieldSize() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(field.getSize() +1,0);
		
		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch(final InvalidPointException e) {}
		
	}
	
	@Test
	public void testGetFigureWhenYMoreThenFieldSize() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(0,field.getSize());
		
		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch(final InvalidPointException e) {}
		
	}

	@Test
	public void testGetFigureWhenYXMoreThenFieldSize() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(field.getSize(),field.getSize());
		
		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch(final InvalidPointException e) {}
		
	}
	
	@Test
	public void testGetFigureWhenYXLessThenZero() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(-1,-1);
		
		try {
			final Figure actualFigure = field.getFigure(inputPoint);
			fail();
		} catch(final InvalidPointException e) {}
		
	}
	
	@Test
	public void test€etFigureWhenYXAlreadyOccupied() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(0,0);
		field.setFigure(inputPoint, Figure.O);
		
		try {
			field.setFigure(inputPoint, Figure.X);	
			fail();
		} catch(final AlreadyOccupiedException e) {}
		
	}
}
