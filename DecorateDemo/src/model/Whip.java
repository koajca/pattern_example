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
public class Whip  extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Whip(0.4)";
    }
    public double cost(){
        return 0.4+ beverage.cost();
    }
    
}
