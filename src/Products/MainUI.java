package Products;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Button;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JMenu mnNewMenu;
	private JMenuItem mntmItem1;
	private JMenuItem mntmItem2;
	private JPanel categoryExplorerPanel;
	private JLabel lblImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
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
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-menu-rounded-30.png")));
		menuBar.add(mnNewMenu);
		
		mntmItem1 = new JMenuItem("Item 1");
		mnNewMenu.add(mntmItem1);
		
		mntmItem2 = new JMenuItem("Item 2");
		mnNewMenu.add(mntmItem2);
		
		textField = new JTextField();
		menuBar.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-search-more-24.png")));
		menuBar.add(btnNewButton);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		categoryExplorerPanel = new JPanel();
		categoryExplorerPanel.setBounds(5, 5, 440, 107);
		contentPane.add(categoryExplorerPanel);
		
		lblImage = new JLabel("Image");
		categoryExplorerPanel.add(lblImage);
		
		JLabel lblNewLabel = new JLabel("Ad");
		lblNewLabel.setBounds(6, 112, 142, 123);
		contentPane.add(lblNewLabel);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setBounds(146, 112, 142, 123);
		contentPane.add(lblAd);
		
		JLabel lblItem = new JLabel("Ad");
		lblItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblItem.setBounds(303, 112, 142, 123);
		contentPane.add(lblItem);
	}
}
