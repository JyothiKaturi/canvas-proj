package com.jyothi.model;

public class ShapeFactory {

	public IShape Create(ShapeType shapeType) throws Exception {
		switch (shapeType) {
		case Line:
			return new Line();
		case Rectangle:
			return new Rectangle();
			default:
				throw new Exception("cannot find the type!!");
		}
	}

}
