/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package duck;

import behavior.FlyNoWay;
import duck.Duck;
import quack.Quack;

/**
 *
 * @author pm1_os45
 */
public class ModelDuck extends  Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I'm flying with a rocket");
    }    
}
