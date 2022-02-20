import java.awt.*;
import java.awt.event.*;
import javax.swing.*;             

class MarvellousWindow  extends Frame implements ActionListener 

{
	TextField t1;

Button b1;
Button b2;
Button b3;
Button b4;
Button b5;
Button b6;
Button b7;
Button b8;
Button b9;
Button b10;
Button b11;
Button b12;
Button b13;
Button b14;
Button b15;
Button b16;

	

	public MarvellousWindow(String str,int x ,int y)
	{
		super();
		setTitle(str);
		setSize(x,y);
		 
b1 = new Button("1");
b2 = new Button("2");
b3 = new Button("3");
b4 = new Button("4");
b5 = new Button("5");
b6 = new Button("6");
b7 = new Button("7");
b8 = new Button("8");
b9 = new Button("9");
b10 = new Button("."); 
b11 = new Button("0");
b12 = new Button("=");
b13 = new Button("/");
b14 = new Button("*");
b15 = new Button("-");
b16 = new Button("+");


	t1 = new TextField();
	t1.setBounds(40,40,300,60);

	JLabel l1 = new JLabel("sd");

b1.setBounds(70,100,40,40);
b2.setBounds(140,100,40,40);
b3.setBounds(210,100,40,40);
b4.setBounds(70,180,40,40);
b5.setBounds(140,180,40,40);
b6.setBounds(210,180,40,40);
b7.setBounds(70,260,40,40);
b8.setBounds(140,260,40,40);
b9.setBounds(210,260,40,40);
b10.setBounds(70,340,40,40);
b11.setBounds(140,340,40,40);
b12.setBounds(210,340,40,40);
b13.setBounds(280,100,40,40);
b14.setBounds(280,180,40,40);
b15.setBounds(280,260,40,40);
b16.setBounds(280,340,40,40);

		add(t1);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(b11);
add(b12);
add(b13);
add(b14);
add(b15);
add(b16);
add(l1);


 

		b1.addActionListener(this);
		//b2.addActionListener(this);
		setLayout(null);
		setVisible(true);

 		setVisible(true);
}
		public void actionPerformed(ActionEvent obj)
		{
			t1.setText("Welcome Boss");
		}
	}

 

class GUI6
{
	public static void main(String[] args)
    {
		 MarvellousWindow mobj1 = new MarvellousWindow("Calculator",400,480);
 
	}
}