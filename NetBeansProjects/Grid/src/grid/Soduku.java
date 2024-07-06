/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grid;

import java.awt.GridLayout;
import javax.swing.JFrame;


public class Soduku {
        JFrame frame;
        Btn[][] border = new Btn[9][9];

        public Soduku() {
                frame = new JFrame();
                frame.setSize(1000,1000);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(9,9));
                
                
                for (int row = 0; row < border.length; row++) {
                        for (int col = 0; col < border[0].length; col++) {
                                Btn buton =  new  Btn(row,col);
                                frame.add(buton);
                                border[row][col]=buton;
    
                        }
                }
                
                generateNum();
                
                
                frame.setVisible(true);
        }
        
        public  void generateNum()
        {
                int i = 0;
                while (i<border.length*4) {                        
                        int randomRow = (int)(Math.random()*9);
                        int randomCol = (int)(Math.random()*9);
                        while (border[randomRow][randomCol].isNum()) {                                
                                randomRow = (int)(Math.random()*9);
                                randomCol = (int)(Math.random()*9);
                        }
                        border[randomRow][randomCol].setIsNum(true);
                        
                        if (false) {
                                int randomNum = (int)Math.random()*border.length;
                                border[randomRow][randomCol].setIsNum(true);
                                
                        }
                        i++;
                      
                }
        }
        public void chack()
        {
                
        }

        

         
        
}
