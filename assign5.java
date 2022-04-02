
// Java Program to Find the Largest Among Three Numbers

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class assign5 extends Applet implements ActionListener
{
	TextField t1,t2,t3,t4;
	Button b1,b2;
	int n1,n2,n3;
	public void init()
	{
		t1=new TextField(5); t2=new TextField(5); t3=new TextField(5); t4=new TextField(5); 
		b1=new Button("Largest"); b2=new Button("Smallest");
		add(t1); add(t2); add(t3); add(b1); add(b2); add(t4);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae)
		{
			n1=Integer.parseInt(t1.getText());
			n2=Integer.parseInt(t2.getText());
			n3=Integer.parseInt(t3.getText());
			
			if(ae.getSource()==b1)
			{
				if(n1>n2&&n1>n3)
				t4.setText(Integer.toString(n1));
				else if(n2>n1&&n2>n3)
				t4.setText(Integer.toString(n2));
				else
				t4.setText(Integer.toString(n3));
			}
			else
			{
				if(n1<n2&&n1<n3)
				t4.setText(Integer.toString(n1));
				else if(n2<n1&&n2<n3)
				t4.setText(Integer.toString(n2));
				else
				t4.setText(Integer.toString(n3));
			}
		}		
}