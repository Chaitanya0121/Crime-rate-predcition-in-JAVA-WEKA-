/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NTCC_Final;

/**
 *
 * @author Chaitanya
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import weka.classifiers.functions.LinearRegression;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Delhi  implements ActionListener
{
	DataSource source;
	Instances dataset;
	Instance crimeRate;
	LinearRegression LR;
	
	JFrame F = new JFrame("Delhi");
	
	Label UT;
	JTextField out;
	JTextField out_rate1;
	JTextField out_rate2;
	JTextField out_rate3;	
	JButton back;
	
	double crime;
	double rate1;
	double rate2;
	double rate3;
	private Label UT_crime;
	private Label UT_rate1;
	private Label UT_rate2;
	private Label UT_rate3;
	private String text_rate1;
	private String text_rate2;
	private String text_rate3;
	
	void predict() throws Exception
	{
		source = new DataSource("D:\\States\\Delhi.arff");
		dataset = source.getDataSet();
		crimeRate = dataset.lastInstance();
		dataset.setClassIndex(dataset.numAttributes()-1);
		LR = new LinearRegression();
		LR.buildClassifier(dataset);
		crime = LR.classifyInstance(crimeRate);
		
		rate1 = (Math.abs((dataset.instance(28).value(1)-crime)/(dataset.instance(28).value(1)))*100);
		rate2 = (Math.abs((dataset.instance(29).value(1)-crime)/(dataset.instance(29).value(1)))*100);
		rate3 = (Math.abs((dataset.instance(30).value(1)-crime)/(dataset.instance(30).value(1)))*100);
	}
	
	void rate()
	{
		text_rate1 = String.format("%.2f",rate1);
		text_rate2 = String.format("%.2f",rate2);
		text_rate3 = String.format("%.2f",rate3);
	}
	
	void input()
	{
		F.setVisible(true);
		F.setLayout(null);
		F.setSize(500,500);
		
		Font Q = new Font(null, Font.BOLD,12);
		
		UT = new Label("Delhi",Label.CENTER);
		UT.setFont(Q);
		UT.setBounds(100,100,200,20);
		F.add(UT);
		
		out = new JTextField(100);
		out.setBounds(180,160,80,20);
		out.setBorder(BorderFactory.createBevelBorder(0));
		F.add(out);
		out.setText(""+(int)crime);
		
		UT_crime = new Label("Prediction: ");
		UT_crime.setBounds(110,160,130,20);
		UT_crime.setFont(Q); 
		F.add(UT_crime);
		
		UT_rate1 = new Label("% change from 2018: ");
		UT_rate1.setBounds(50,200,120,20);
		UT_rate1.setFont(Q); 
		F.add(UT_rate1);
		
		UT_rate2 = new Label("% change from 2019: ");
		UT_rate2.setBounds(50,240,120,20);
		UT_rate2.setFont(Q); 
		F.add(UT_rate2);
		
		UT_rate3 = new Label("% change from 2020: ");
		UT_rate3.setBounds(50,280,120,20);
		UT_rate3.setFont(Q); 
		F.add(UT_rate3);
		
		out_rate1 = new JTextField(100);  
		out_rate1.setBounds(180,200,80,20);
		out_rate1.setBorder(BorderFactory.createBevelBorder(0));
		F.add(out_rate1);
		out_rate1.setText(text_rate1);
		
		out_rate2 = new JTextField(100);  
		out_rate2.setBounds(180,240,80,20);
		out_rate2.setBorder(BorderFactory.createBevelBorder(0));
		F.add(out_rate2);
		out_rate2.setText(text_rate2);

		out_rate3 = new JTextField(100);  
		out_rate3.setBounds(180,280,80,20);
		out_rate3.setBorder(BorderFactory.createBevelBorder(0));
		F.add(out_rate3);
		out_rate3.setText(text_rate3);
		
		back = new JButton("Go back");
		back.setBounds(150,320,100,20);
		F.add(back);
		back.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent A)
	{
		String S = A.getActionCommand();
		if(S=="Go back")
		{
			F.dispose();
		}
	}
}






