package DesignPatterns.FactoryPattern;

public class ShapeInstanceFactory {

	public Shape getShapeInstance(String value) {
		
		if(value == "Circle") {
			return new Circle();
		}
		else if(value == "Square") {
			return new Square();
		}
//		else if(value == "Rectangle") {
//			return new Rectangle();
//		}
		
		return null;
	}
}
