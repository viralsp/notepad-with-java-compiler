
package texteditor;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;


public class texteditorGUI extends javax.swing.JFrame {
    String filename;
    String Wd=null;
    Clipboard clipboard=getToolkit().getSystemClipboard();

   
    public texteditorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        searchbutton = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        save_as = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        print = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        select_all = new javax.swing.JMenuItem();
        compile = new javax.swing.JMenu();
        execute = new javax.swing.JMenuItem();
        about_us = new javax.swing.JMenu();
        About_us = new javax.swing.JMenuItem();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 700, 700));

        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 15)); // NOI18N
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
        );

        file.setText("File");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        file.add(New);

        save_as.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save_as.setText("Save as");
        save_as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_asActionPerformed(evt);
            }
        });
        file.add(save_as);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        print.setText("print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        file.add(print);

        jMenuBar1.add(file);

        edit.setText("Edit");

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        edit.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        edit.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        edit.add(paste);

        select_all.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        select_all.setText("Select All");
        select_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_allActionPerformed(evt);
            }
        });
        edit.add(select_all);

        jMenuBar1.add(edit);

        compile.setText("Execute");

        execute.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        execute.setText("Compile and Run");
        execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeActionPerformed(evt);
            }
        });
        compile.add(execute);

        jMenuBar1.add(compile);

        about_us.setText("About us");

        About_us.setText("About Us");
        About_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_usActionPerformed(evt);
            }
        });
        about_us.add(About_us);

        jMenuBar1.add(about_us);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        searchTextarea(textArea,searchfield.getText());
    }//GEN-LAST:event_searchbuttonActionPerformed
class myHighlighter extends DefaultHighlighter.DefaultHighlightPainter{
    
    public myHighlighter( Color color){
        
        super(color);
    }
}

DefaultHighlighter.HighlightPainter highlighter=new myHighlighter(Color.YELLOW);

public  void  removehighlight(JTextComponent textcomp){
    
    Highlighter removeHighlighter=textcomp.getHighlighter();
    Highlighter.Highlight[] remove=removeHighlighter.getHighlights();
    
    for(int i=0; i<remove.length;i++){
        
        if((remove[i].getPainter()instanceof myHighlighter)){
        removeHighlighter.removeHighlight(remove[i]);
    }
    }
}


public void searchTextarea(JTextComponent textcomp,String textstring ){
    
    removehighlight(textcomp);
    try{
        Highlighter highlight = textcomp.getHighlighter();
        Document doc = textcomp.getDocument();
        String text=doc.getText(0, doc.getLength());
        int pos=0;
        
        while((pos=text.toUpperCase().indexOf(textstring.toUpperCase(),pos))>=0){
            highlight.addHighlight(pos, pos+textstring.length(), highlighter);
            pos+=textstring.length();
        }
        
        
        
    }catch(Exception e){
        
    }
    }



    
    
    
    
    
    
    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        textArea.setText("");
        this.Wd = null;
        this.filename = null;
        setTitle("");
    }//GEN-LAST:event_NewActionPerformed

    private void executeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeActionPerformed
       
        if(Wd!=null){
            try {
            
         String main=JOptionPane.showInputDialog("Enter main class name");
         String runFile = "run.bat";
         FileWriter filewriter = new FileWriter(runFile);
         String cmd = "@echo off\ntitle Java\ncolor 7\n cd "+this.Wd+"\njavac "+filename+"\njava "+main+"\npause";
         filewriter.write(cmd);
         filewriter.close();
         Process runtime = Runtime.getRuntime().exec("cmd /c start run.bat");
      } catch (Exception e) {
          System.out.println("Error in execute");
      }
  
        }else{
        JOptionPane.showMessageDialog(null, "First save the program \n or open program", "Warning", 1);
        }
    }//GEN-LAST:event_executeActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        FileDialog filedialog= new FileDialog(texteditorGUI.this,"Open File", FileDialog.LOAD);
        filedialog.setVisible(true);
        
        if(filedialog.getFile()!=null){
            filename=filedialog.getFile();
            this.Wd = filedialog.getDirectory();
            setTitle(filename);
            
        }
        try{
            BufferedReader reader=new BufferedReader(new FileReader(this.Wd + filename));
            StringBuilder sb = new StringBuilder();
            String line=null;
            while((line=reader.readLine())!=null){
                sb.append(line+"\n");
            }
            textArea.setText(sb.toString());
            reader.close();
            
        }catch(IOException e){
            System.out.println("File does not found");
        }
        
    }//GEN-LAST:event_openActionPerformed

    private void save_asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_asActionPerformed
         FileDialog filedialog= new FileDialog(texteditorGUI.this,"Save File", FileDialog.SAVE);
        filedialog.setVisible(true);
        if(filedialog.getFile()!=null){
            filename=filedialog.getFile();
            this.Wd = filedialog.getDirectory();
            System.out.println(filedialog.getDirectory());
            setTitle(filename); 
        }
        try{
            FileWriter filewriter = new FileWriter(this.Wd + filename );
            filewriter.write(textArea.getText());
            setTitle(filename);
            filewriter.close();
            
        }catch(IOException e){
            System.out.println("File does not found");
        }
        
    }//GEN-LAST:event_save_asActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        String copystring=textArea.getSelectedText();
       StringSelection copyselection=new StringSelection(copystring);
       clipboard.setContents(copyselection, copyselection);
    }//GEN-LAST:event_copyActionPerformed

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    private void About_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_usActionPerformed
        JOptionPane.showMessageDialog(null,"This is mini-project\n Created by group 4","About us ",1);    // TODO add your handling code here:
    }//GEN-LAST:event_About_usActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
       String cutstring=textArea.getSelectedText();
       StringSelection cutselection=new StringSelection(cutstring);
       clipboard.setContents(cutselection, cutselection);
       textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
       
       
    }//GEN-LAST:event_cutActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        try{
            Transferable pastetext=clipboard.getContents(texteditorGUI.this);
            String ptext=(String) pastetext.getTransferData(DataFlavor.stringFlavor);
            textArea.replaceRange(ptext,textArea.getSelectionStart() , textArea.getSelectionEnd());
            
        
        }catch(Exception e){
            
            System.out.println("can't work");
        }
    }//GEN-LAST:event_pasteActionPerformed

    private void select_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_allActionPerformed
        textArea.selectAll();
    }//GEN-LAST:event_select_allActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
       PrinterJob pj = PrinterJob.getPrinterJob();
          
            if(pj.printDialog()){
                
            }
           // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new texteditorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About_us;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenu about_us;
    private javax.swing.JMenu compile;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem execute;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem paste;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JMenuItem print;
    private javax.swing.JMenuItem save_as;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField searchfield;
    private javax.swing.JMenuItem select_all;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
