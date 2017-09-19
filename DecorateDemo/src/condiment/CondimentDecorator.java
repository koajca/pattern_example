/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiment;

import beverage.Beverage;

/**
 *
 * @author pm1_os45
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public double cost() {
        return 1.00d;
    }

    public abstract String getDescription();
}
