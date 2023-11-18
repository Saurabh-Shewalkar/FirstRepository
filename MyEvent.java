import java.awt.*;
import java.awt.event.*;

public class MyEvent extends Frame
{

//TextField l = new TextField();
MyEvent()
{

//l.setBounds(150,200,220,300);

Button b = new Button("Click Here");
b.setBounds(100,120,130,140);


//b.addActionListener(this);

//add(l);
add(b,BorderLayout.WEST);

setSize(500,500);
setVisible(true);
//setLayout(new BorderLayout());

}
/*public void actionPerformed(ActionEvent e)
{
	l.setText("Button is clicked");
}*/

public static void main(String args[])
{
	new MyEvent();

}


}