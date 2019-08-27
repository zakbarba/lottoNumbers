/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottonum;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Zak
 */
public class LottoNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] lotto={0,0,0,0,0,0,0};
        Random rand=new Random();
        int n;
        for (int i=0;i<=6;i++)
        { 
            n= rand.nextInt(75);
            //System.out.printf("%d ",n); // prints n
            lotto[i]=n;
            //Arrays.fill(lotto,n); // fills array with variable n
        }
        //System.out.print("\n"); //format space between print statements
        System.out.println(Arrays.toString(lotto));
    }
 
}
