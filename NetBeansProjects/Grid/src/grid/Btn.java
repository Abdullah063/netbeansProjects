/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grid;

import javax.swing.JButton;



public class Btn extends  JButton{
       private  int col,row,num;
       private boolean isNum;

        public Btn() {
        }

        public Btn(int col, int row) {
                this.col = col;
                this.row = row;
                this.isNum = false;
                
        }

        public Btn(int col, int row, int num) {
                this.col = col;
                this.row = row;
                this.num = num;
                this.isNum = false;
                
        }

        /**
         * @return the col
         */
        public int getCol() {
                return col;
        }

        /**
         * @param col the col to set
         */
        public void setCol(int col) {
                this.col = col;
        }

        /**
         * @return the row
         */
        public int getRow() {
                return row;
        }

        /**
         * @param row the row to set
         */
        public void setRow(int row) {
                this.row = row;
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
         * @return the isNum
         */
        public boolean isNum() {
                return isNum;
        }

        /**
         * @param isNum the isNum to set
         */
        public void setIsNum(boolean isNum) {
                this.isNum = isNum;
        }
        
        
       
}
