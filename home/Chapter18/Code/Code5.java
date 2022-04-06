import java.awt.FlowLayout;
import javax.swing.*;
public class Code5{
	public static void main(String[] args){
		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hello World!!");
		JButton button = new JButton("押してね");
		JLabel label2 = new JLabel("Hello World!!");
		JButton button2 = new JButton("押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
