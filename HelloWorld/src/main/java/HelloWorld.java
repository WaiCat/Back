import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HelloWorld {

    public static class Theater {

        private Seat[][] seats;
        private int rowCount, colCount;

        public Theater(int rowCount, int colCount){
            this.rowCount = rowCount;
            this.colCount = colCount;
            seats = new Seat[rowCount][colCount];
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    seats[i][j] = new Seat();
                }
            }
        }

        public void printSeatMatrix() {
            System.out.print("  ");
            for (int i = 1; i <= 9; i++) {
                System.out.print("  " + i);
            }
            System.out.println();

            for (int i = 0; i < rowCount; i++) {
                System.out.print((char) ('A' + i) + ": ");
                for (int j = 0; j < colCount; j++) {
                    Seat s = seats[i][j];
                    if (s.isOccupied()) {
                        System.out.print("[O]");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
            }
        }
    }

    public static class Seat {
        private String name;

        public String getName(){
            return name;
        }
        public void reserve(String name){
            this.name = name;
        }
        public void cancel(){
            this.name = null;
        }
        public boolean isOccupied(){
            if(name == null){
                return false;
            }
            return true;
        }
        public boolean match(String checkName){
            if(name.equals(checkName)){
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Theater t = new Theater(5, 9);
        t.printSeatMatrix();

        System.out.println();

        for (int i = 0; i < ; i++) {
            
        }
    }
    
    
}
