import java.awt.*;

class MarvellousWindow extends Frame
{
	public MarvellousWindow(String str,int x ,int y)
	{
		super();
		setTitle(str);
		setSize(x,y);
		setVisible(true);
	}
}

class GUI4
{
	public static void main(String[] args)
    {
		 MarvellousWindow mobj1 = new MarvellousWindow("First",400,400);
         MarvellousWindow mobj2 = new MarvellousWindow("Second",200,200);
 
	}
}