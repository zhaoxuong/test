package test;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class testpanels extends JFrame{
    public testpanels(){
    	JPanel p1=new JPanel();//Jpanel是container的子类
    	p1.setLayout(new GridLayout(4, 3));
    	
    	for(int i=1;i<=9;i++){
    		p1.add(new JButton(""+i));
    	}
    	p1.add(new JButton(""+0));
    	p1.add(new JButton("start"));
    	p1.add(new JButton("stop"));
    	
    	JPanel p2=new JPanel(new BorderLayout());
    	p2.add(new JTextField("time to be dis"),BorderLayout.NORTH);
    	p2.add(p1, BorderLayout.CENTER);
    	
    	add(p2,BorderLayout.EAST);//添加到框架中
    	add(new JButton("food"),BorderLayout.CENTER);
    	
    	
    	
    	
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testpanels frame=new testpanels();
		frame.setTitle("the food");
		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
