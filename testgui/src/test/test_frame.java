package test;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.xml.transform.OutputKeys;

public  class test_frame {
	public static class showFlowlayout extends JFrame{
		public showFlowlayout(){
			//setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
			/*setLayout(new GridLayout(3, 3,5,5) );
			add(new JLabel("first name"));
			add(new JTextField(8));
			add(new JLabel("MI"));
			add(new JTextField(8));
			add(new JLabel("last name"));
			add(new JTextField(8));*/
			setLayout(new BorderLayout(5,10));
			
			//add(new JButton("east"),BorderLayout.EAST);
			//add(new JButton("south"),BorderLayout.SOUTH);
			add(new JTextField(2),BorderLayout.WEST);
			add(new JButton("north"),BorderLayout.NORTH);
			add(new JButton("east"),BorderLayout.CENTER);
			add(new JButton("center"),BorderLayout.CENTER);
			
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     showFlowlayout  frame=new showFlowlayout();//build
     frame.setTitle("showFlowlayout");
     //frame.remove(jbok);     
     frame.setSize(400, 300);
     frame.setLocationRelativeTo(null);//location
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stop
     frame.setVisible(true);//让人看见，不然不显示。		
	}
	
		
		
		
		
	}


