/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoctffasttyping;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author pbibu
 */
public class PicoCTFFastTyping extends JPanel {

    /**
     * @param args the command line arguments
     */
    /*    JLabel inputCharLabel;
    JLabel inputCharLabel2;
    JLabel inputTimesLabel;
    JTextArea inputCharField;
    JTextArea inputCharField2;
    JTextArea inputTimesField;
    
    class getInputSelected implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
    
    }
    }*/
 /*class doItBtnListener implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
try {
Robot robo = new Robot();
robo.setAutoDelay(3);
robo.delay(5000);
int times = Integer.parseInt(inputTimesField.getText());
int keyCode = inputCharField.getText().codePointAt(0);
int secondCode= inputCharField2.getText().codePointAt(0);
for(int i = 0; i < times; i++){
robo.keyPress(keyCode);
robo.keyRelease(keyCode);
}
robo.keyPress(secondCode);
robo.keyRelease(secondCode);


} catch (AWTException ex) {
Logger.getLogger(PicoCTFFastTyping.class.getName()).log(Level.SEVERE, null, ex);
}
}
}*/
 /*    public void setUpComponents(){
JFrame window = new JFrame("Convert some things");

window.setBounds(100,60,900,400);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel outP = new JPanel();
Color myColor;
myColor = new Color(245,245,245);

outP.setBackground(myColor);
inputCharField = new JTextArea("Main", 25,25);
inputCharField.setLineWrap(true);
inputCharField2 = new JTextArea("Secondary", 25,25);
inputCharField2.setLineWrap(true);
inputTimesField = new JTextArea("Times", 25,25);
inputTimesField.setLineWrap(true);
outP.add(inputCharField);
outP.add(inputCharField2);
outP.add(inputTimesField);
Container c = window.getContentPane();
c.add(BorderLayout.CENTER,outP);

JPanel ctrlP = new JPanel();


JButton doItBtn = new JButton("Start in 5");
doItBtn.addActionListener(new doItBtnListener());
ctrlP.add(doItBtn);
c.add(BorderLayout.SOUTH, ctrlP);

window.setVisible(true);


}
     */
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here
        /*PicoCTFFastTyping panel = new PicoCTFFastTyping();
        
        panel.setUpComponents();*/

        Robot robo = new Robot();
        robo.setAutoDelay(3);
        robo.delay(5000);
        int times = 778;
        int keyCode = KeyEvent.VK_X;
        int secondCode = KeyEvent.VK_5;
        for (int i = 0; i < times; i++) {
            robo.keyPress(keyCode);
            robo.keyRelease(keyCode);
        }
        robo.keyPress(secondCode);
        robo.keyRelease(secondCode);
    }

}
