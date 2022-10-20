/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
import javax.swing.JOptionPane;

public class uts_3 {
    public static void main(String[] args) {
    String a = JOptionPane.showInputDialog("Masukkan nilai  :");

    int num1 = Integer.parseInt(a); 
    
if 
    (num1 > 0) {
        String msg1 = "Bilangan Bernilai Positif";
        JOptionPane.showMessageDialog(null, msg1);
}
 
else if 
    (num1 < 0) {
    String msg2 = "Bilangan Bernilai Negatif";
    JOptionPane.showMessageDialog(null, msg2);
}

else {
    String msg3 = "Bilangan Bernilai Netral";
    JOptionPane.showMessageDialog(null, msg3);
}
}    
}

