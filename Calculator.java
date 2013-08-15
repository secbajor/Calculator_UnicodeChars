




import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JFrame implements ActionListener{
	
	
	public void actionPerformed(ActionEvent event){
		Object source=event.getSource();
		if(source==Quit)
		{
			System.exit(0);
		}
		else if (source==Plus)
		{
		ans.setText("");
		String s = num1.getText();
		String t = num2.getText();
		Float n2 = Float.parseFloat(t);
		Float n1 = Float.parseFloat(s);
		ans.setText(ans.getText()+(n1+n2));
		}
		if(source==Minus)
		{
			String s = num1.getText();
			String t = num2.getText();
			Float n2 = Float.parseFloat(t);
			Float n1 = Float.parseFloat(s);
			ans.setText(ans.getText()+(n1-n2));	
		}
		if(source==Multiply)
		{
			String s = num1.getText();
			String t = num2.getText();
			Float n2 = Float.parseFloat(t);
			Float n1 = Float.parseFloat(s);
			ans.setText(ans.getText()+(n1*n2));	
		}
		if(source==Divide)
		{
			String s = num1.getText();
			String t = num2.getText();
			Float n2 = Float.parseFloat(t);
			Float n1 = Float.parseFloat(s);
			ans.setText(ans.getText()+(n1/n2));	
		}
		if(source==clear)
		{
			num1.setText("");
			num2.setText("");
			ans.setText("");
		}
		if(source==square)
		{
			String s = num1.getText();
			String t = num2.getText();
			Float n2 = Float.parseFloat(t);
			Float n1 = Float.parseFloat(s);
			ans.setText(ans.getText()+Math.pow(n1, n2));	
		}
		if(source==root)
		{
			String s = num1.getText();
			Float n1 = Float.parseFloat(s);
			ans.setText(ans.getText()+Math.sqrt(n1));
		}
		if(source==pi)
		{
			num2.setText("");
			num2.setText("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"  
  +"8214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196"  
  +"4428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273"  
  +"724587006606315588174881520920962829254091715364367892590360011330530548820466521384146951941511609");
		}
	}
	
	JPanel pane =new JPanel();
	JLabel operations=new JLabel("------------------------------=Operations=------------------------------"); 
	JLabel snum1=new JLabel("Enter Number 1");
	JLabel snum2=new JLabel("Enter Number 2");
	JLabel sans=new JLabel("Answer");
	JButton Quit=new JButton("Exit");
	JButton Plus=new JButton("+");
	JButton clear=new JButton("Clear");
	JButton Minus=new JButton("-");
	JButton Multiply=new JButton("*");
	JButton Divide=new JButton("/");
	JButton root=new JButton("\u221a");
	JButton square=new JButton("^");
	JButton pi=new JButton("\u03A0");
	JTextField num1=new JTextField(20);
	JTextField ans=new JTextField(20);
	JTextField num2=new JTextField(20);

	
	Calculator()
	{
		super("Calculator");
		setBounds(300, 300, 370, 160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=this.getContentPane();
		con.add(pane);
		pane.add(operations);
		pane.add(Plus);
		pane.add(Minus);
		pane.add(Multiply);
		pane.add(Divide);
		pane.add(pi);
		pane.add(square);
		pane.add(root);
		pane.add(snum1);
		pane.add(num1);
		pane.add(snum2);
		pane.add(num2);
		pane.add(sans);
		pane.add(ans);
		pane.add(Quit);
		pane.add(clear);


		setVisible(true);
		
		Quit.addActionListener(this);
		Plus.addActionListener(this);
		Minus.addActionListener(this);
		Multiply.addActionListener(this);
		root.addActionListener(this);
		Divide.addActionListener(this);
		clear.addActionListener(this);
		square.addActionListener(this);
		pi.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}
