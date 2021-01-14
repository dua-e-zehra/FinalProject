//3911Maria Iram,3932Maria Jabeen,3934Dua-e-Zehra

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz implements MouseListener{
	JFrame jf;
	JPanel jp,jp0,jp1,jp2,jp3,jp4,jp5,jp8;
	JPanel cards;
	CardLayout c1;
	JTextField jt0,jt1;
	JTextField jt3[]=new JTextField[5];
	JTextField jt4[]=new JTextField[16];
	JLabel j1[]=new JLabel[10];
	JLabel j2[]=new JLabel[15];
	JLabel j3[]=new JLabel[11];
	JLabel j7[]=new JLabel[10];
	JLabel j4,j5,j6,j8,j9,j10,j11,j13,j14,j15,j16;
	JLabel j12[]=new JLabel[5];
    JButton jb0[]=new JButton[5];
    JButton jb1=new JButton();
    JButton jb2=new JButton();
   
	BufferedImage Image,Image1,Image2,Image3,Image4,Image5,Image6,Image7,
	Image8,Image9,Image10,Image11,Image12,Image13,Image14,Image15,Image16,Image17,Image18,Image19;
	Font Font,Font0,Font1,Font2,Font4;
	
	Quiz()
	{
		jf=new JFrame("Learning Colors");
		jp0=new JPanel();
		jp=new JPanel();
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp4=new JPanel();
		jp5=new JPanel();
		jp8=new JPanel();
		
		
		jp0.setLayout(null);
		jp.setLayout(null);
		jp1.setLayout(null);
		jp2.setLayout(null);
		jp3.setLayout(null);
		jp4.setLayout(null);jp5.setLayout(null);
		jp8.setLayout(null);
		
		
		jt0=new JTextField(" Learn Colors");
		jt0.setBounds(350,130,380,100);
		Font=new Font("Bell MT",Font.ITALIC+Font.BOLD,60);
		jt0.setFont(Font);
		jt0.setForeground(Color.magenta);
		jt0.setBackground(Color.LIGHT_GRAY);
		jt0.setEditable(false);
		jt0.addMouseListener(this);
		
		jt1=new JTextField("    Quiz");
		jt1.setBounds(350,250,380,100);
		jt1.setFont(Font);
		jt1.setForeground(Color.MAGENTA);
		jt1.setBackground(Color.LIGHT_GRAY);
		jt1.setEditable(false);
		jt1.addMouseListener(this);
		
		jb0[0]=new JButton("->");
		Font2=new Font("Algerian",Font.BOLD,30);
		jb0[0].setFont(Font2);
		jb0[0].setBounds(1020,580,60,60);
		jb0[0].setBackground(Color.PINK);
		jb0[0].addMouseListener(this);
		
		jb0[1]=new JButton("->");
		jb0[1].setFont(Font2);
		jb0[1].setBounds(1020,580,60,60);
		jb0[1].setBackground(Color.PINK);
		jb0[1].addMouseListener(this);
		
		jb0[2]=new JButton("->");
		jb0[2].setFont(Font2);
		jb0[2].setBounds(1020,580,60,60);
		jb0[2].setBackground(Color.PINK);
		jb0[2].addMouseListener(this);
		
		jb0[3]=new JButton("->");
		jb0[3].setFont(Font2);
		jb0[3].setBounds(1020,580,60,60);
		jb0[3].setBackground(Color.PINK);
		jb0[3].addMouseListener(this);
		
		jb0[4]=new JButton("->");
		jb0[4].setFont(Font2);
		jb0[4].setBounds(1020,580,60,60);
		jb0[4].setBackground(Color.PINK);
		jb0[4].addMouseListener(this);
		
		
		jb1=new JButton("Back");
		Font2=new Font("Algerian",Font.BOLD,30);
		jb1.setFont(Font2);
		jb1.setBounds(30,580,150,60);
		jb1.setBackground(Color.PINK);
		jb1.addMouseListener(this);
		
		jb2=new JButton("Back");
		jb2.setFont(Font2);
		jb2.setBounds(30,580,150,60);
		jb2.setBackground(Color.PINK);
		jb2.addMouseListener(this);
		
	try
	{
		Image=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Frame.JPG"));
		j3[0] = new JLabel(new ImageIcon(Image));
		j3[0].setSize(1150,690);
		
		Image=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Frame.JPG"));
		j3[1] = new JLabel(new ImageIcon(Image));
		j3[1].setSize(1150,690);
		
		Image=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Frame.JPG"));
		j3[2] = new JLabel(new ImageIcon(Image));
		j3[2].setSize(1150,690);
		
		Image=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Frame.JPG"));
		j3[3] = new JLabel(new ImageIcon(Image));
		j3[3].setSize(1150,690);
		
		Image=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Frame.JPG"));
		j3[4] = new JLabel(new ImageIcon(Image));
		j3[4].setSize(1150,690);
		
		Image=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Frame.JPG"));
		j3[5] = new JLabel(new ImageIcon(Image));
		j3[5].setSize(1150,690);
		
		Image=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Frame.JPG"));
		j3[6] = new JLabel(new ImageIcon(Image));
		j3[6].setSize(1150,690);
		
		j3[7] = new JLabel(new ImageIcon(Image));
		j3[7].setSize(1150,690);
		
		j3[8] = new JLabel(new ImageIcon(Image));
		j3[8].setSize(1150,690);
		
		j3[9] = new JLabel(new ImageIcon(Image));
		j3[9].setSize(1150,690);
		
		j3[10] = new JLabel(new ImageIcon(Image));
		j3[10].setSize(1150,690);

		
				
	 Image1=ImageIO.read(new File("C:\\Users\\US\\Pictures\\YellowBall.PNG"));
	j1[1] = new JLabel(new ImageIcon(Image1));
	j1[1].setBounds(300,400,139,139);
	j1[1].addMouseListener(this);

	Image2=ImageIO.read(new File("C:\\Users\\US\\Pictures\\BlueBall.PNG"));
	j1[2] = new JLabel(new ImageIcon(Image2));
	j1[2].setBounds(450,400,139,139);
	j1[2].addMouseListener(this);
	
	Image3=ImageIO.read(new File("C:\\Users\\US\\Pictures\\GreenBall.PNG"));
	j1[3] = new JLabel(new ImageIcon(Image3));
	j1[3].setBounds(600,400,139,139);
	j1[3].addMouseListener(this);
	
	Image11=ImageIO.read(new File("C:\\Users\\US\\Pictures\\RedBall.PNG"));
	j1[4] = new JLabel(new ImageIcon(Image11));
	j1[4].setBounds(750,400,139,139);
	j1[4].addMouseListener(this);
	
   
    jp.add(j1[1]);
    jp.add(j1[2]);
    jp.add(j1[3]);
    jp.add(j1[4]);
  
    
    Image4=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Basket2.PNG"));
	j2[0] = new JLabel(new ImageIcon(Image4));
	j2[0].setBounds(220,360,520,300);
	
	
	Image5=ImageIO.read(new File("C:\\Users\\US\\Pictures\\RedBallon.PNG"));
	j2[1] = new JLabel(new ImageIcon(Image5));
	j2[1].setBounds(680,230,109,211);

	Image6=ImageIO.read(new File("C:\\Users\\US\\Pictures\\BlueBallon.PNG"));
	j2[2] = new JLabel(new ImageIcon(Image6));
	j2[2].setBounds(780,100,97,137);
	j2[2].addMouseListener(this);
	
	Image7=ImageIO.read(new File("C:\\Users\\US\\Pictures\\GreenBallon.PNG"));
	j2[3] = new JLabel(new ImageIcon(Image7));
	j2[3].setBounds(950,50,106,200);
	
	Image8=ImageIO.read(new File("C:\\Users\\US\\Pictures\\YellowBallon.PNG"));
	j2[4] = new JLabel(new ImageIcon(Image8));
	j2[4].setBounds(800,230,101,160);
	
	Image9=ImageIO.read(new File("C:\\Users\\US\\Pictures\\purpleBallon.PNG"));
	j2[7] = new JLabel(new ImageIcon(Image9));
	j2[7].setBounds(920,400,110,200);
	
	j2[5] = new JLabel(new ImageIcon(Image6));
	j2[5].setBounds(950,230,97,137);
	j2[5].addMouseListener(this);
	
	j2[6] = new JLabel(new ImageIcon(Image6));
	j2[6].setBounds(800,400,97,137);
	j2[6].addMouseListener(this);

	Image10=ImageIO.read(new File("C:\\Users\\US\\Pictures\\Bear4.PNG"));
	j2[8] = new JLabel(new ImageIcon(Image10));
	j2[8].setBounds(0,150,360,402);
	
	j2[9] = new JLabel(new ImageIcon(Image10));
	j2[9].setBounds(0,150,360,402);
	
	j2[10] = new JLabel(new ImageIcon(Image10));
	j2[10].setBounds(0,150,360,402);
	
	j2[11] = new JLabel(new ImageIcon(Image10));
	j2[11].setBounds(0,150,360,402);
	
	j2[12] = new JLabel(new ImageIcon(Image10));
	j2[12].setBounds(0,150,360,402);
	
	j2[13] = new JLabel(new ImageIcon(Image10));
	j2[13].setBounds(0,150,360,402);
	
	j2[14] = new JLabel(new ImageIcon(Image10));
	j2[14].setBounds(0,150,360,402);
	
	jp1.add(j2[0]);
	jp1.add(j2[1]);
	jp1.add(j2[2]);
	jp1.add(j2[3]);
	jp1.add(j2[4]);
	jp1.add(j2[5]);
	jp1.add(j2[6]);
	jp1.add(j2[7]);
	jp1.add(j2[8]);
	
	 Image12=ImageIO.read(new File("C:\\Users\\US\\Pictures\\RedStar.PNG"));
		j7[0] = new JLabel(new ImageIcon(Image12));
		j7[0].setBounds(500,100,139,139);
		j7[0].addMouseListener(this);
		
		Image13=ImageIO.read(new File("C:\\Users\\US\\Pictures\\YellowStar.PNG"));
		j7[1] = new JLabel(new ImageIcon(Image13));
		j7[1].setBounds(500,100,139,139);
		j7[1].addMouseListener(this);
		
		 Image18=ImageIO.read(new File("C:\\Users\\US\\Pictures\\GreenStar.PNG"));
			j7[6] = new JLabel(new ImageIcon(Image18));
			j7[6].setBounds(500,100,139,139);
			j7[6].addMouseListener(this);
			
			Image19=ImageIO.read(new File("C:\\Users\\US\\Pictures\\BlueStar.PNG"));
			j7[7] = new JLabel(new ImageIcon(Image19));
			j7[7].setBounds(500,100,139,139);
			j7[7].addMouseListener(this);
		
		
		jp2.add(j7[0]);
		jp3.add(j7[1]);
		jp4.add(j7[6]);
		jp5.add(j7[7]);
		
		Image14=ImageIO.read(new File("C:\\Users\\US\\Pictures\\RedTriangle.PNG"));
		j7[2] = new JLabel(new ImageIcon(Image14));
		j7[2].setBounds(770,50,139,139);
		
		Image15=ImageIO.read(new File("C:\\Users\\US\\Pictures\\BlueTriangle.PNG"));
		j7[3] = new JLabel(new ImageIcon(Image15));
		j7[3].setBounds(770,200,139,139);
		
		Image16=ImageIO.read(new File("C:\\Users\\US\\Pictures\\YellowTriangle.PNG"));
		j7[4] = new JLabel(new ImageIcon(Image16));
		j7[4].setBounds(770,350,139,139);
		
		Image17=ImageIO.read(new File("C:\\Users\\US\\Pictures\\GreenTriangle.PNG"));
		j7[5] = new JLabel(new ImageIcon(Image17));
		j7[5].setBounds(770,500,139,139);
		
		jp8.add(j7[2]);
		jp8.add(j7[3]);
		jp8.add(j7[4]);
		jp8.add(j7[5]);
	
	}
	catch(IOException io)
	{
		System.out.println("Cant find Image");
	}
	 j6=new JLabel("");
	 Font2=new Font("Algerian",Font.BOLD,50);
		j6.setFont(Font2);
	 j6.setBounds(470, 150, 200,200);
	
	 
	j5=new JLabel("ADD BLUE BALLONS IN THE BASKET");
	j5.setBounds(50,25,1000,100);
	Font1=new Font("ALGERIAN",Font.BOLD,50);
	j5.setFont(Font1);
	j5.setForeground(Color.gray);
	
		
	j4=new JLabel("Click On The Ball To Know The Color");
	j4.setBounds(60,25,1000,100);
	j4.setFont(Font1);
	j4.setForeground(Color.gray);
	
	jt4[0]=new JTextField("   Red");
	Font2=new Font("Algerian",Font.BOLD,30);
	jt4[0].setFont(Font2);
	jt4[0].setBounds(280,300,150,60);
	jt4[0].setBackground(Color.PINK);
	jt4[0].setForeground(Color.RED);
	jt4[0].addMouseListener(this);
	jt4[0].setEditable(false);
	
	jt4[1]=new JTextField(" Yellow");
	jt4[1].setFont(Font2);
	jt4[1].setBounds(480,300,130,60);
	jt4[1].setBackground(Color.PINK);
	jt4[1].setForeground(Color.YELLOW);
	jt4[1].setEditable(false);

	jt4[2]=new JTextField("  Green");
	jt4[2].setFont(Font2);
	jt4[2].setBounds(660,300,130,60);
	jt4[2].setBackground(Color.PINK);
	jt4[2].setForeground(Color.GREEN);
	jt4[2].setEditable(false);
	
	jt4[3]=new JTextField("Blue");
	jt4[3].setFont(Font2);
	jt4[3].setBounds(840,300,100,60);
	jt4[3].setBackground(Color.PINK);
	jt4[3].setEditable(false);
	jt4[3].setForeground(Color.BLUE);
	
	j9=new JLabel("What Is The Color Of Star?");
	j9.setBounds(60,25,900,100);
	j9.setFont(Font1);
	j9.setForeground(Color.gray);
	
	j8 = new JLabel("Well Done!");
	j8.setFont(Font2);
	j8.setBounds(500,400,250,100);
	j8.setVisible(false);
	
	j10=new JLabel("What Is The Color Of Star?");
	j10.setBounds(60,25,900,100);
	j10.setFont(Font1);
	j10.setForeground(Color.gray);
	
	j11= new JLabel("Well Done!");
	j11.setFont(Font2);
	j11.setBounds(500,400,250,100);
	j11.setVisible(false);
	
	jt4[4]=new JTextField("   Red");
	jt4[4].setFont(Font2);
	jt4[4].setBounds(280,300,150,60);
	jt4[4].setBackground(Color.PINK);
	jt4[4].setForeground(Color.RED);
	jt4[4].setEditable(false);
	
	jt4[5]=new JTextField(" Yellow");
	jt4[5].setFont(Font2);
	jt4[5].setBounds(480,300,130,60);
	jt4[5].setBackground(Color.PINK);
	jt4[5].setForeground(Color.YELLOW);
	jt4[5].addMouseListener(this);
	jt4[5].setEditable(false);

	jt4[6]=new JTextField("  Green");
	jt4[6].setFont(Font2);
	jt4[6].setBounds(660,300,130,60);
	jt4[6].setBackground(Color.PINK);
	jt4[6].setForeground(Color.GREEN);
	jt4[6].setEditable(false);
	
	jt4[7]=new JTextField("Blue");
	jt4[7].setFont(Font2);
	jt4[7].setBounds(840,300,100,60);
	jt4[7].setBackground(Color.PINK);
	jt4[7].setEditable(false);
	jt4[7].setForeground(Color.BLUE);
	
	jt4[8]=new JTextField("   Red");
	jt4[8].setFont(Font2);
	jt4[8].setBounds(280,300,150,60);
	jt4[8].setBackground(Color.PINK);
	jt4[8].setForeground(Color.RED);
	jt4[8].setEditable(false);
	
	jt4[9]=new JTextField(" Yellow");
	jt4[9].setFont(Font2);
	jt4[9].setBounds(480,300,130,60);
	jt4[9].setBackground(Color.PINK);
	jt4[9].setForeground(Color.YELLOW);
	jt4[9].setEditable(false);

	jt4[10]=new JTextField("  Green");
	jt4[10].setFont(Font2);
	jt4[10].setBounds(660,300,130,60);
	jt4[10].setBackground(Color.PINK);
	jt4[10].setForeground(Color.GREEN);
	jt4[10].addMouseListener(this);
	jt4[10].setEditable(false);
	
	jt4[11]=new JTextField("Blue");
	jt4[11].setFont(Font2);
	jt4[11].setBounds(840,300,100,60);
	jt4[11].setBackground(Color.PINK);
	jt4[11].setEditable(false);
	jt4[11].setForeground(Color.BLUE);
	
	jt4[12]=new JTextField("   Red");
	jt4[12].setFont(Font2);
	jt4[12].setBounds(280,300,150,60);
	jt4[12].setBackground(Color.PINK);
	jt4[12].setForeground(Color.RED);
	jt4[12].setEditable(false);
	
	jt4[13]=new JTextField(" Yellow");
	jt4[13].setFont(Font2);
	jt4[13].setBounds(480,300,130,60);
	jt4[13].setBackground(Color.PINK);
	jt4[13].setForeground(Color.YELLOW);
	jt4[13].setEditable(false);

	jt4[14]=new JTextField("  Green");
	jt4[14].setFont(Font2);
	jt4[14].setBounds(660,300,130,60);
	jt4[14].setBackground(Color.PINK);
	jt4[14].setForeground(Color.GREEN);
	jt4[14].setEditable(false);
	
	jt4[15]=new JTextField("Blue");
	jt4[15].setFont(Font2);
	jt4[15].setBounds(840,300,100,60);
	jt4[15].setBackground(Color.PINK);
	jt4[15].setEditable(false);
	jt4[15].addMouseListener(this);
	jt4[15].setForeground(Color.BLUE);
	
	j13=new JLabel("What Is The Color Of Star?");
	j13.setBounds(60,25,900,100);
	Font1=new Font("ALGERIAN",Font.BOLD,50);
	j13.setFont(Font1);
	j13.setForeground(Color.gray);
	
	j14= new JLabel("Well Done!");
	j14.setFont(Font2);
	j14.setBounds(500,400,250,100);
	j14.setVisible(false);
	
	j15=new JLabel("What Is The Color Of Star?");
	j15.setBounds(60,25,900,100);
	j15.setFont(Font1);
	j15.setForeground(Color.gray);
	
	j16= new JLabel("Well Done!");
	j16.setFont(Font2);
	j16.setBounds(500,400,250,100);
	j16.setVisible(false);
	
	j12[0]= new JLabel("This is a Red Triangle");
	j12[0].setFont(Font2);
	j12[0].setForeground(Color.RED);
	j12[0].setBounds(390,70,370,100);
	
	j12[1]= new JLabel("This is a Blue Triangle");
	j12[1].setFont(Font2);
	j12[1].setForeground(Color.BLUE);
	j12[1].setBounds(390,230,380,100);
	
	j12[2]= new JLabel("This is a Yellow Triangle");
	j12[2].setFont(Font2);
	j12[2].setForeground(Color.YELLOW);
	j12[2].setBounds(380,360,430,100);
	
	j12[3]= new JLabel("This is a Green Triangle");
	j12[3].setFont(Font2);
	j12[3].setForeground(Color.GREEN);
	j12[3].setBounds(390,520,400,100);
	
	//Frame
	jp0.add(jt0);
	jp0.add(jt1);
	jp0.add(j3[0]);
	
	
	//Ballons
	jp1.add(jb0[0]);
	jp1.add(j5);
	jp1.add(j2[9]);
	jp1.add(j3[2]);
	
	//Balls
	jp.add(j4);
	jp.add(j6);
	jp.add(j2[8]);
	jp.add(jb2);
	jp.add(j3[1]);
	
	//Triangles
	jp8.add(jb0[2]);
	jp8.add(j2[12]);
	jp8.add(j12[0]);
	jp8.add(j12[1]);
	jp8.add(j12[2]);
	jp8.add(j12[3]);
	jp8.add(j3[8]);
	
	//RedStar
	jp2.add(j2[10]);
	jp2.add(jb0[1]);
	jp2.add(jt4[0]);
	jp2.add(jt4[1]);
	jp2.add(jt4[2]);
	jp2.add(jt4[3]);
	jp2.add(j8);
	jp2.add(j9);
	jp2.add(j3[3]);
	
	//YellowStar
	jp3.add(jb1);
	jp3.add(j10);
	jp3.add(j11);
	jp3.add(jt4[4]);
	jp3.add(jt4[5]);
	jp3.add(jt4[6]);
	jp3.add(jt4[7]);
	jp3.add(j2[11]);
	jp3.add(j3[7]);
	
	//GreenStar
	jp4.add(jb0[3]);
	jp4.add(j13);
	jp4.add(j14);
	jp4.add(j2[13]);
	jp4.add(jt4[8]);
	jp4.add(jt4[9]);
	jp4.add(jt4[10]);
	jp4.add(jt4[11]);
	jp4.add(j3[9]);
	
	
	//BlueStar
	jp5.add(jb0[4]);
	jp5.add(j15);
	jp5.add(j16);
	jp5.add(j2[14]);
	jp5.add(jt4[12]);
	jp5.add(jt4[13]);
	jp5.add(jt4[14]);
	jp5.add(jt4[15]);
	jp5.add(j3[10]);
	
	
	
	
	
	c1=new CardLayout();
	cards= new JPanel(c1);
	cards.setLayout(c1);
	cards.add(jp0,"1");
	cards.add(jp,"2");
	cards.add(jp1,"3");
	cards.add(jp2,"4");
	cards.add(jp3,"5");
	cards.add(jp4,"6");
	cards.add(jp5,"7");
	cards.add(jp8,"8");
	c1.show(cards, "1");
	jf.add(cards);
	
	jf.setVisible(true);
	jf.setBounds(80,20,1150, 690);
	}

@Override
public void mouseClicked(MouseEvent e) 
{
	if(e.getSource()==jt0)
		c1.show(cards,"8");
	if(e.getSource()==jt1)
		c1.show(cards,"3");
	if(e.getSource()==jb0[0])
		c1.show(cards,"4");
	if(e.getSource()==jb0[2])
		c1.show(cards,"2");
	if(e.getSource()==j2[2])
		j2[2].setBounds(350,330,122,200);
	if((e.getSource()==jb1)||(e.getSource()==jb2))
		c1.show(cards,"1");
	if(e.getSource()==jb0[1])
		c1.show(cards,"6");
	if(e.getSource()==jb0[3])
		c1.show(cards,"7");
	if(e.getSource()==jb0[4])
		c1.show(cards,"5");
	 if(e.getSource()==j2[5])
		j2[5].setBounds(430,320,122,200);
	 if(e.getSource()==j2[6])
		j2[6].setBounds(470,320,122,200);
	 if(e.getSource()==j1[1])
	 {
		 j6.setForeground(Color.YELLOW);
		 j6.setText("Yellow");
	 }
	 if(e.getSource()==j1[2])
	 {
		 j6.setText("Blue");
	 j6.setForeground(Color.BLUE);
	 }
	 if(e.getSource()==j1[3])
	 {
		 j6.setForeground(Color.GREEN);
		 j6.setText("Green");
	 }
	 if(e.getSource()==j1[4])
	 {
		 j6.setForeground(Color.RED);
		 j6.setText("Red");
	 }
     if(e.getSource()==jt4[0])
	     j8.setVisible(true);
     if(e.getSource()==jt4[5])
	     j11.setVisible(true);
     if(e.getSource()==jt4[10])
	     j14.setVisible(true);
     if(e.getSource()==jt4[15])
	     j16.setVisible(true);
	
		
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
}

public static void main(String args[])
{
	new Quiz();
}
}

