package Products;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;

public class ItemLayoutUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemLayoutUI frame = new ItemLayoutUI();
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
	public ItemLayoutUI() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(47, 79, 79));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(Cart.class.getResource("/Images/icons8-menu-rounded-30.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmHome;
		mntmHome = new JMenuItem("Home");
		mntmHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                MainUI frame = new MainUI();
                frame.setVisible(true);;
            }
		});
		mnNewMenu.add(mntmHome);
		
		
		JMenuItem mntmShirts = new JMenuItem("Shirts");
		mnNewMenu.add(mntmShirts);
		
		JMenuItem mntmPants = new JMenuItem("Pants");
		mnNewMenu.add(mntmPants);
		
		JMenuItem mntmOuterwear = new JMenuItem("Outerwear");
		mnNewMenu.add(mntmOuterwear);
		
		
		
		JTextField txtSearch = new JTextField();
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
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(24, 24, 256, 203);
		contentPane.add(lblNewLabel);
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setFont(new Font("Kohinoor Devanagari", Font.BOLD, 15));
		lblItemName.setBounds(292, 25, 152, 16);
		contentPane.add(lblItemName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Iowan Old Style", Font.ITALIC, 10));
		lblPrice.setBounds(292, 50, 61, 16);
		contentPane.add(lblPrice);
		
		JButton btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnAddToCart.setIcon(new ImageIcon(ItemLayoutUI.class.getResource("/Images/icons8-buy-26.png")));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddToCart.setForeground(Color.BLACK);
		btnAddToCart.setBackground(Color.WHITE);
		btnAddToCart.setBounds(302, 78, 127, 38);
		contentPane.add(btnAddToCart);
	}
}
