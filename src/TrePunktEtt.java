import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Double r = Double.parseDouble(JOptionPane.showInputDialog("Vad är Radien?"));
        Double V = (4 * Math.PI * Math.pow(r, 3))/3;
        Double A = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("Volymen på sfären är " + V);
        System.out.println("Arean är "+A);
    }
}