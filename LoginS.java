// Introduction to GUI(Graphical User Interface)
// API(Application Programming Interface)
// Using awt(abstract windowing toolkit).
// Using swing.

// You can directly make object of JFrame class.
/*import javax.swing.*;
class LoginS{
	public static void(String [] args){
		JFrame j1 = new JFrame("Welcome");
		j1.setVisible(true);
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j1.setSize(700,700);
	}
}
*/

// By making LoginS class as child class of JFrame.
// code of a basic login screen using swing and awt package.
import javax.swing.*;
import java.awt.event.*;
class LoginS extends JFrame{
	
JLabel l1,l2,l3,l4;
JTextField t1;
JButton b1,b2, b3;
JPasswordField t2;

LoginS(String s1){
	super(s1);
}
LoginS(){
	
}
void setComponents(){
	l1 = new JLabel("Welcome to Login Screen");
	l2 = new JLabel("USERNAME");
	l3 = new JLabel("PASSWORD");
	l4 = new JLabel();
	t1 = new JTextField();
	t2 = new JPasswordField();
	b1 = new JButton("Login");
	b2 = new JButton("Clear");
	b3 = new JButton("Add");
	setLayout(null);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	add(b3);
	l1.setBounds(250,50,300,30);
	l2.setBounds(100,200,110,30);
	l3.setBounds(100,350,110,30);
	l4.setBounds(250,550,400,30);
	t1.setBounds(250,200,100,30);
	t2.setBounds(250,350,100,30);
	b1.setBounds(200,450,100,30);
	b2.setBounds(350,450,100,30);
	b3.setBounds(450,550,100,30);
	b1.addActionListener(new Log());
	b2.addActionListener(new Clear());
	b3.addActionListener(new Add());
	
}
public static void main(String [] args){
	LoginS j1 = new LoginS("Login Screen");
	j1.setVisible(true);
	j1.setComponents();
	j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j1.setSize(700,700);
}

class Log implements ActionListener{
	public void actionPerformed(ActionEvent e1){
		String s1=t1.getText();
		String s2=t2.getText();
		if(s1.equals("coading") && s2.equals("1234")){
			l4.setText("Login Successful...");
		}
		else{
			l4.setText("Login Unsuccessful...");
		}
	}
}

class Clear implements ActionListener{
	public void actionPerformed(ActionEvent e1){
		t1.setText("");
		t2.setText("");
	}
}

class Add implements ActionListener{
	public void actionPerformed(ActionEvent e1){
		try{
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c = a+b;
			l4.setText("Addition is:- " + c);
		}catch(Exception e2){
			l4.setText("Plese Enter numbers only");
		}		
	}
}
}