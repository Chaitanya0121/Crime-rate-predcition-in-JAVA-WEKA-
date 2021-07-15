package Trial4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Base implements ActionListener   
{
	JButton AN;
	JButton CN;
	JButton DN;
	JButton DD;
	JButton DL;
	JButton JK;
	JButton LK;
	JButton PD;
	JLabel out;
	
	JFrame F = new JFrame();
			
	String S;
	
	void trial()
	{
		AN = new JButton("Andaman and Nicobar");
		AN.setBorder(BorderFactory.createBevelBorder(0));
		F.add(AN);
		AN.addActionListener(this);
		
		CN = new JButton("Chandigarh");
		CN.setBorder(BorderFactory.createBevelBorder(0));
		F.add(CN);
		CN.addActionListener(this);
		
		DN = new JButton("Dadar and Nagar");
		DN.setBorder(BorderFactory.createBevelBorder(0));
		F.add(DN);
		DN.addActionListener(this);
		
		DD = new JButton("Daman and Diu");
		DD.setBorder(BorderFactory.createBevelBorder(0));
		F.add(DD);
		DD.addActionListener(this);
		
		DL = new JButton("Delhi");
		DL.setBorder(BorderFactory.createBevelBorder(0));
		F.add(DL);
		DL.addActionListener(this);
		
		JK = new JButton("Jammu and Kashmir");
		JK.setBorder(BorderFactory.createBevelBorder(0));
		F.add(JK);
		JK.addActionListener(this);
		
		LK = new JButton("Lakshwadeep");
		LK.setBorder(BorderFactory.createBevelBorder(0));
		F.add(LK);
		LK.addActionListener(this);
		
		PD = new JButton("Puducherry");
		PD.setBorder(BorderFactory.createBevelBorder(0));
		F.add(PD);
		PD.addActionListener(this);
	}
	
	void lyout()
	{
		GridLayout G = new GridLayout(4,2);
		G.setHgap(20);
		G.setVgap(20);
		F.setVisible(true);
		F.setLayout(G);
		F.setBackground(Color.BLACK);
		F.setSize(500,500);
	}

	public void actionPerformed(ActionEvent e) 
	{
		S = e.getActionCommand();
		if(S.equals("Andaman and Nicobar"))
		{
			try
			{
				Andaman ADN = new Andaman();
				ADN.predict();
				ADN.rate();
				ADN.input();
			}
			catch(Exception E)
			{
				System.out.println(e);
			}
			
		}
		else if(S.equals("Chandigarh"))
		{
			try
			{
				Chandigarh CHN = new Chandigarh();
				CHN.predict();
				CHN.rate();
				CHN.input();
			}
			catch(Exception E)
			{
				System.out.println("Exception occured");
			}
			
		}
		else if(S.equals("Dadar and Nagar"))
		{
			try
			{
				Dadar DAN = new Dadar();
				DAN.predict();
				DAN.rate();
				DAN.input();
			}
			catch(Exception E)
			{
				System.out.println("Exception occured");
			}
		}
		else if(S.equals("Daman and Diu"))
		{
			try
			{
				Daman DAD = new Daman();
				DAD.predict();
				DAD.rate();
				DAD.input();
			}
			catch(Exception E)
			{
				System.out.println("Exception occured");
			}
		}
		else if(S.equals("Delhi"))
		{
			try
			{
				Delhi DLH = new Delhi();
				DLH.predict();
				DLH.rate();
				DLH.input();
			}
			catch(Exception E)
			{
				System.out.println("Exception occured");
			}
		}
		else if(S.equals("Jammu and Kashmir"))
		{
			try
			{
				Jammu JAK = new Jammu();
				JAK.predict();
				JAK.rate();
				JAK.input();
			}
			catch(Exception E)
			{
				System.out.println("Exception occured");
			}
		}
		else if(S.equals("Lakshwadeep"))
		{
			try
			{
				Lakshwadeep LKS = new Lakshwadeep();
				LKS.predict();
				LKS.rate();
				LKS.input();
			}
			catch(Exception E)
			{
				System.out.println("Exception occured");
			}
		}
		else if(S.equals("Puducherry"))
		{
			try
			{
				Puducherry PDC = new Puducherry();
				PDC.predict();
				PDC.rate();
				PDC.input();
			}
			catch(Exception E)
			{
				System.out.println("Exception occured");
			}
		}
	}
	
}
	
	

