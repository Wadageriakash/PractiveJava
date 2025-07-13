package DesignPatterns.FactoryPattern;

public class MainClass {

	public static void main(String[] args) {
		ShapeInstanceFactory factory = new ShapeInstanceFactory();
		Shape circleObj = factory.getShapeInstance("Circle");
		circleObj.computeArea();
	}
}
