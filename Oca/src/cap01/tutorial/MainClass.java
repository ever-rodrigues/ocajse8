package cap01.tutorial;

import java.io.Console;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args){
        Console console= System.console();
        String planet = console.readLine("Enter the quantity of planets you whant to add:");
        int quantityOfPlanets= Integer.valueOf(planet);
        ArrayList planets = new ArrayList();
        int i=0;
        while(i<quantityOfPlanets){
            Console console2= System.console();
            String newPlanet = console2.readLine("Enter the planet name:");
            planets.add(newPlanet);
            i++;
        }
        System.out.println(planets);
    }
}
