/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rumah_sakit;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author micha
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Rumah Sakit ITERA");
        JOptionPane.showMessageDialog(null, "Rumah Sakit ITERA");
        
        new TampilanAwal().setVisible(true);
    }
}
