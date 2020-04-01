package mvc_table_test;

import javax.swing.SwingUtilities;

/**
 * @author ashraf_sarhan
 * 
 */
public class App {
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    public static void createAndShowGUI() throws Exception {
        new View();
    }
}