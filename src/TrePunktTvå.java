import javax.swing.*;

public class TrePunktTvå {
    public static void main(String[] args) {

        Double F = Double.parseDouble(JOptionPane.showInputDialog("Vad är det fär temperatur?"));
        Double C = (F-32)*5/9;
        JOptionPane.showMessageDialog(null,"Din temperatur i Celsius är " +C +"°");
    }
}
