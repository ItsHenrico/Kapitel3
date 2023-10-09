import javax.swing.*;

public class TrePunktEtt {
    public static void main(String[] args) {

        Double r = Double.parseDouble(JOptionPane.showInputDialog("Vad är Radien?"));
        Double V = (4 * Math.PI * Math.pow(r, 3))/3;
        Double A = 4 * Math.PI * Math.pow(r, 2);
        JOptionPane.showMessageDialog(null,"Din Area är " + A + " och din Volym är " + V);
    }
}