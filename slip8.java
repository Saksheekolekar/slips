package slips;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class slip8  extends Frame implements MouseListener,MouseMotionListener
{   TextField t1;
public slip8() 
{ 
	setVisible(true);
   setSize(300,400);
   setLayout(new FlowLayout());
	t1=new TextField(50);
	add(t1);
	addMouseListener(this);
	addMouseMotionListener(this);
}
	public static void main(String[] args)
	{
		new slip8();
	}
	public void mouseDragged(MouseEvent arg0)
	{
	}
	public void mouseMoved(MouseEvent me)
	{
		  int x=me.getX();
		  int y=me.getY();
		  t1.setText("x-coordinate="+x+"\t y-coordinate="+y);
		
	}
	public void mouseClicked(MouseEvent m)
	{
		  int x=m.getX();
		  int y=m.getY();
		  t1.setText("x-coordinate="+x+"\t y-coordinate="+y);
	}
	public void mouseEntered(MouseEvent arg0)
	{
	}
    public void mouseExited(MouseEvent arg0) 
    {
	}
	public void mousePressed(MouseEvent arg0)
	{		
	}
	public void mouseReleased(MouseEvent arg0) 
	{
	}

}
