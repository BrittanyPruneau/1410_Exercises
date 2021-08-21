package guiWindowBuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MyFirstButon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstButon frame = new MyFirstButon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFirstButon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = newBtnMyFirstButton();
		contentPane.add(btnNewButton, BorderLayout.CENTER);
	}

	private JButton newBtnMyFirstButton() {
		final JButton btnNewButton = new JButton("My First Button");
		btnNewButton.setFont(new Font("Nirmala UI", Font.BOLD, 38));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(btnNewButton.getBackground().equals(Color.GREEN))
					btnNewButton.setBackground(Color.YELLOW);
				else
				btnNewButton.setBackground(Color.GREEN);
			}
		});
		return btnNewButton;
	}

}
