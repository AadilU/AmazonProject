package Products;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class CartUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JMenuItem mntmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartUI frame = new CartUI();
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
	public CartUI() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(47, 79, 79));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(CartUI.class.getResource("/Images/icons8-menu-rounded-30.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmItem1;
		mntmHome = new JMenuItem("Home");
		mntmHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                MainUI frame = new MainUI();
                frame.setVisible(true);
                dispose();
            }
		});
		mnNewMenu.add(mntmHome);
		
		JMenuItem mntmShirts = new JMenuItem("Shirts");
		mnNewMenu.add(mntmShirts);
		mntmShirts.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                ShirtUI frame = new ShirtUI();
                frame.setVisible(true);
                dispose();
            }
		});
		
		JMenuItem mntmPants = new JMenuItem("Pants");
		mnNewMenu.add(mntmPants);
		mntmPants.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                PantsUI frame = new PantsUI();
                frame.setVisible(true);
                dispose();
            }
		});
		
		JMenuItem mntmOuterwear = new JMenuItem("Outerwear");
		mnNewMenu.add(mntmOuterwear);
		mntmOuterwear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                OuterwearUI frame = new OuterwearUI();
                frame.setVisible(true);
                dispose();
            }
		});
		
		
		
		txtSearch = new JTextField();
		txtSearch.setText("Search");
		menuBar.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				SearchQuery newQuery = new SearchQuery(txtSearch.getText());
				
            }
		});
		btnNewButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-search-more-30.png")));
		menuBar.add(btnNewButton);
		
		JButton btnCart = new JButton("Cart");
		btnCart.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-shopping-cart-32.png")));
		btnCart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                CartUI frame = new CartUI();
                frame.setVisible(true);
                dispose();
            }
		});
		menuBar.add(btnCart);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(6, 26, 412, 201);
		contentPane.add(textPane);
		
		
		
	}
}
