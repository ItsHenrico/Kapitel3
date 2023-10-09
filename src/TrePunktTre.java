import javax.swing.*;

public class TrePunktTre {
    public static void main(String[] args) {
        Double mg = Double.parseDouble(JOptionPane.showInputDialog("Hur mycket drar den?"));
        Double lm = mg / (3.785/0.1609);
        JOptionPane.showMessageDialog(null,"Den drar " +lm +" liter/mil");
    }
}
