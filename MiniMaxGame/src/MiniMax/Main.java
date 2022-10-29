package MiniMax;

import GuiDesign.Panel;
import java.util.Scanner;
import org.jfree.ui.RefineryUtilities;

public class Main {
 
    public static void main(String[] args){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Κλήση της βασικής φόρμας GUI της Εφαρμογής
                // Εκκίνηση του GUI
                Panel panel = new Panel();
                RefineryUtilities.centerFrameOnScreen(panel);
                panel.setVisible(true);
            }
        });
    }
}