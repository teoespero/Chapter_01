//////////////////////////////////////////////////////////////////////////////
//  WelcomeToSWE
//  PopulationProjection.java
//  Author: Teo Espero
//          BS Software Engineering
//          BS Cloud and Systems Administration
//          Western Governors University
//  Description:
//          (Population projection) The U.S. Census Bureau projects population
//          based on the following assumptions:
//                  - One birth every 7 seconds
//                  - One death every 13 seconds
//                  - One new immigrant every 45 seconds
//          Write a program to display the population for each of the next
//          five years. Assume that the current population is 312,032,486,
//          and one year has 365 days.
//  Date written: 02/20/2023
//////////////////////////////////////////////////////////////////////////////

public class PopulationProjection {
    public static void main(String[] args){

        //  declare the vars that we will be using
        int birth, death, immigrant, projected_population;
        int total_seconds, seconds, years, days_in_a_year, minutes, hours;
        int currentPopulation, seconds_birth, seconds_death, seconds_immigration;

        //  initialize the vars we will be using
        currentPopulation = 312032486;
        years = 5;
        days_in_a_year = 365;
        hours = 24;
        minutes = 60;
        seconds = 60;
        seconds_birth = 7;
        seconds_death = 13;
        seconds_immigration = 45;

        //  convert 5 years into seconds
        total_seconds = years * (days_in_a_year * ((hours * minutes) * seconds));

        //  compute for births
        birth = total_seconds / seconds_birth;

        //  compute for deaths
        death = total_seconds / seconds_death;

        //  compute for immigration
        immigrant = total_seconds / seconds_immigration;

        //  print current US population
        System.out.format("Current US population: %,8d%n", currentPopulation);

        //  add instances to the current population
        projected_population = currentPopulation + (birth + death + immigrant);

        //  print projected population
        System.out.format("Projected US Population in 5 years: %,8d%n", projected_population);
    }
}
//////////////////////////////////////////////////////////////////////////////