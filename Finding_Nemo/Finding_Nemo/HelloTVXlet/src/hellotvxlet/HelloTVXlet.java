package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.dvb.ui.DVBColor;
import org.havi.ui.*;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {

    //***********HOMESCREEN**********
    HScene scene;
    HTextButton button1;
    HTextButton button2;
    HTextButton button3;
    HTextButton button4;
    HStaticText lblIntro;
    HStaticText buttonInformation;
    HTextButton backButton;
    //************MOVIE*************
    HStaticText nemoStory1;
    HStaticText nemoStory2;
    HStaticText nemoStory3;
    HStaticText nemoStory4;
    HStaticText nemoStory5;
    HTextButton nemoNext;
    HTextButton backButton2;
    int storyNr = 0;
    //************LANGUAGE**********
    HTextButton English;
    HTextButton Francais;
    HTextButton Espanol;
    HTextButton Nederlands;
    //************SCENES************
    HTextButton ch123;
    HTextButton ch456;
    HTextButton ch789;
    HTextButton ch101112;
    HTextButton ch131415;
    HStaticText sceneInfo;
    //************BONUS*************
    HStaticText bonusInfo;
    BonusImage b1 = new BonusImage("bonusImage1.jpg",0,0); //test
    
    
    public HelloTVXlet() {       
    }

    public void initXlet(XletContext context) {
        scene = HSceneFactory.getInstance().getDefaultHScene();
    }

    public void startXlet() {
        
        //****************************HOMEBUTTONS EN TEXT********************
        lblIntro = new HStaticText("FINDING NEMO", 0, 300, 750, 70);
        //positionX, positionY, breedte, goote                
        lblIntro.setBackgroundMode(HVisible.BACKGROUND_FILL);
        lblIntro.setBackground(new DVBColor(0,121,0,100));      
        buttonInformation = new HStaticText("Use the arrow keys to navigate",170,510,400,50);
        
        button1 = new HTextButton("Play", 50, 450, 140, 50);
        button2 = new HTextButton("Languages", 200, 450, 140, 50);
        button3 = new HTextButton("Scenes", 350, 450, 140, 50);
        button4 = new HTextButton("Bonus", 500, 450, 140, 50);
        backButton = new HTextButton("Back",550,500,80,30);  
        //********************MOVIE EN TEKST************************
        nemoStory1 = new HStaticText ("Two ocellaris clownfish, Marlin and his wife Coral,\n admire their new home in the Great\n Barrier Reef and their clutch of\n eggs when a barracuda attacks, knocking Marlin unconscious.\n He wakes up to find out that Coral and all but\n one of the eggs have been eaten by the barracuda.\n Marlin names this last egg Nemo, a name that Coral liked.\n Nemo develops a smaller\n right fin as a result of damage to his egg during the attack, \nwhich limits his swimming ability.\n Worried about Nemo\'s safety, \n Marlin embarrasses Nemo during a school field trip.", 50 ,0 , 650, 450);
        nemoStory2 = new HStaticText ("Nemo develops a smaller right fin as a result of damage to his egg\n during the attack, which limits his swimming ability.\n Worried about Nemo\'s safety,\n Marlin embarrasses Nemo during a school field trip.\n Nemo sneaks away from the reef and is captured by scuba divers.\n As the boat departs, a diver accidentally knocks\n his diving mask overboard.", 50 ,0 , 650, 450 );
        nemoStory3 = new HStaticText ("While attempting to save Nemo, Marlin meets Dory,\n a good-hearted and optimistic regal blue\n tang with short-term memory loss.\n Marlin and Dory meet three sharks – Bruce, Anchor and Chum\n – who claim to be vegetarians. \nMarlin discovers the diver's mask and\n notices an address written on it. ", 50 ,0 , 650, 450 );
        nemoStory4 = new HStaticText ("When he argues with Dory and accidentally gives her a nosebleed,\n the blood scent causes Bruce\n to enter an uncontrollable feeding frenzy.\n The pair escape from Bruce but\n the mask falls into a trench in the deep sea.\n During a hazardous struggle with an anglerfish in the trench,\n Dory sees the diving mask and reads\n the address located in Sydney, Australia.\n The pair swims on, receiving directions to Sydney\n from a school of moonfish.\n Marlin and Dory encounter a bloom\n of jellyfish that nearly kills them.\n Marlin loses consciousness and wakes up\n on a sea turtle named Crush,\n who takes Marlin and Dory on the East Australian Current", 50 ,0 , 650, 450);
        nemoStory5 = new HStaticText ("Marlin tells the details of his long\n journey with a group of sea turtles,\n and his story is spread across the ocean.\n He also sees how Crush gets on well with his son Squirt.\n Meanwhile, Nemo is placed in a fish tank in the office of\n a dentist named Phillip Sherman on Sydney Harbour.\n He meets aquarium fish called the Tank Gang,\n led by a moorish idol named Gill,\n who has a broken fin.", 50 ,0 , 650, 450);
        nemoNext = new HTextButton ("Next", 450, 500, 80, 30);
        backButton2 = new HTextButton("Back",550,500,80,30); 
        //********************SCENEBUTTONS EN TEXT******************
        ch123 = new HTextButton("1-2-3", 150, 150, 140, 50);
        ch456 = new HTextButton("4-5-6", 300, 150, 140, 50);
        ch789 = new HTextButton("7-8-9", 450, 150, 140, 50);
        ch101112= new HTextButton("10-11-12", 130, 300, 220, 50);
        ch131415 = new HTextButton("13-14-15",400,300,220,50);  
        sceneInfo = new HStaticText("Choose a scene",300,50,180,50);
        
        //******************LANGUAGEBUTTON EN TEXT****************
        English = new HTextButton("English", 200, 150, 140, 50);
        Francais = new HTextButton("Francais", 200, 250, 140, 50);
        Espanol = new HTextButton("Espanol", 200, 350, 140, 50);
        Nederlands = new HTextButton("Nederlands", 200, 450, 140, 50);
        //******************BONUS EN TEKST************************
        bonusInfo = new HStaticText("Binnenkort beschikbaar", 250, 250, 80, 50);
        
        //************************BACKGROUND HOMEBUTTONS***********
        button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button1.setBackground(new DVBColor(0,121,255,179)); //R,G,B,alpha
        button2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button2.setBackground(new DVBColor(0,121,255,179));
        button3.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button3.setBackground(new DVBColor(0,121,255,179));
        button4.setBackgroundMode(HVisible.BACKGROUND_FILL);
        button4.setBackground(new DVBColor(0,121,255,179));
        scene.setBackgroundMode(HVisible.BACKGROUND_FILL);
        scene.setBackground(new DVBColor(50,191,255,255));
        //***************************BACKGROUND TEXT*****************
        nemoStory1.setBackgroundMode(HVisible.BACKGROUND_FILL);
        nemoStory1.setBackground(new DVBColor(0,0,0,255));
        nemoStory2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        nemoStory2.setBackground(new DVBColor(0,0,0,255));
        nemoStory3.setBackgroundMode(HVisible.BACKGROUND_FILL);
        nemoStory3.setBackground(new DVBColor(0,0,0,255));
        nemoStory4.setBackgroundMode(HVisible.BACKGROUND_FILL);
        nemoStory4.setBackground(new DVBColor(0,0,0,255));
        nemoStory5.setBackgroundMode(HVisible.BACKGROUND_FILL);
        nemoStory5.setBackground(new DVBColor(0,0,0,255));
        nemoNext.setBackgroundMode(HVisible.BACKGROUND_FILL);
        nemoNext.setBackground(new DVBColor(0,0,0,100));
        backButton2.setBackgroundMode(HVisible.BACKGROUND_FILL);
        backButton2.setBackground(new DVBColor(0,0,0,200));
        //***************************BACKGROUND SCENEBUTTON**********
        ch123.setBackgroundMode(HVisible.BACKGROUND_FILL);
        ch123.setBackground(new DVBColor(0,121,255,179));
        ch456.setBackgroundMode(HVisible.BACKGROUND_FILL);
        ch456.setBackground(new DVBColor(0,121,255,179));
        ch789.setBackgroundMode(HVisible.BACKGROUND_FILL);
        ch789.setBackground(new DVBColor(0,121,255,179));
        ch101112.setBackgroundMode(HVisible.BACKGROUND_FILL);
        ch101112.setBackground(new DVBColor(0,121,255,179));
        ch131415.setBackgroundMode(HVisible.BACKGROUND_FILL);
        ch131415.setBackground(new DVBColor(0,121,255,179));
        backButton.setBackgroundMode(HVisible.BACKGROUND_FILL);
        backButton.setBackground(new DVBColor(0,0,0,200));
        //*************************LANGUAGE BUTTONS*****************
        English.setBackgroundMode(HVisible.BACKGROUND_FILL);
        English.setBackground(new DVBColor(0,121,255,179));
        Espanol.setBackgroundMode(HVisible.BACKGROUND_FILL);
        Espanol.setBackground(new DVBColor(0,121,255,179));
        Nederlands.setBackgroundMode(HVisible.BACKGROUND_FILL);
        Nederlands.setBackground(new DVBColor(0,121,255,179));
        Francais.setBackgroundMode(HVisible.BACKGROUND_FILL);
        Francais.setBackground(new DVBColor(0,121,255,179));
        //**********************BONUS BUTTONS**********************
        bonusInfo.setBackgroundMode(HVisible.BACKGROUND_FILL);
        bonusInfo.setBackground(new DVBColor(0,0,0,255));
        
        
        //********************VOEG TOE AAN SCENE*************
        scene.add(lblIntro);
        scene.add(button1);
        scene.add(button2);
        scene.add(button3);
        scene.add(button4);
        scene.add(backButton);
        scene.add(nemoStory1);
        scene.add(nemoStory2);
        scene.add(nemoStory3);
        scene.add(nemoStory4);
        scene.add(nemoStory5);
        scene.add(nemoNext);
        scene.add(backButton2);
        scene.add(ch123);
        scene.add(ch456);
        scene.add(ch789);
        scene.add(ch101112);
        scene.add(ch131415);
        scene.add(sceneInfo);
        scene.add(English);
        scene.add(Francais);
        scene.add(Espanol);
        scene.add(Nederlands);
        scene.add(buttonInformation);
        scene.add(b1);
        scene.add(bonusInfo);
        backButton.setVisible(false);
                                  //up   down    left    right
        //************PIJLTJES HOMESCREEN**********************
        button1.setFocusTraversal(button4, button2, button4, button2);
        button2.setFocusTraversal(button1, button3, button1, button3);
        button3.setFocusTraversal(button2, button4, button2, button4);
        button4.setFocusTraversal(button3, button1, button3, button1);
        //***************PIJLTJES PLAYSCREEN************************
        backButton2.setFocusTraversal(nemoNext, nemoNext, nemoNext, nemoNext);
        nemoNext.setFocusTraversal(backButton2, backButton2, backButton2, backButton2);
        //***************PIJLTJES SCENESCREEN***********************
        ch123.setFocusTraversal(backButton, ch101112, backButton, ch456);
        ch456.setFocusTraversal(backButton, ch131415, ch123, ch789);
        ch789.setFocusTraversal(backButton, ch131415, ch456, ch101112);
        ch101112.setFocusTraversal(ch123, backButton, ch789, ch131415);
        ch131415.setFocusTraversal(ch789, backButton, ch101112, backButton);
        backButton.setFocusTraversal(ch131415, ch123, ch131415, ch123);
        
        //************PIJLTJES LANGUAGESCREEN**********************
        English.setFocusTraversal(backButton, Francais, null, null);
        Francais.setFocusTraversal(English, Espanol, null, null);
        Espanol.setFocusTraversal(Francais, Nederlands, null, null);
        Nederlands.setFocusTraversal(Espanol, backButton, null, null);
        
        
        //****************LINK BTN MET ACTION*************
        button1.setActionCommand("btnPlay");
        button1.addHActionListener(this);
        button2.setActionCommand("btnLanguage");
        button2.addHActionListener(this);
        button3.setActionCommand("btnScenes");
        button3.addHActionListener(this);
        button4.setActionCommand("btnBonus");
        button4.addHActionListener(this);       
        //HActionListener implementen, actionPerformed methode toevoegen
        backButton.addHActionListener(this);
        backButton.setActionCommand("btnBack");
        backButton2.addHActionListener(this);
        backButton2.setActionCommand("btnBack");
        nemoNext.addHActionListener(this);
        nemoNext.setActionCommand("btnNext");
        
        disableScenesScreen();
        disableMovieScreen();
        disableLanguageScreen();
        disableBonusScreen();
        
        scene.validate();
        scene.setVisible(true);
        button1.requestFocus();
    }    
    
    public void pauseXlet() {     
    }

    public void destroyXlet(boolean unconditional) {     
    }

    public void disableHomeScreen()
    {
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        lblIntro.setVisible(false);
        buttonInformation.setVisible(false);
        
    }
    public void enableHomeScreen()
    {
        button1.setVisible(true);
        button1.requestFocus();
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        lblIntro.setVisible(true);
        backButton.setVisible(false);
        buttonInformation.setVisible(true);
        
    }
    //*******************OPEN THE OTHER SCREENS***************
    public void enableMovieScreen()
    {
        backButton2.setVisible(true);
        backButton2.requestFocus();
        nemoNext.setVisible(true);
        nemoStory1.setVisible(true);
        
    }
    public void enableLanguageScreen()
    {
        English.setVisible(true);
        Espanol.setVisible(true);
        Francais.setVisible(true);
        Nederlands.setVisible(true);
        backButton.setVisible(true);
        English.requestFocus();
    }
    public void enableSceneScreen()
    {
        sceneInfo.setVisible(true);
        ch123.setVisible(true);
        ch456.setVisible(true);
        ch789.setVisible(true);
        ch101112.setVisible(true);
        ch131415.setVisible(true);
        backButton.setVisible(true);
        ch123.requestFocus();
    }
    public void enableBonusScreen()
    {
        bonusInfo.setVisible(true);
        backButton.setVisible(true);
        backButton.requestFocus();
        
    }
    
    //*************CLOSE OTHER SCREENS*********************************
    public void disableMovieScreen()
    {
        nemoStory1.setVisible(false);
        nemoStory2.setVisible(false);
        nemoStory3.setVisible(false);
        nemoStory4.setVisible(false);
        nemoStory5.setVisible(false);
        nemoNext.setVisible(false);
        backButton2.setVisible(false);
    }
    public void disableScenesScreen()
    {
        sceneInfo.setVisible(false);
        ch123.setVisible(false);
        ch456.setVisible(false);
        ch789.setVisible(false);
        ch101112.setVisible(false);
        ch131415.setVisible(false);
    }
    public void disableBonusScreen()
    {
        bonusInfo.setVisible(false);
    }
    public void disableLanguageScreen()
    {
        English.setVisible(false);
        Espanol.setVisible(false);
        Francais.setVisible(false);
        Nederlands.setVisible(false);
    }
    
    public void chooseLanguage()
    {
        
    }
    
    
    //**************UITVOER NA KLIKKEN****************
    public void actionPerformed(ActionEvent event) {
        System.out.println(event.getActionCommand());
        if (event.getActionCommand().equals("btnPlay"))
        {  
            disableHomeScreen();
            enableMovieScreen();
            scene.repaint();
        }
        if (event.getActionCommand().equals("btnLanguage"))
        {           
            disableHomeScreen();
            enableLanguageScreen();
            scene.repaint();
        }
        if (event.getActionCommand().equals("btnScenes"))
        {
            disableHomeScreen();
            enableSceneScreen();
            scene.repaint();
        }
        if (event.getActionCommand().equals("btnBonus"))
        {
            disableHomeScreen();
            enableBonusScreen();
            scene.repaint();
        }
        if(event.getActionCommand().equals("btnBack"))
        {        
            disableBonusScreen();
            disableLanguageScreen();
            disableScenesScreen();
            disableMovieScreen();
            enableHomeScreen();
            scene.repaint();
        }
        
        if(event.getActionCommand().equals("btnNext"))
        {
            if(storyNr == 0)
            {
                nemoStory1.setVisible(false);
                nemoStory2.setVisible(true);
                nemoStory3.setVisible(false);
                nemoStory4.setVisible(false);
                nemoStory5.setVisible(false);
                storyNr++;
            }
            else if(storyNr == 1)
            {
                nemoStory1.setVisible(false);
                nemoStory2.setVisible(false);
                nemoStory3.setVisible(true);
                nemoStory4.setVisible(false);
                nemoStory5.setVisible(false);
                storyNr++;
            }
            else if(storyNr == 2)
            {
                nemoStory1.setVisible(false);
                nemoStory2.setVisible(false);
                nemoStory3.setVisible(false);
                nemoStory4.setVisible(true);
                nemoStory5.setVisible(false);
                storyNr++;
            }
            else if(storyNr == 3)
            {
                nemoStory1.setVisible(false);
                nemoStory2.setVisible(false);
                nemoStory3.setVisible(false);
                nemoStory4.setVisible(false);
                nemoStory5.setVisible(true);
                storyNr++;
            }
            else if(storyNr == 4)
            {
                nemoStory1.setVisible(true);
                nemoStory2.setVisible(false);
                nemoStory3.setVisible(false);
                nemoStory4.setVisible(false);
                nemoStory5.setVisible(false);
                storyNr = 0;
            }   
            scene.repaint();
        }
    }
}