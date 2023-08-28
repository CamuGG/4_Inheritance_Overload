package org.example;

public class Shape {

    private String shapeName;
    private int numberOfEdge;

    public Shape(){
        System.out.println("Shape object is created");
        shapeName = "Undefined shape";
    }

    public Shape(double radius){
        System.out.println("Circle object is created");
        shapeName = "Circle";
        numberOfEdge = 0;
    }

    public Shape(int edges, double edgeLenght){
        System.out.println("Square object is created");
        shapeName = "Square";
        numberOfEdge = edges;
    }

    public Shape(int edges, double e1, double e2){
        System.out.println("Rectangle object is created");
        shapeName = "Rectangle";
        numberOfEdge = edges;
    }

    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("Triangle object is created");
        shapeName = "Triangle";
        numberOfEdge = edges;
    }

    public String getShapeDetails(){
        return shapeName + " " +numberOfEdge;
    }
}
