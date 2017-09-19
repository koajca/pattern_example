/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

import behavior.FlyBehavior;
import quack.QuackBehavior;

/**
 *
 * @author pm1_os45
 */
public abstract class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;
    public Duck(){
        
    }    
    public void setFlyBehavior (FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior (QuackBehavior qb){
        quackBehavior = qb;
    }
    
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    
    public abstract void display();
    public void swim(){
        System.out.println("All duck float...");
    }
}
