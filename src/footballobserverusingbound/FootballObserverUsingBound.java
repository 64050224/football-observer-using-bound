/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballobserverusingbound;

import java.util.Scanner;

/**
 *
 * @author AreYouG
 */
public class FootballObserverUsingBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScoreBean lsb = new LiveScoreBean();
        Subscriber sb1 = new Subscriber();
        Subscriber sb2 = new Subscriber();
        lsb.addPropertyChangeListener(sb1);
        lsb.addPropertyChangeListener(sb2);
        
        String result;
        while(true){
            System.out.println("Enter match score/result <submit empty String to end>: ");
            result = sc.nextLine();
            if(result.length() == 0){
                break;
            }else{
                lsb.setScoreLine(result);
            }
        }
        
        sc.close();
    }
    
}
