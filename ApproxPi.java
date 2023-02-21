//////////////////////////////////////////////////////////////////////////////
//  WelcomeToSWE
//  ApproxPi.java
//  Author: Teo Espero
//          BS Software Engineering
//          BS Cloud and Systems Administration
//          Western Governors University
//  Description:
//          (Approximate p) p can be computed using the following formula:
//              Pi = 4 X (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))
//              Pi = 4 X (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13))
//  Date written: 02/20/2023
//////////////////////////////////////////////////////////////////////////////
public class ApproxPi {
    public static void main(String[] args){
        double pi;

        pi = 4.0 * (1 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0));
        System.out.println(pi);
        pi = 4.0 * (1 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0));
        System.out.println(pi);
    }
}
//////////////////////////////////////////////////////////////////////////////