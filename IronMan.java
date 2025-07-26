/* 
CIS106-1
Lab 1*/

import java.awt.*;
import javax.swing.*;
import java.awt.geom.GeneralPath;

//Create Window
public class IronMan extends JFrame{

    public IronMan() {
        super("Test");
        setLayout(new GridBagLayout());

        setSize(1200,1032);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        
    	//Decorate JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                IronMan tw = new IronMan();
                tw.setVisible(true);
            }
        });
    }

	public void paint (Graphics g2){
   
		int stroke = 4;
		
		super.paint(g2);
		
		Graphics2D g = (Graphics2D) g2;
		
		//Reds
			//Color hotRodRed = new Color(135,0,0);
			Color hotRodRed = new Color(85,0,0);
			Color redShadow = new Color(60,0,0);
			Color darkerRedShadow = new Color(50,0,0);
		//Yellers	
			//Color hotRodYellow = new Color(210,178,0);
			Color hotRodYellow = new Color(239,205,66);
			Color yellerShadow = new Color(165,141,42);
			Color testYeller = new Color(239,208,81);
		//Blues
			Color eyeGlow = new Color(228,247,250);
		//Blacks
			Color lighterGray = new Color(155,155,155);
			Color lightGray = new Color(110,112,115);
			Color darkGray = new Color(67,67,67);
		
		//Display Restrictions (25p border)
			g.setColor(lighterGray);
			g.fillRect(0,0,1200,1032);
			g.setColor(darkGray);
			g.fillRect(25,25,1150,982);
			g.setStroke(new BasicStroke(stroke));
			g.setColor(Color.black);
			g.drawRect(25,25,1150,982);

		   g.setColor(Color.black);
		   g.setStroke(new BasicStroke(stroke));
		
		// Iron Man Back-Outline
			GeneralPath bla = new GeneralPath();
			bla.moveTo(100, 800);
			bla.lineTo(100, 625);
			bla.lineTo(700, 480);
		    bla.lineTo(855, 580);
		    
		    bla.lineTo(1025, 700);
		    bla.lineTo(1100, 700);
		    bla.lineTo(1155, 900);
		    bla.lineTo(1140, 1007);
		    
			bla.lineTo(1000, 1007);
			bla.lineTo(100, 1007);
			bla.lineTo(100, 800);
			
			g.setColor(new Color(0,0,0));
			g.fill(bla);
			g.setColor(new Color(0,0,0));
		   g.draw(bla);
		   bla.closePath();

		//Neck
			GeneralPath neckage = new GeneralPath();
			neckage.moveTo(545, 415);
			neckage.lineTo(530, 435);
			neckage.lineTo(530, 465);
			neckage.lineTo(570, 415);
			g.setColor(hotRodRed);
			g.fill(neckage);
			g.setColor(new Color(0,0,0));
		   g.draw(neckage);
		   neckage.closePath();
		    
			GeneralPath neckage2 = new GeneralPath();
			neckage2.moveTo(530, 435);
			neckage2.lineTo(495, 490);
			neckage2.lineTo(515, 490);
			neckage2.lineTo(530, 465);
			neckage2.lineTo(530, 435);
			g.setColor(hotRodRed);
			g.fill(neckage2);
			g.setColor(new Color(0,0,0));
		   g.draw(neckage2);
		   neckage2.closePath();
		    
			GeneralPath neckage3 = new GeneralPath();
			neckage3.moveTo(570, 415);
			neckage3.lineTo(530, 465);
			neckage3.lineTo(585, 535);
			neckage3.lineTo(615, 535);
			neckage3.lineTo(570, 415);
			g.setColor(hotRodRed);
			g.fill(neckage3);
			g.setColor(new Color(0,0,0));
		   g.draw(neckage3);
		   neckage3.closePath();
		    
			GeneralPath neckage4 = new GeneralPath();
			neckage4.moveTo(530, 465);
			neckage4.lineTo(515, 490);
			neckage4.lineTo(560, 525);
			neckage4.lineTo(560, 505);
			neckage4.lineTo(530, 465);
			g.setColor(hotRodRed);
			g.fill(neckage4);
			g.setColor(new Color(0,0,0));
		   g.draw(neckage4);
		   neckage4.closePath();
		    
			GeneralPath neckage5 = new GeneralPath();
			neckage5.moveTo(560, 505);
			neckage5.lineTo(560, 525);
			neckage5.lineTo(575, 525);
			neckage5.lineTo(560, 505);
			g.setColor(hotRodRed);
			g.fill(neckage5);
			g.setColor(new Color(0,0,0));
		   g.draw(neckage5);
		   neckage5.closePath();
		    
			GeneralPath neckage7 = new GeneralPath();
			neckage7.moveTo(780,590);
			neckage7.lineTo(800,600);
			neckage7.lineTo(800,645);
			neckage7.lineTo(730,645);
			neckage7.lineTo(730,590);
			neckage7.lineTo(780,590);
			g.setColor(lightGray);
			g.fill(neckage7);
			g.setColor(new Color(0,0,0));
		   g.draw(neckage7);
		   neckage7.closePath();

		    GeneralPath neckage6 = new GeneralPath();
			neckage6.moveTo(775,555);
			neckage6.lineTo(780,590);
			neckage6.curveTo(765,615,750,605,745,605);
			neckage6.lineTo(625,545);
			neckage6.lineTo(625,445);
			neckage6.lineTo(775,555);
			g.setColor(hotRodRed);
			g.fill(neckage6);
			g.setColor(new Color(0,0,0));
		   g.draw(neckage6);
		   neckage6.closePath();
		   g.drawLine(775,565,750,605);
		    
			GeneralPath neckline = new GeneralPath();
			neckline.moveTo(755,560);
			neckline.curveTo(755,580,700,580,675,570);
			g.setColor(new Color(0,0,0));
		   g.draw(neckline);
		   neckline.closePath();
		    		    
	      GeneralPath yPart = new GeneralPath();
	      yPart.moveTo(465, 530);
	      yPart.lineTo(515,525);
	      yPart.curveTo(535,525,535,525,545,555);
	      yPart.lineTo(500,575);
	      yPart.lineTo(465, 540);
	      g.setColor(yellerShadow);
		 	g.fill(yPart);
			g.setColor(new Color(0,0,0));
		   g.draw(yPart);
		   yPart.closePath();
		
		    GeneralPath cp19 = new GeneralPath();
	        cp19.moveTo(1050, 715);
	        cp19.lineTo(1080, 755);
	        cp19.curveTo(1080,755,1135,840,1055, 835);
	        g.setColor(hotRodRed);
			g.fill(cp19);
			g.setColor(new Color(0,0,0));
		    g.draw(cp19);
		    cp19.closePath();		
		    g.fillOval(1055,755,25,50);

		    GeneralPath cp16 = new GeneralPath();
	        cp16.moveTo(970,635);
	        cp16.curveTo(985,625,1015,635,1030,645);
	        cp16.lineTo(1090,700);
	        cp16.lineTo(1050,725);
	        g.setColor(hotRodRed);
			g.fill(cp16);
			g.setColor(new Color(0,0,0));
		    g.draw(cp16);
		    cp16.closePath();		    

		    GeneralPath cpline = new GeneralPath();
		    cpline.moveTo(1090,700);
		    cpline.curveTo(1080,685,1025,715,1010,745);
			g.setColor(new Color(0,0,0));
		    g.draw(cpline);
		    cpline.closePath();	
		    
		    GeneralPath cp17 = new GeneralPath();
	        cp17.moveTo(1150, 995);
	        cp17.lineTo(1155, 930);
	        cp17.lineTo(1142, 895);
	        cp17.lineTo(1135, 995);
	        cp17.lineTo(1135, 1000);
	        cp17.lineTo(1150, 995);
	        g.setColor(redShadow);
			g.fill(cp17);
			g.setColor(new Color(0,0,0));
		    g.draw(cp17);
		    cp17.closePath();  

		    GeneralPath cp18 = new GeneralPath();
	        cp18.moveTo(1135, 910);
	        cp18.curveTo(1135, 855,1135,845,1112, 802);
	        cp18.curveTo(1110, 750,1110,735,1070, 705);
	        cp18.lineTo(1090, 685);
	        cp18.curveTo(1105,675,1110,685,1115, 690);
	        cp18.lineTo(1150, 760);
	        cp18.curveTo(1180,825,1175,860,1165, 895);//indent
	        cp18.curveTo(1170,905,1160,955,1155, 960); 
	        cp18.lineTo(1155, 938);
	        cp18.lineTo(1135, 910);
	        g.setColor(hotRodRed);
			g.fill(cp18);
			g.setColor(new Color(0,0,0));
		    g.draw(cp18);
		    cp18.closePath();		    

		    GeneralPath cp20 = new GeneralPath();
	        cp20.moveTo(1165, 895);
	        cp20.lineTo(1125, 905);
	        cp20.lineTo(1120, 825);
	        cp20.lineTo(1150, 795);
	        cp20.lineTo(1140, 755);
	        cp20.lineTo(1135, 745);
	        cp20.lineTo(1130, 740);
	        cp20.lineTo(1100, 735);

			g.setColor(new Color(0,0,0));
		    g.draw(cp20);
		    cp20.closePath();		    

		    GeneralPath cp11 = new GeneralPath();
	        cp11.moveTo(585, 535);
	        cp11.lineTo(500, 555);
	        cp11.lineTo(500, 600);
	        cp11.lineTo(725,590);
	        cp11.lineTo(650, 555);
	        cp11.lineTo(650, 535);
	        cp11.lineTo(585, 535);
	        g.setColor(hotRodRed);
			g.fill(cp11);
			g.setColor(new Color(0,0,0));
		    g.draw(cp11);
		    cp11.closePath();
		    
		    GeneralPath cp13 = new GeneralPath();
	        cp13.moveTo(775, 635);
	        cp13.lineTo(780, 610);
	        cp13.lineTo(855, 580);
	        cp13.lineTo(795, 545);
	        cp13.lineTo(795, 540);
	        cp13.lineTo(865, 575);
	        cp13.curveTo(875,580,895,590,903, 605);
	        cp13.lineTo(965,640);
	        cp13.lineTo(775, 635);
	        g.setColor(hotRodRed);
			g.fill(cp13);
			g.setColor(new Color(0,0,0));
		    g.draw(cp13);
		    cp13.closePath();		    
	
		    GeneralPath cp14 = new GeneralPath();
	        cp14.moveTo(780, 610);
	        cp14.curveTo(775,615,770,630,772, 640);
	        cp14.lineTo(772, 660);
	        cp14.lineTo(810, 665);
	        cp14.lineTo(820, 610); //indent 1
	        cp14.lineTo(790, 630);
	        cp14.lineTo(780, 610);
	        g.setColor(redShadow);
			g.fill(cp14);
			g.setColor(new Color(0,0,0));
		    g.draw(cp14);
		    cp14.closePath();		    
	
		    GeneralPath cp15 = new GeneralPath();
	        cp15.moveTo(810, 665);
	        cp15.lineTo(820, 610);
	        cp15.lineTo(827, 605);
	        cp15.curveTo(845,615,925,635,970,635);
	        cp15.lineTo(990,655);
	        cp15.curveTo(1025,665,1050,700,1055,730);
	        cp15.lineTo(1072,752);
	        cp15.lineTo(952, 925);
	        cp15.lineTo(900, 925);
	        cp15.lineTo(810, 665);
	        g.setColor(hotRodRed);
			g.fill(cp15);
			g.setColor(new Color(0,0,0));
		    g.draw(cp15);
		    cp15.closePath();		    

		//Head
	        GeneralPath head3 = new GeneralPath();
	        head3.moveTo(605, 73);
	        head3.curveTo(565, 85, 545, 135, 545, 145);
	        head3.curveTo(525, 220, 505, 285, 535, 380);
	        head3.lineTo(560, 435);
	        head3.lineTo(700, 435);
	        head3.lineTo(700, 65); 
			g.setColor(hotRodRed);
			g.fill(head3);
			g.setColor(new Color(0,0,0));
		    g.draw(head3);
		    head3.closePath();
        
	        GeneralPath head2 = new GeneralPath();
			head2.moveTo(845,110);
			head2.curveTo(815, 65, 685, 25, 605, 73);
			head2.curveTo(620, 70, 625, 80, 630, 85);
			head2.lineTo(650, 555);
			head2.lineTo(780,567);
			g.setColor(redShadow);
			g.fill(head2);
			g.setColor(new Color(0,0,0));
		    g.draw(head2);
		    head2.closePath();	
		    
		    //Jaw starting at bottom of ear
        	GeneralPath head = new GeneralPath();
			head.moveTo(535, 380);
			head.lineTo(575, 515);
			head.lineTo(650, 555);
			head.lineTo(695, 540); //indent line 1
			head.lineTo(765, 545); //indent line 2			
			head.lineTo(780,567);
			head.curveTo(840, 525, 845, 410, 860, 365);
			head.lineTo(580, 360);
			head.lineTo(550,320);
			g.setColor(hotRodRed);
			g.fill(head);
			g.setColor(new Color(0,0,0));
		    g.draw(head);
	        head.closePath();
	        g.drawLine(695, 540, 690, 510);
	        g.drawLine(765, 545, 772, 514);
	        
	        g.setColor(redShadow);
	        g.fillOval(515,225,35,155);
	        g.setColor(new Color(0,0,0));
	        g.drawOval(515, 225, 35, 155);
	        
	        g.setColor(hotRodRed);
	        g.fillOval(515,235,35,145);
	        g.setColor(new Color(0,0,0));
	        g.drawOval(515, 235, 35, 145);
	        
	        g.setColor(hotRodRed);
	        g.fillOval(512,250,20,120);
	        g.setColor(new Color(0,0,0));
	        g.drawOval(512, 250, 20, 120);
	        
	        //Random lines
		        GeneralPath line1 = new GeneralPath();
		        line1.moveTo(580, 360);
		        line1.curveTo(585,380,565,435,555,445);
				g.setColor(new Color(0,0,0));
			    g.draw(line1);
			    line1.closePath();
	
		        GeneralPath line2 = new GeneralPath();
		        line2.moveTo(585, 280);
		        line2.curveTo(585,170,545,170,550, 130);
				g.setColor(new Color(0,0,0));
			    g.draw(line2);
			    line2.closePath();
		        
		        GeneralPath line3 = new GeneralPath();
		        line3.moveTo(570, 100);
		        line3.curveTo(575,95,590,115,590, 120);
		        
				g.setColor(new Color(0,0,0));
			    g.draw(line3);
			    line3.closePath();
			    
			//forehead thing
		        GeneralPath thing = new GeneralPath();
		        thing.moveTo(675, 70);
		        thing.lineTo(700,105);
		        thing.lineTo(695,115);
		        //thing.curveTo(815, 65, 685, 25, 695, 105);
		        
				g.setColor(hotRodRed);
				g.fill(thing);
				g.setColor(new Color(0,0,0));
			    g.draw(thing);
			    thing.closePath();	
			    
			    GeneralPath thingLine = new GeneralPath();
			    g.setStroke(new BasicStroke(8));
			    thingLine.moveTo(701, 102);
			    thingLine.curveTo(725, 100, 750, 100, 783, 110);
			    g.draw(thingLine);
			    g.setStroke(new BasicStroke(stroke));
			    g.drawLine(785, 110,790, 170);
			    //g.drawLine(785, 110,795, 105);
	        
		//Shadow Behind Face Mask
	        GeneralPath shadow = new GeneralPath();
	        shadow.moveTo(565,320);
	        shadow.lineTo(630, 470);
	        shadow.lineTo(648, 500);
	        shadow.lineTo(750, 500);
	        shadow.lineTo(772, 500);
	        shadow.lineTo(792, 500);
	        shadow.lineTo(810, 480);
	        shadow.lineTo(865,355);
	        
	        g.setColor(new Color(0,0,0));
			g.fill(shadow);
		    shadow.closePath();

		//Mouth Piece
	        GeneralPath jawMask = new GeneralPath();
	        jawMask.moveTo(630, 470);
	        jawMask.lineTo(615, 505);
	        jawMask.lineTo(648, 530);
	        jawMask.lineTo(690, 510); //indent line 1
	        jawMask.lineTo(715, 511);
	        jawMask.lineTo(718, 502);
	        jawMask.lineTo(750, 503);
	        jawMask.lineTo(752, 512);
	        jawMask.lineTo(772, 514); //indent line 2
	        jawMask.lineTo(792, 540);
	        jawMask.lineTo(812, 520);
	        jawMask.lineTo(810, 480);
	        jawMask.lineTo(795, 500);
	        jawMask.lineTo(780, 475); //indent line 2 to here
	        jawMask.lineTo(685, 470); //indent line 1 to here
	        jawMask.lineTo(660, 495);
	        jawMask.lineTo(630, 470);
	        g.setColor(hotRodYellow);
	        g.fill(jawMask);
	        g.setColor(new Color(0,0,0));
	        g.draw(jawMask);
	        jawMask.closePath();
	        g.drawLine(690, 510,685, 470);
	        g.drawLine(772, 514,780, 475);
		
		//Face Mask
			GeneralPath facePath = new GeneralPath();
			facePath.moveTo(675, 70);
			facePath.lineTo(715, 180);
			facePath.lineTo(790, 185);
			facePath.curveTo(795,90,790,85,785,75);
			facePath.curveTo(880,115,875,125,870,300);
			facePath.lineTo(865,355);
			facePath.curveTo(865, 365, 825, 405, 812, 470);
			facePath.lineTo(795, 490);
			facePath.lineTo(785, 465);
			facePath.lineTo(685, 460);
			facePath.lineTo(660, 485);
			facePath.lineTo(635, 465);
			facePath.curveTo(647,395,570,380,565,320);
			facePath.lineTo(600,245);
			facePath.curveTo(595,220,585,170,585,115);
			facePath.curveTo(600, 90, 650, 65, 675, 70);
			g.setColor(hotRodYellow);
			g.fill(facePath);
			g.setColor(new Color(0,0,0));
		    g.draw(facePath);
	        facePath.closePath();
	        
        //Eyes
		    g.setStroke(new BasicStroke(3));
		    GeneralPath unibrow = new GeneralPath();
		    unibrow.moveTo(710, 290);
		    unibrow.curveTo(725,295,775,300,785, 295);
		    unibrow.lineTo(787, 305);
		    unibrow.curveTo(775,300,725,295,710, 298);
			g.setColor(new Color(0,0,0));
		    g.fill(unibrow);
		    unibrow.closePath();
		    
	        g.drawLine(585, 280, 605, 295);
	        GeneralPath eye1 = new GeneralPath();
	        eye1.moveTo(605, 295);
	        eye1.lineTo(620, 260);
	        eye1.lineTo(710, 290);
	        eye1.lineTo(705, 315);
	        eye1.curveTo(675, 315, 625, 310, 605, 295);
			g.setColor(eyeGlow);
			g.fill(eye1);
			g.setColor(new Color(0,0,0));
		    g.draw(eye1);
		    eye1.closePath();

	        GeneralPath eye2 = new GeneralPath();
	        eye2.moveTo(785, 295);
	        eye2.lineTo(786, 320);
	        eye2.lineTo(845, 320);
	        eye2.lineTo(865, 300);
	        eye2.lineTo(860, 280);
	        eye2.lineTo(785, 295);
			g.setColor(eyeGlow);
			g.fill(eye2);
			g.setColor(new Color(0,0,0));
		    g.draw(eye2);
		    eye2.closePath();
		    g.setStroke(new BasicStroke(stroke));
	    
		//Arms
	        GeneralPath arm5 = new GeneralPath();
	        arm5.moveTo(1065, 975);
	        
	        g.setColor(hotRodRed);
			g.fill(arm5);
			g.setColor(new Color(0,0,0));
		    g.draw(arm5);
		    arm5.closePath();

		    GeneralPath arm2 = new GeneralPath();
	        arm2.moveTo(1065, 975); //similar point
	        arm2.lineTo(1095, 1007);
	        arm2.lineTo(1000, 1007);
	        arm2.lineTo(1065, 975);
	        g.setColor(lightGray);
			g.fill(arm2);
			g.setColor(new Color(0,0,0));
		    g.draw(arm2);
		    arm2.closePath();

	        GeneralPath arm4 = new GeneralPath();
	        arm4.moveTo(1113, 940);
	        arm4.lineTo(1118, 910);
	        arm4.curveTo(1115,850,1075,820,1064, 845);
	        arm4.lineTo(1050, 845);
	        arm4.lineTo(1050, 975);
	        arm4.lineTo(1113, 940);
	        g.setColor(testYeller);
			g.fill(arm4);
			g.setColor(new Color(0,0,0));
		    g.draw(arm4);
		    arm4.closePath();

	        GeneralPath arm3 = new GeneralPath();
	        arm3.moveTo(1065, 975);
	        arm3.lineTo(1100, 1007);
	        arm3.lineTo(1155, 1007);
	        arm3.lineTo(1150, 995); //indent
	        arm3.lineTo(1140, 995);
	        arm3.lineTo(1115, 940); //indent
	        arm3.curveTo(1105,950,1085,945,1065, 930);
	        arm3.lineTo(1025, 930);
	        arm3.lineTo(1065, 975);
	        g.setColor(testYeller);
			g.fill(arm3);
			g.setColor(new Color(0,0,0));
		    g.draw(arm3);
		    arm3.closePath();

	        GeneralPath g7 = new GeneralPath();
	        g7.moveTo(165, 800);
	        g7.lineTo(165,1007);
	        g7.lineTo(300, 955);
	        g7.curveTo(320,965,340,945,340, 935);
	        g7.curveTo(345,940,365,780,305, 775); //indent 1
	        g7.lineTo(305, 750);
	        g7.lineTo(275, 750);
	        g7.lineTo(165, 800);
	        g.setColor(darkGray);
			g.fill(g7);
			g.setColor(new Color(0,0,0));
		    g.draw(g7);
		    g7.closePath();

	        GeneralPath g8 = new GeneralPath();
	        g8.moveTo(305, 775);
	        g8.curveTo(295,825,275,850,260, 870);
	        g8.curveTo(240,835,245,795,245, 785);
			g.setColor(new Color(0,0,0));
		    g.draw(g8);
		    g8.closePath();

	        GeneralPath g6 = new GeneralPath();
	        g6.moveTo(60,925);
	        g6.lineTo(60,1007);
	        g6.lineTo(160,1007);
	        g6.lineTo(160,925);
	        g6.lineTo(60,925);
	        g.setColor(yellerShadow);
			g.fill(g6);
			g.setColor(new Color(0,0,0));
		    g.draw(g6);
		    g6.closePath();

	        GeneralPath g5 = new GeneralPath();
	        g5.moveTo(80,975);
	        g5.lineTo(100,1007);
	        g5.lineTo(25,1007);
	        g5.lineTo(25, 900);
	        g.setColor(testYeller);
			g.fill(g5);
			g.setColor(new Color(0,0,0));
		    g.draw(g5);
		    g5.closePath();

	        GeneralPath g3 = new GeneralPath();
	        g3.moveTo(170, 1007);
	        g3.lineTo(200, 1007);
	        g3.lineTo(335, 1007);
	        g3.lineTo(325, 970); //indent 1
	        g3.lineTo(335, 955);
	        g3.lineTo(260, 870);
	        g3.lineTo(195, 975);
	        g3.lineTo(170, 1007);
	        g.setColor(lightGray);
			g.fill(g3);
			g.setColor(new Color(0,0,0));
		    g.draw(g3);
		    g3.closePath();
		    
	        GeneralPath g4 = new GeneralPath();
	        g4.moveTo(325, 970);
	        g4.lineTo(295, 1007);
	        g4.lineTo(230, 1007);
	        g4.lineTo(195, 975);
	        g.setColor(new Color(0,0,0));
		    g.draw(g4);
		    g4.closePath();
	
	        GeneralPath g1 = new GeneralPath();
	        g1.moveTo(100, 952);
	        g1.lineTo(125, 1007);
	        g1.lineTo(170, 1007);
	        g1.lineTo(195, 975);
	        g1.lineTo(175, 830);
	        g1.lineTo(100, 952);
	        g.setColor(lightGray);
			g.fill(g1);
			g.setColor(new Color(0,0,0));
		    g.draw(g1);
		    g1.closePath();
		
	        GeneralPath arm1 = new GeneralPath();
	        arm1.moveTo(80, 778);
	        arm1.curveTo(45,840,35,845,25,885);
	        arm1.lineTo(25, 900);
	        arm1.curveTo(30,925,60,970,75,980);
	        arm1.lineTo(170, 890);
	        arm1.lineTo(175, 830);
	        arm1.lineTo(80, 778);
	        g.setColor(testYeller);
			g.fill(arm1);
			g.setColor(new Color(0,0,0));
		    g.draw(arm1);
		    arm1.closePath();
		    
	        GeneralPath top1 = new GeneralPath();
	        top1.moveTo(312, 660);
	        top1.lineTo(313, 684);
	        top1.curveTo(305,677,270,677,255, 684);
	        top1.lineTo(200, 684);
	        top1.lineTo(185, 770);
	        top1.lineTo(145, 820);
	        top1.curveTo(145,830,170,835,175, 830);
	        top1.lineTo(225, 800);
	        top1.curveTo(240,780,300,770,315,775);
	        top1.lineTo(365,825);
	        top1.lineTo(380,825);
	        top1.lineTo(375,785);
	        top1.lineTo(400,660);
	        top1.lineTo(312, 650);
	        top1.lineTo(312, 660);
	        g.setColor(yellerShadow);
		g.fill(top1);
		g.setColor(new Color(0,0,0));
		g.draw(top1);
		top1.closePath();
		    
	        GeneralPath armLine1 = new GeneralPath();
	        armLine1.moveTo(185, 770);
	        armLine1.lineTo(316,740);
	        armLine1.curveTo(316,740,370,770,375,785);
		g.setColor(new Color(0,0,0));
		g.draw(armLine1);
		armLine1.closePath();

	        GeneralPath armLine2 = new GeneralPath();
	        armLine2.moveTo(313, 684);
	        armLine2.lineTo(316,740);
	        armLine2.lineTo(315,775);
		g.setColor(new Color(0,0,0));
		g.draw(armLine2);
		armLine2.closePath();

		//trapezius
		GeneralPath trap4 = new GeneralPath();
	        trap4.moveTo(545, 510);
	        trap4.lineTo(545, 518);
	        trap4.lineTo(470, 538);
	        trap4.lineTo(470, 510);
	        trap4.lineTo(545, 510);
	        g.setColor(hotRodRed);
			g.fill(trap4);
			g.setColor(new Color(0,0,0));
		    g.draw(trap4);
		    trap4.closePath();

	    	GeneralPath trap3 = new GeneralPath();
	        trap3.moveTo(395, 505);
	        trap3.curveTo(430,492,490,485,500, 485);
	        trap3.curveTo(515,485,545,505,545, 510);
	        trap3.lineTo(470, 530);
	        trap3.lineTo(450, 530);
	        trap3.lineTo(405, 505);
	        g.setColor(hotRodRed);
			g.fill(trap3);
			g.setColor(new Color(0,0,0));
		    g.draw(trap3);
		    trap3.closePath();

		    GeneralPath trap2 = new GeneralPath();
	        trap2.moveTo(475, 545);
	        trap2.lineTo(480, 530);
	        trap2.curveTo(425,490,390,500,360, 525);
	        trap2.lineTo(360, 545);
	        trap2.lineTo(475, 545);
	        g.setColor(hotRodRed);
			g.fill(trap2);
			g.setColor(new Color(0,0,0));
		    g.draw(trap2);
		    trap2.closePath();
	
		    GeneralPath trap1 = new GeneralPath();
	        trap1.moveTo(375, 545);
	        trap1.curveTo(390,515,440,525,475, 545);
	        trap1.lineTo(470, 570);
	        trap1.lineTo(450, 610);
	        trap1.lineTo(400, 610);
	        trap1.lineTo(375, 545);
	        g.setColor(hotRodRed);
			g.fill(trap1);
			g.setColor(new Color(0,0,0));
		    g.draw(trap1);
		    trap1.closePath();

		//Shoulders
	        GeneralPath sh2 = new GeneralPath();
	        sh2.moveTo(135, 565);
	        sh2.curveTo(175,520,225,505,265,504);
	        sh2.lineTo(290, 515);
	        sh2.lineTo(180, 795); //square part
	        sh2.lineTo(157, 823); //square part
	        sh2.lineTo(100, 795);
	        sh2.lineTo(135, 565);
	        g.setColor(hotRodRed);
			g.fill(sh2);
			g.setColor(new Color(0,0,0));
		    g.draw(sh2);
		    sh2.closePath();
		
	        GeneralPath sh3 = new GeneralPath();
	        sh3.moveTo(410, 600);
	        sh3.curveTo(430,610,430,640,425, 660);
	        sh3.lineTo(420, 710);
	        sh3.curveTo(410,720,325,715,320, 655);
	        sh3.lineTo(315, 668);
	        sh3.lineTo(267, 668); //indent 1
	        sh3.lineTo(205, 740); //indent 2
	        sh3.lineTo(195, 770);
	        sh3.lineTo(193, 780);
	        sh3.lineTo(180, 795); //sq1
	        sh3.lineTo(132, 752);
	        sh3.lineTo(112, 783);
	        sh3.lineTo(157, 823); //sq2
	        sh3.lineTo(154, 826);
	        sh3.curveTo(120,835,90,795,80, 778);
	        sh3.lineTo(160,585);
	        sh3.lineTo(400, 580);
	        sh3.lineTo(410, 600);
	        g.setColor(redShadow);
			g.fill(sh3);
			g.setColor(new Color(0,0,0));
		    g.draw(sh3);
		    sh3.closePath();
		    
	        GeneralPath sh4 = new GeneralPath();
	        sh4.moveTo(320, 655);
	        sh4.lineTo(245, 630);
	        sh4.lineTo(170, 707);
	        sh4.curveTo(170,725,165,750,195, 770);
			g.setColor(new Color(0,0,0));
		    g.draw(sh4);
		    sh4.closePath();
		    g.drawLine(245, 630, 267, 668);
		    g.drawLine(205, 740, 170, 730);
		
	        GeneralPath sh1 = new GeneralPath();
	        sh1.moveTo(410,545);
	        sh1.curveTo(315,495,230,505,170, 555);
	        sh1.lineTo(130, 565);
	        sh1.curveTo(125,560,100,605,100, 610);
	        sh1.lineTo(90, 611);
	        sh1.curveTo(65,635,55,750,80, 778);
	        sh1.lineTo(100, 767);
	        sh1.lineTo(160, 670);
	        sh1.lineTo(220, 610);
	        sh1.curveTo(250,585,275,575,355, 605);
	        sh1.curveTo(365,593,395,593,410, 600);
	        sh1.curveTo(413,595,415,560,410,545);
	        g.setColor(hotRodRed);
			g.fill(sh1);
			g.setColor(new Color(0,0,0));
		    g.draw(sh1);
		    sh1.closePath();
		    g.drawLine(100, 610,160,585);
		    g.drawLine(160,585,160, 670);

		//Chest Piece
		    GeneralPath cp8 = new GeneralPath();
	        cp8.moveTo(485,790);
	        cp8.lineTo(395, 775);
	        cp8.lineTo(385, 825);
	        cp8.lineTo(385, 860);
	        cp8.curveTo(370,900,375,950,380, 975);
	        g.setColor(darkerRedShadow);
			g.fill(cp8);
			g.setColor(new Color(0,0,0));
		    g.draw(cp8);
		    cp8.closePath();
		    
		    GeneralPath cp10 = new GeneralPath();
	        cp10.moveTo(757,975);
	        cp10.curveTo(825,970,875,980,920,997);
	        cp10.lineTo(919,1007);
	        cp10.lineTo(755,1007);
	        cp10.lineTo(757,975);
	        g.setColor(hotRodRed);
			g.fill(cp10);
			g.setColor(new Color(0,0,0));
		    g.draw(cp10);
		    cp10.closePath();

		    GeneralPath cp9 = new GeneralPath();
	        cp9.moveTo(715,1007);
	        cp9.lineTo(757,975);
	        cp9.curveTo(760,985,760,1000,760,1007);
	        cp9.lineTo(715,1007);
	        g.setColor(redShadow);
			g.fill(cp9);
			g.setColor(new Color(0,0,0));
		    g.draw(cp9);
		    cp9.closePath();

		    GeneralPath cp6 = new GeneralPath();
	        cp6.moveTo(400,920);
	        cp6.lineTo(423,878);
	        cp6.lineTo(447,843);
	        cp6.lineTo(475,805);
	        cp6.lineTo(675,805);
	        cp6.lineTo(675,985);
	        cp6.lineTo(475,985);
	        cp6.lineTo(400,920);
	        g.setColor(lightGray);
			g.fill(cp6);
			g.setColor(new Color(0,0,0));
		    g.draw(cp6);
		    cp6.closePath();
		    
		    GeneralPath cp7 = new GeneralPath();
	        cp7.moveTo(425,950);
	        cp7.lineTo(470, 885);
	        cp7.lineTo(530, 825);
	        cp7.lineTo(600, 825);
	        cp7.lineTo(600, 950);
	        cp7.lineTo(425,950);
	        g.setColor(darkGray);
			g.fill(cp7);
			g.setColor(new Color(0,0,0));
		    g.draw(cp7);
		    cp7.closePath();
		    g.drawLine(435,950, 480, 895);
		    g.drawLine(485, 885, 545, 830);

	        GeneralPath cp4 = new GeneralPath();
	        cp4.moveTo(720,990);
	        cp4.lineTo(695,1007);
	        cp4.lineTo(600,1007); //indent 0
	        cp4.lineTo(365,1007);
	        cp4.curveTo(365,995,360,995,400,920); //indent 1
	        cp4.lineTo(480,950);
	        cp4.lineTo(525,930);
	        cp4.curveTo(500,910,450,885,423,878); //indent 2
	        cp4.lineTo(447,843); //indent 3
	        cp4.lineTo(545,895);
	        cp4.lineTo(587,873);
	        cp4.curveTo(550,840,500,815,475,805); //indent 4
	        cp4.lineTo(510,765);
	        cp4.lineTo(625,765);
	        cp4.lineTo(720,990);
	        g.setColor(redShadow);
			g.fill(cp4);
			g.setColor(new Color(0,0,0));
		    g.draw(cp4);
		    cp4.closePath();
		    
		    GeneralPath cp5 = new GeneralPath();
	        cp5.moveTo(600,1007);
	        cp5.curveTo(590,990,550,945,525,930);
			g.setColor(new Color(0,0,0));
		    g.draw(cp5);
		    cp5.closePath();

	        GeneralPath cp3 = new GeneralPath();
	        cp3.moveTo(454, 650);
	        cp3.lineTo(425,645);
	        cp3.lineTo(395,705);
	        cp3.lineTo(500,770);
	        cp3.curveTo(625,850,670,925,720,990);
	        cp3.lineTo(755, 960);
	        cp3.lineTo(755, 750);
	        cp3.lineTo(454, 650);
	        g.setColor(redShadow);
			g.fill(cp3);
			g.setColor(new Color(0,0,0));
		    g.draw(cp3);
		    cp3.closePath();

		    GeneralPath cp2 = new GeneralPath();
	        cp2.moveTo(450, 610);
	        cp2.lineTo(475, 635);
	        cp2.lineTo(475, 610);
	        cp2.lineTo(470, 570);
	        cp2.lineTo(450, 610);
	        g.setColor(hotRodRed);
			g.fill(cp2);
			g.setColor(new Color(0,0,0));
		    g.draw(cp2);
		    cp2.closePath();
		    
		    GeneralPath cpi2 = new GeneralPath();
		    cpi2.moveTo(1064, 905);
		    cpi2.lineTo(1064, 965);
		    cpi2.lineTo(1020, 965);
		    cpi2.lineTo(1020, 905);
		    cpi2.lineTo(1064, 905);
	        g.setColor(lightGray);
			g.fill(cpi2);
			g.setColor(new Color(0,0,0));
		    g.draw(cpi2);
		    cpi2.closePath();

		    GeneralPath cpi = new GeneralPath();
		    cpi.moveTo(1064, 965);
		    cpi.lineTo(1064, 905);
		    cpi.lineTo(1056, 905);
		    cpi.lineTo(1056, 950);
		    cpi.lineTo(1025, 985);
	        g.setColor(Color.black);
			g.fill(cpi);
			g.setColor(new Color(0,0,0));
		    g.draw(cpi);
		    cpi.closePath();
		   
	        GeneralPath cp1 = new GeneralPath();
	        cp1.moveTo(640, 560);
	        cp1.lineTo(470, 565);
	        cp1.lineTo(415, 590);
	        cp1.lineTo(422, 597);
	        cp1.lineTo(455, 597);
	        cp1.lineTo(477, 621);
	        cp1.lineTo(454, 650);
	        cp1.curveTo(550,680,700,825,737, 892); //indent 1
	        cp1.lineTo(755, 960);
	        cp1.lineTo(925, 980); //indent 2
	        //cp1.lineTo(952, 925); //intersecting point
	        cp1.lineTo(945, 1007);
	        cp1.lineTo(1050, 1007);
	        cp1.lineTo(1065, 985);
	        cp1.lineTo(1065, 950);
	        cp1.lineTo(1050, 970);
	        cp1.lineTo(1035, 942); //indent 3
	        cp1.lineTo(1070, 900);
	        cp1.lineTo(1070, 860); //indent 4
	        cp1.curveTo(1080,825,1075,775,1070, 750); //indent 5
	        cp1.lineTo(952, 925); //indent 4
	        cp1.curveTo(930,900,905,875,865,800);
	        cp1.lineTo(770,645);
	        cp1.lineTo(772,625);
	        cp1.curveTo(740,590,740,590,640, 560);
	        g.setColor(hotRodRed);
			g.fill(cp1);
			g.setColor(new Color(0,0,0));
		    g.draw(cp1);
		    cp1.closePath();

	        GeneralPath cp12 = new GeneralPath();
	        cp12.moveTo(737, 892);
	        cp12.curveTo(725,900,785,850,812, 798);
	        cp12.lineTo(865,800);
	        g.setColor(hotRodRed);
			g.fill(cp12);
			g.setColor(new Color(0,0,0));
		    g.draw(cp12);
		    cp12.closePath();
		    
		    g.drawLine(952, 925,985,965);
		    g.drawLine(985,965,1070, 860);
		    g.drawLine(1035, 942,985, 1007);

		//Arc Reactor
	        GeneralPath ar2 = new GeneralPath();
	        ar2.moveTo(770, 855);
	        ar2.lineTo(590, 640);
	        ar2.lineTo(610, 620);
	        ar2.lineTo(975, 680);
	        ar2.lineTo(997, 704);
	        ar2.lineTo(915, 880);
	        ar2.lineTo(770, 855);
	        g.setColor(hotRodRed);
			g.fill(ar2);
			g.setColor(new Color(0,0,0));
		    g.draw(ar2);
		    ar2.closePath();

	        GeneralPath ar3 = new GeneralPath();
	        ar3.moveTo(737, 892);
	        ar3.moveTo(755, 960);
	        ar3.lineTo(925, 980);
	        ar3.lineTo(952, 925);
	        ar3.curveTo(930,900,905,875,865,800);
	        ar3.lineTo(812, 798);
	        ar3.curveTo(785,850,725,900,737, 892);
	        ar3.lineTo(755, 960);	        
	        g.setColor(hotRodRed);
			g.fill(ar3);
			g.setColor(new Color(0,0,0));
		    g.draw(ar3);
		    ar3.closePath();
	        
	        GeneralPath ar1 = new GeneralPath();
	        ar1.moveTo(840, 825);
	        ar1.curveTo(875,795,910,750,940, 705);
	        ar1.lineTo(685, 665);
	        ar1.lineTo(840, 825);
	        g.setColor(eyeGlow);
			g.fill(ar1);
			g.setColor(new Color(0,0,0));
		    g.draw(ar1);
		    ar1.closePath();
	}

}