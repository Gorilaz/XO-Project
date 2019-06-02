package io.xo;

import java.awt.Point;

import io.xo.exceptions.AlreadyOccupiedException;
import io.xo.exceptions.InvalidPointException;

public class Field {
	private static final int FIELD_SIZE = 3;
	private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];
	
	public int getSize() {
		return FIELD_SIZE;
	}
	
	public Figure getFigure(final Point point) throws InvalidPointException {
		if(!checkCoordinate(point)) {
			throw new InvalidPointException();
		}
		return field[point.x][point.y];
	}
	
	public void setFigure(final Point point, final Figure figure)  throws InvalidPointException,AlreadyOccupiedException  {
		if(!checkCoordinate(point)) {
			throw new InvalidPointException();
		}
		
		if(field[point.x][point.y] != null) {
			throw new AlreadyOccupiedException();
		}
		field[point.x][point.y] = figure;
	}
	
	public boolean checkCoordinate(final Point point) {
		if (point.x >= FIELD_SIZE || point.x < 0 || point.y >= FIELD_SIZE || point.y < 0) {
			return false;
		}
		return true;
	}



}
