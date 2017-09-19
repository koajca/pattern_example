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
public abstract class Beverage {
    protected String description = "Unknow Beverage";
    public String getDescription (){
        return description;        
    }
    public abstract double cost();
}
