package slips;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
class el extends Exception
{
@Override
public String toString() 
{
	
	return "your chances are over";
}	
}
public class slip4b extends Frame implements ActionListener
{
	int c=0;
Label l1,l2;
TextField t1,t2;
Button b1,b2;
public slip4b()
{
setVisible(true);
setSize(300,300);
setLayout(new FlowLayout());
l1=new Label("enter user name=");
l2=new Label("enter password=");
t1=new TextField(10);
t2=new TextField(10);
b1=new Button("login");
b2=new Button("clear");
add(l1);add(t1);
add(l2);add(t2);
add(b1);add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{  
	try
{  
	
	if (ae.getSource()==b1)
	{
		c++;
		if(t1.getText().equals(t2.getText()))
		JOptionPane.showMessageDialog(this,"login success...");
	     if(c==3)
			throw new el();
	}
	if (ae.getSource()==b2)
	{
		t1.setText("");
		t2.setText("");
	}
}
catch(Exception e)
{	
	JOptionPane.showMessageDialog(this,"."+e);
	
}
	
	}
public static void main(String[] args) 
{
new slip4b();	
}
}
