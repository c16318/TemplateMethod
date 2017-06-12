/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;
    
    public CharDisplay(char ch){
        this.ch = ch;
    }
    public void open(){
        System.out.print("<<");
    }
    public void print(){
        System.out.print(ch);
    }
    public void close(){
        System.out.println(">>");
    }
    
    
}
