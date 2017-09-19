/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import beverage.Beverage;
import condiment.CondimentDecorator;

/**
 *
 * @author pm1_os45
 */
public class Soy  extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Soy (0.3)";        
    }
    public double cost(){
        return 0.3+ beverage.cost();
    }
    
}
