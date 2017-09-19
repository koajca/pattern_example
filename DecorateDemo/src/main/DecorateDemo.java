/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import beverage.Beverage;
import beverage.DarkRost;
import beverage.Espresso;
import beverage.HouseBlend;
import model.Mocha;
import model.Soy;
import model.Whip;

/**
 *
 * @author pm1_os45
 */
public class DecorateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+": "+ beverage.cost());
        
        //
        Beverage darkRost = new DarkRost();
        darkRost= new Mocha(darkRost);
        darkRost= new Soy(darkRost);
        
        System.out.println(darkRost.getDescription()+": "+ darkRost.cost());
        //
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription()+": "+ houseBlend.cost());
        houseBlend= new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription()+": "+ houseBlend.cost());
        houseBlend= new Soy(houseBlend);
        System.out.println(houseBlend.getDescription()+": "+ houseBlend.cost());
        houseBlend= new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()+": "+ houseBlend.cost());
        
        
        
        
    }
    
}
