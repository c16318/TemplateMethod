
package cafe;

import java.util.Scanner;

/**
 *
 * @author c16318
 */
public class Tea extends CaffeeinBevarage{
    
    public void brew(){
        System.out.println("紅茶を入れる");
    }
    
    public void addCondiments(){
        System.out.println("レモンを入れる.");
    }
    
    public boolean customerWantsCondiments(){
        System.out.println("レモン。1/0");
        
        if(getUserInput() == 1){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public int getUserInput(){
        Scanner stdIn = new Scanner(System.in);
        return stdIn.nextInt();    
    }
}
