/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package behavior;

/**
 *
 * @author pm1_os45
 */
public class FlyNoWay implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
    
}
