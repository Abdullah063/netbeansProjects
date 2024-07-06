/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yunusDeneme;


import javax.swing.JTextField;


public class Cell extends JTextField{
        private int num;
        private boolean isHere;

        
        public Cell() {
                
        }

        public Cell(int num, boolean isHere) {
                this.num = num;
                this.isHere = isHere;
        }

        /**
         * @return the num
         */
        public int getNum() {
                return num;
        }

        /**
         * @param num the num to set
         */
        public void setNum(int num) {
                this.num = num;
        }

        /**
         * @return the isHere
         */
        public boolean isIsHere() {
                return isHere;
        }

        /**
         * @param isHere the isHere to set
         */
        public void setIsHere(boolean isHere) {
                this.isHere = isHere;
        }
        
        
}
