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
public class HouseBlend extends Beverage {

    @Override
    public double cost() {
        return 1.5;        
    }

    public HouseBlend() {
        description = "House blend coffee (1.5)";
    }
}
