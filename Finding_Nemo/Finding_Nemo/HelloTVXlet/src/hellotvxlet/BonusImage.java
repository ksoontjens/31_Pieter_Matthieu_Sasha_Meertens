
package hellotvxlet;

import org.havi.ui.*;
import java.awt.*;

// poging tot toevoegen image
public class BonusImage extends HComponent {

    private Image bonus1;
    private MediaTracker mt;
    
    
    public BonusImage(String naam,int x,int y)
    {
        bonus1 = this.getToolkit().getImage(naam);
        mt = new MediaTracker(this);
        mt.addImage(bonus1,0);
        try
        {
            mt.waitForAll();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        this.setBounds(x, y, bonus1.getWidth(null), bonus1.getHeight(null));     
    }
    public void paint(Graphics g)
    {
        g.drawImage(bonus1, 0, 0, null);
    }
    
}
