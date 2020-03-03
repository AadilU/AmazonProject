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
					ItemLayoutUI frame = new ItemLayoutUI("", "", 0,"");
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
	public ItemLayoutUI(String name, String imgSrc, int price, String prevClass) {
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
                frame.setVisible(true);
            }
		});
		menuBar.add(btnCart);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(34, 25, 256, 203);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("");
		lblNewLabel.setIcon(new ImageIcon(ItemLayoutUI.class.getResource(imgSrc)));
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setFont(new Font("Kohinoor Devanagari", Font.BOLD, 15));
		lblItemName.setBounds(292, 25, 152, 16);
		contentPane.add(lblItemName);
		lblItemName.setText(name);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Iowan Old Style", Font.ITALIC, 10));
		lblPrice.setBounds(292, 50, 61, 16);
		contentPane.add(lblPrice);
		if(price != 0) {
			lblPrice.setText(Integer.toString(price));
		}else {
			lblPrice.setText("FREE");
		}
		
		
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
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ItemLayoutUI.class.getResource("/Images/icons8-arrow-left-64.png")));
		btnNewButton_1.setBounds(0, 0, 46, 38);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(prevClass) {
					case "pants":{
						dispose();
						PantsUI frame = new PantsUI();
		                frame.setVisible(true);
						break;
					}
					case "shirts":{
						dispose();
						ShirtUI frame = new ShirtUI();
		                frame.setVisible(true);
						break;
					}
					case "outerwear":{
						dispose();
						OuterwearUI frame = new OuterwearUI();
						frame.setVisible(true);
						break;
					}
					case "home":{
						dispose();
						MainUI frame = new MainUI();
						frame.setVisible(true);
						break;
					}
				}
			}
		});
		
		
	}
}
