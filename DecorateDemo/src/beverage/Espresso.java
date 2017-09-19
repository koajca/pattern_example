/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beverage;

/**
 *
 * @author pm1_os45
 */
public class Espresso extends Beverage {

    @Override
    public double cost() {
        return 2.5;
    }

    public Espresso() {
        description = "Espresso (2.5)";
    }
    
}
