import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class MakeupGui extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeupGui frame = new MakeupGui();
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
	public MakeupGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1360, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 397, 179);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Makeup");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 40));
		lblNewLabel.setBounds(188, 51, 222, 85);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\1024529.png"));
		lblNewLabel_1.setBounds(10, 11, 168, 157);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(417, 11, 917, 492);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 897, 470);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		table.setBorder(new LineBorder(new Color(128, 0, 0), 2, true));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Type of Makeup", "Brand", "How to Use", "Where to buy"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(169);
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.getColumnModel().getColumn(2).setPreferredWidth(217);
		table.getColumnModel().getColumn(3).setPreferredWidth(158);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(10, 201, 397, 301);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Type of Makeup :");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setBounds(10, 11, 151, 56);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Brand :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(10, 80, 151, 56);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("How to Use :");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(10, 147, 151, 56);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Where to Buy :");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(10, 214, 151, 56);
		panel_2.add(lblNewLabel_2_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(171, 23, 201, 30);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(171, 96, 201, 30);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(171, 230, 201, 30);
		panel_2.add(comboBox_1_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(255, 255, 255));
		textPane.setBounds(171, 164, 201, 30);
		panel_2.add(textPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(10, 513, 1324, 137);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnNewButton.setBounds(50, 36, 142, 67);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnReset.setBounds(215, 36, 142, 67);
		panel_3.add(btnReset);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnUpdate.setBounds(378, 36, 166, 67);
		panel_3.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnDelete.setBounds(568, 36, 166, 67);
		panel_3.add(btnDelete);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnSearch.setBounds(760, 36, 166, 67);
		panel_3.add(btnSearch);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnDisplay.setBounds(949, 36, 180, 67);
		panel_3.add(btnDisplay);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnExit.setBounds(1152, 36, 142, 67);
		panel_3.add(btnExit);
	}
}
