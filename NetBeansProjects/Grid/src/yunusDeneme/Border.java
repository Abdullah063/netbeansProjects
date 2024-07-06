/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yunusDeneme;



import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Border {
        
        JFrame frame ;
        Cell board[][] = new Cell[9][9];

        public Border(){
                frame = new JFrame();
                frame.setSize(1000,1000);
                frame.setLayout(new GridLayout(9,9));
                
                
                for (int i = 0; i < 9; i++)
                {
                        for (int j = 0; j < 9; j++) {
                                Cell c = new Cell();
                                frame.add(c);
                                board[i][j]=c;                               
                                c.setHorizontalAlignment(JTextField.CENTER);
                                c.setNum(j);
                                
                        }
                }
                
                
                
                frame.setVisible(true);
                
                
        }
        public int randNum()
        {
                int num = (int)(Math.random()*9);
                return num;
                
        }
        
        
        
        
        
}
