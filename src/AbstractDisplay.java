/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public abstract class AbstractDisplay {
    public abstract void open();
    
    public abstract void close();
    
    public abstract void print();
    
    public final void display(){
        open();
        for(int i = 0;i<5;i++){
            print();
        }
        close();
    }
    
}
