package yoyhp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Week8 implements ActionListener {

	JButton addition = new JButton("Addition");
	JButton subtraction = new JButton("Subtraction");

	public static void main(String[] args) {
		Week8 w = new Week8();
		w.run();
	}

	void run() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("This is my window");
		frame.add(panel);
		panel.add(label);
		panel.add(addition);
		panel.add(subtraction);
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addition) {
			Random r = new Random();
			int num1 = r.nextInt(100);
			int num2 = r.nextInt(100);
			System.out.println(num1 + num2);
		} else {
			Random r = new Random();
			int num1 = r.nextInt(100);
			int num2 = r.nextInt(100);
			System.out.println(num1 - num2);
		}
	}
}
