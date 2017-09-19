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
public class DarkRost extends Beverage {

    public DarkRost() {
        description = "DarkRost coffee (3.0)";
    }

    
    @Override
    public double cost() {
        return 3.0d;
    }
    
}
