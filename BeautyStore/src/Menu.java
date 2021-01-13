import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 846, 698);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\face-icon.png"));
		lblNewLabel.setBounds(315, 0, 201, 217);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Beauty Store");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 46));
		lblNewLabel_1.setBounds(281, 174, 282, 58);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(67, 260, 697, 364);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_Makeup = new JButton("");
		btnNewButton_Makeup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MakeupGui mg = new MakeupGui();
				mg.setVisible(true);
				}
		});
		btnNewButton_Makeup.setBackground(new Color(255, 228, 225));
		btnNewButton_Makeup.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\1024529.png"));
		btnNewButton_Makeup.setBounds(58, 25, 151, 145);
		panel.add(btnNewButton_Makeup);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBackground(new Color(255, 228, 225));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\80945-200.png"));
		btnNewButton_1.setBounds(266, 25, 151, 145);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 228, 225));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\755525-200.png"));
		btnNewButton_2.setBounds(473, 25, 151, 145);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 228, 225));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\1335654-200.png"));
		btnNewButton_3.setBounds(376, 181, 151, 154);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 228, 225));
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\jewelry (1).png"));
		btnNewButton_4.setBounds(164, 181, 151, 154);
		panel.add(btnNewButton_4);
	}
}
