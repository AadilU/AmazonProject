package View;

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

import Control.Cart;
import Control.SearchQuery;

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
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(44, 62, 80));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setIcon(new ImageIcon(CartUI.class.getResource("/Images/icons8-menu-rounded-30.png")));
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
		txtSearch.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtSearch.setOpaque(true);
		txtSearch.setText("Search");
		menuBar.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				SearchQuery newQuery = new SearchQuery(txtSearch.getText());
				
            }
		});
		btnNewButton.setIcon(new ImageIcon(ItemLayoutUI.class.getResource("/Images/icons8-search-32.png")));
		menuBar.add(btnNewButton);
		
		JButton btnCart = new JButton("Cart");
		btnCart.setOpaque(true);
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
		contentPane.setBackground(new Color(34, 47, 62));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setBounds(34, 25, 256, 203);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("");
		lblNewLabel.setIcon(new ImageIcon(ItemLayoutUI.class.getResource(imgSrc)));
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setForeground(Color.WHITE);
		lblItemName.setFont(new Font("Kohinoor Devanagari", Font.BOLD, 15));
		lblItemName.setBounds(292, 25, 152, 16);
		contentPane.add(lblItemName);
		lblItemName.setText(name);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.LIGHT_GRAY);
		lblPrice.setFont(new Font("Iowan Old Style", Font.ITALIC, 10));
		lblPrice.setBounds(292, 50, 61, 16);
		contentPane.add(lblPrice);
		if(price != 0) {
			lblPrice.setText("$ " + Integer.toString(price));
		}else {
			lblPrice.setText("FREE");
		}
		
		
		JButton btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnAddToCart.setIcon(new ImageIcon(ItemLayoutUI.class.getResource("/Images/icons8-buy-26.png")));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cart newCartItem = Cart.getInstance();
				newCartItem.addItem(name, price);
				
				btnAddToCart.setIcon(null);
				btnAddToCart.setText("Added!");
			}
		});
		btnAddToCart.setForeground(Color.BLACK);
		btnAddToCart.setBackground(Color.WHITE);
		btnAddToCart.setBounds(290, 78, 139, 43);
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
