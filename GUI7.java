import java.awt.*;
import java.awt.event.*;

class MarvellousWindow extends Frame implements ActionListener 
{
	public MarvellousWindow(String str,int x ,int y)
	{
		super();
		setTitle(str);
		setSize(x,y);
		addwindowListner(this);
		setVisible(true);
	}

	public void windowDeactivated(WindowEvent obj)
	{

	}
	public void windowActivated(WindowEvent obj)
	{

	}
	public void windowDeiconified(WindowEvent obj)
	{

	}
	public void windowIconified(WindowEvent obj)
	{

	}

	public void windowClosed(WindowEvent obj)
{
	//System.out.println("Window Closed");
}
public void windowIClossing(WindowEvent obj)
{
	System.exit(0);
}
public void windowOpened(WindowEvent obj)
{

}
}
class GUI7
{
	public static void main(String[] args)
    {
		 MarvellousWindow mobj1 = new MarvellousWindow("First",400,400);
	}
}