package hellotvxlet;

import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.tv.xlet.*;
import org.davic.resources.*;
import org.dvb.event.*;
import org.havi.ui.*;


public class HelloTVXlet implements Xlet, HBackgroundImageListener, UserEventListener, ResourceClient, {

    HStillImageBackgroundConfiguration imgbgd;
    
    HBackgroundImage image1 = new HBackgroundImage("pizza1.m2v");
    HBackgroundImage image2 = new HBackgroundImage("pizza2.m2v");
    HBackgroundImage image3 = new HBackgroundImage("pizza3.m2v");
    HBackgroundImage image4 = new HBackgroundImage("pizza4.m2v");
    
    int counter = 0;
    
    String lijst = "Orderlijst";
    
    String pizza;
    
    HStaticText hst = new HStaticText(lijst, 320,60,250,200);
    
    int c = 1;

    
    
    public void destroyXlet(boolean unconditional) throws XletStateChangeException 
    {
        
    }

    public void initXlet(XletContext ctx) throws XletStateChangeException
    {
        HScreen screen = HScreen.getDefaultHScreen();
        
        HBackgroundDevice hbackgrounddev = screen.getDefaultHBackgroundDevice();
        
        boolean reserved = hbackgrounddev.reserveDevice(this);
        
        if(reserved)
        {
            System.out.println("background reserved");
        }
        
        HBackgroundConfigTemplate hbct = new HBackgroundConfigTemplate();
        
        hbct.setPreference(HBackgroundConfigTemplate.STILL_IMAGE, HBackgroundConfigTemplate.REQUIRED);
        
        imgbgd=(HStillImageBackgroundConfiguration) hbackgrounddev.getBestConfiguration(hbct);
        
        image1.load(this);
        image2.load(this);
        image3.load(this);
        image4.load(this);
        
        
        
             
    }

    public void pauseXlet() 
    {
      
    }

    public void startXlet() throws XletStateChangeException 
    {
       UserEventRepository mijnrep = new UserEventRepository("naam");
        mijnrep.addAllArrowKeys();
        mijnrep.addKey(28);
        
        EventManager mijnManager = EventManager.getInstance();
        mijnManager.addUserEventListener(this,mijnrep);
        
        HScene scene = HSceneFactory.getInstance().getDefaultHScene();
        
        hst.setVerticalAlignment(hst.VALIGN_TOP);
        
        hst.setHorizontalAlignment(hst.HALIGN_LEFT);
        
        hst.setTextContent(lijst, hst.NORMAL_STATE);
        
        scene.add(hst);
        scene.validate();
        scene.setVisible(true);
    }

    public boolean requestRelease(ResourceProxy proxy, Object requestData) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void release(ResourceProxy proxy) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void notifyRelease(ResourceProxy proxy) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imageLoaded(HBackgroundImageEvent e) 
    {
        System.out.print("Image geladen");
        counter++;
        if(counter == 4) System.out.print("alles geladen");
        
        try 
        {
            imgbgd.displayImage(image1);
        } 
        catch (IOException iOException) 
        {
            
        } 
        catch (HPermissionDeniedException hPermissionDeniedException) 
        {
            
        } 
        catch (HConfigurationException hConfigurationException) 
        {
            
        }
    }

    public void userEventReceived(UserEvent event) 
    {
        System.out.println(e.getCode());
        if(event.getType()== KeyEvent.KEY_PRESSED)
        {
        if(event.getCode()== 38)
        {
            
            if(c == 1){
                c = 4;
            }
            else 
            {
                c--;
            }
        }
        else if(event.getCode()== 36){
           if(c == 4){
                c = 1;
            }
            else {
                c++;
            }
            
        }
        
            try {
                if (counter == 4) 
                {
                    if (c == 1) 
                    {
                        imgbgd.displayImage(image1);
                        pizza = "p1";
                    }
                    if (c == 2) 
                    {
                        imgbgd.displayImage(image2);
                        pizza = "p2";
                    }
                    if (c == 3) 
                    {
                        imgbgd.displayImage(image3);
                        pizza = "p3";
                    }
                    if (c == 4) 
                    {
                        imgbgd.displayImage(image4);
                        pizza = "p4";
                    }
                }
            } 
            catch (IOException iOException) 
            {
                
            } 
            catch (HPermissionDeniedException hPermissionDeniedException)
            {
                
            } 
            catch (HConfigurationException hConfigurationException) 
            {
                
            }
        
        if(event.getCode()==28){
            
            lijst += "\n" + pizza;
            hst.setTextContent(lijst, hst.NORMAL_STATE);
        }
        }
    }

    public void imageLoadFailed(HBackgroundImageEvent e) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
