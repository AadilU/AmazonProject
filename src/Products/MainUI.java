package Products;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JTextField txtSearch;
	private JMenu mnNewMenu;
	private JMenuItem mntmHome;
	private JMenuItem mntmItem2;
	private JPanel categoryExplorerPanel;
	private JLabel lblImage;
	private JButton forwardButton;

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
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(47, 79, 79));
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-menu-rounded-30.png")));
		menuBar.add(mnNewMenu);
		
		mntmHome = new JMenuItem("Home");
		mnNewMenu.add(mntmHome);
		mntmHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                MainUI frame = new MainUI();
                frame.setVisible(true);;
            }
		});
		
		mntmItem2 = new JMenuItem("Item 2");
		mnNewMenu.add(mntmItem2);
		
		txtSearch = new JTextField();
		txtSearch.setText("Search");
		menuBar.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-search-more-30.png")));
		menuBar.add(btnNewButton);
		
		JButton btnCart = new JButton("Cart");
		btnCart.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-shopping-cart-32.png")));
		btnCart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                Cart frame = new Cart();
                frame.setVisible(true);;
            }
		});
		menuBar.add(btnCart);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		forwardButton = new JButton("");
		forwardButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-arrow-right-64.png")));
		forwardButton.setBounds(372, 5, 73, 107);
		contentPane.add(forwardButton);
		
		JButton backButton = new JButton("");
		backButton.setBackground(Color.WHITE);
		backButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-arrow-left-64.png")));
		backButton.setBounds(5, 5, 73, 107);
		contentPane.add(backButton);
		
		categoryExplorerPanel = new JPanel();
		categoryExplorerPanel.setBounds(5, 5, 440, 107);
		contentPane.add(categoryExplorerPanel);
		
		lblImage = new JLabel("Image");
		categoryExplorerPanel.add(lblImage);
		
		JLabel lblNewLabel = new JLabel("Ad");
		lblNewLabel.setBounds(6, 112, 142, 123);
		contentPane.add(lblNewLabel);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setBounds(159, 112, 142, 123);
		contentPane.add(lblAd);
		
		JLabel lblItem = new JLabel("Ad");
		lblItem.setHorizontalAlignment(SwingConstants.CENTER);
		lblItem.setBounds(303, 112, 142, 123);
		contentPane.add(lblItem);
	}
}
