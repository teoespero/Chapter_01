//////////////////////////////////////////////////////////////////////////////
//  WelcomeToSWE
//  AreaPerimeter.java
//  Author: Teo Espero
//          BS Software Engineering
//          BS Cloud and Systems Administration
//          Western Governors University
//  Description:
//          (Area and perimeter of a circle) Write a program that
//          displays the area and perimeter of a circle that has a radius
//          of 5.5 using the following formulas:
//              perimeter = 2 * radius * pi
//              area = radius * radius * pi
//  Date written: 02/20/2023
//////////////////////////////////////////////////////////////////////////////
public class AreaPerimeter {
    public static void main(String [] args){
        double radius = 5.5;
        double perimeter, area;

        perimeter = 2 * radius * 3.1416;
        area = radius * radius * 3.1416;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
//////////////////////////////////////////////////////////////////////////////
