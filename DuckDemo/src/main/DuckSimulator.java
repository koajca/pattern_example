/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import behavior.FlyWithRocket;
import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import quack.MuteQuack;

/**
 *
 * @author pm1_os45
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("-------------------------------------------------");

        Duck modelDuckRocket = new ModelDuck();
        
        modelDuckRocket.performQuack();
        modelDuckRocket.performFly();
        
        modelDuckRocket.setQuackBehavior(new MuteQuack());
        modelDuckRocket.setFlyBehavior(new FlyWithRocket());
        modelDuckRocket.performQuack();
        modelDuckRocket.performFly();
    }
}
