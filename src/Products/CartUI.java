package Products;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

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
	protected LinkedList<Item> list;
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
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(44, 62, 80));
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
		btnNewButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-search-more-30.png")));
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
		contentPane.setBackground(new Color(44, 62, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Cart newCart = Cart.getInstance();
		LinkedList<Item> newLinkedList = new LinkedList<Item>();
		newLinkedList = newCart.retrieveItems();
		System.out.println(newCart.retrieveItems());
		
		List list = new List();
		list.setMultipleMode(false);
		list.setBounds(10, 23, 355, 181);
		
		List priceList = new List();
		priceList.setEnabled(false);
		int totalPrice = 0;
		
		for(int x = 0; x < newLinkedList.size(); x++) {
			list.add(newLinkedList.get(x).getName());
			priceList.add("$" + Integer.toString(newLinkedList.get(x).getPrice()));
			totalPrice += newLinkedList.get(x).getPrice();
		}
		contentPane.add(list);
		
		priceList.setBounds(371, 23, 61, 181);
		contentPane.add(priceList);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setBounds(330, 210, 102, 16);
		contentPane.add(lblTotal);
		lblTotal.setText("Total: $" + Integer.toString(totalPrice));
		
		
	}
}
