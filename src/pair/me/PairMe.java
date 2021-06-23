/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair.me;
import java.util.Scanner;
public class PairMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if(a+b==c || b+c==a || c+a==b)
            {
              System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
            
    }
    
}
