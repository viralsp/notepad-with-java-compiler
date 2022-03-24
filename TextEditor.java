
package texteditor;

import javax.swing.JFrame;


public class TextEditor {

    public static void main(String[] args) {
        texteditorGUI gui=new texteditorGUI();
        gui.setBounds(0,0,600,600);
        gui.setTitle("NOTEPAD");
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }
    
}
