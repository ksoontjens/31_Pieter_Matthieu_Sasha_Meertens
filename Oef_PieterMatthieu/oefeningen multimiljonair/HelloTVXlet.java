package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.dvb.ui.DVBColor;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {

    HScene scene;
    HTextButton button1;
    HTextButton button2;
    HTextButton button3;
    HTextButton button4;
    HTextButton button5;
    HStaticText juist;
    HStaticText fout;
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
        scene = HSceneFactory.getInstance().getDefaultHScene();
    }

    public void startXlet() {
        HStaticText label = new HStaticText("Wie wordt multimiljonair?", 210, 208, 310, 50);
        juist = new HStaticText("Juist", 260, 108, 210, 50);
        fout = new HStaticText("Fout", 260, 108, 210, 50);
        
        label.setBackgroundMode(HVisible.BACKGROUND_FILL);
        label.setBackground(Color.BLACK);
        juist.setBackgroundMode(HVisible.BACKGROUND_FILL);
        juist.setBackground(new DVBColor (31,255,31,179));
        fout.setBackgroundMode(HVisible.BACKGROUND_FILL);
        fout.setBackground(new DVBColor (255,31,31,179));
        
        button1 = new HTextButton("A", 210, 268, 150, 50);
        button2 = new HTextButton("B", 370, 268, 150, 50);
        button3 = new HTextButton("C", 210, 328, 150, 50);
        button4 = new HTextButton("D", 370, 328, 150, 50);
        button5 = new HTextButton("Hulplijn", 530, 328, 150, 50);
        
        
        button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button1.setBackground(new DVBColor(191,191,255,179)); //R,G,B,alpha
        button2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button2.setBackground(new DVBColor(191,191,255,179));
        button3.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button3.setBackground(new DVBColor(191,191,255,179));
        button4.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button4.setBackground(new DVBColor(191,191,255,179));
        button5.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button5.setBackground(new DVBColor(191,191,255,179));
        
        //************************VOEG BUTTONS TOE***************
        scene.add(button1);
        scene.add(button2);
        scene.add(button3);
        scene.add(button4);
        scene.add(button5);
             
        //**********************CONFIGUREER KNOPPEN*****************
        button1.setFocusTraversal(null, button3, null, button2);
        button2.setFocusTraversal(null, button4, button1, null);
        button3.setFocusTraversal(button1, null, null, button4);
        button4.setFocusTraversal(button2, null, button3, button5);
        button5.setFocusTraversal(null, null, button4, null);
        
        button1.setActionCommand("A");
        button1.addHActionListener(this);
        button2.setActionCommand("B");
        button2.addHActionListener(this);
        button3.setActionCommand("C");
        button3.addHActionListener(this);
        button4.setActionCommand("D");
        button4.addHActionListener(this);
        button5.setActionCommand("hulp");
        button5.addHActionListener(this);
        
        //******************FIX SCENE
        scene.add(label);      
        scene.add(juist);
        
        juist.setVisible(false); //false
        scene.add(fout);
        
        fout.setVisible(false); //false
        scene.validate();
        
        scene.setVisible(true); //true
        button1.requestFocus();
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println(event.getActionCommand());
        if (event.getActionCommand().equals("A"))
        {
            fout.setVisible(true);
            juist.setVisible(false);
            scene.repaint();
        }
        if (event.getActionCommand().equals("B"))
        {
            fout.setVisible(true);
            juist.setVisible(false);
            scene.repaint();
        }
        if (event.getActionCommand().equals("C"))
        {
            fout.setVisible(false);
            juist.setVisible(true);
            scene.repaint();
        }
        if (event.getActionCommand().equals("D"))
        {
            fout.setVisible(true);
            juist.setVisible(false);
            scene.repaint();
        }
        if (event.getActionCommand().equals("hulp"))
        {
            button2.setBackground(new DVBColor(255,31,31,179));
            button4.setBackground(new DVBColor(255,31,31,179));
            scene.remove(button5);
            scene.repaint();
        }
        
        
    }
}
