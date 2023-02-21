//////////////////////////////////////////////////////////////////////////////
//  WelcomeToSWE
//  PrintATable.java
//  Author: Teo Espero
//          BS Software Engineering
//          BS Cloud and Systems Administration
//          Western Governors University
//  Description:
//          Write a program that displays a table for the following values
//          a   a^2     a^3
//  Date written: 02/20/2023
//////////////////////////////////////////////////////////////////////////////
public class PrintATable {
    public static void main(String[] args){
        int a, a_sqrd, a_cube, ctr;

        System.out.println("a\t\ta^2\t\t\ta^3");
        for (ctr = 1; ctr < 5; ctr++){
            a = ctr;
            a_sqrd = ctr * ctr;
            a_cube = ctr * ctr * ctr;
            System.out.println(a+"\t\t"+a_sqrd+"\t\t\t"+a_cube);

        }
    }
}
