package Products;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import java.awt.List;

public class OuterwearUI extends JFrame implements ItemListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	Outerwear p;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OuterwearUI frame = new OuterwearUI();
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
	public OuterwearUI() {
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
		txtSearch.setOpaque(true);
		txtSearch.setBorder(new EmptyBorder(0, 0, 0, 0));
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
		
		List list = new List();
		list.setMultipleMode(false);
		list.setBounds(10, 23, 239, 185);
		list.add("Adidas");
		list.add("Kirklands");
		list.add("Guess");
		list.add("Goodwill Outerwear");
		
		list.addItemListener(this);
		contentPane.add(list);
		
		runProgram();
	}

	private void runProgram() {
		Outerwear newOuterwear = new Outerwear();
		
	}
	public void itemStateChanged(ItemEvent e) {      
        List l = (List)e.getSource();
        switch(l.getSelectedItem())
        {
	        case "Adidas":
	        {
	        	getOuterwear(0);
	        	break;
	        	
	        }
	        case "Kirklands":
	        {
	        	getOuterwear(1);
	        	break;
	        }
	        case "Guess":
	        {
	        	getOuterwear(2);
	        	break;
	        }
	        case "Goodwill Outerwear":{
	        	getOuterwear(3);
	        	break;
	        }
        }
     }  
	private void getOuterwear(int x) {
		p = new Outerwear();
		dispose();
		ItemLayoutUI frame = new ItemLayoutUI(p.OuterwearList.get(x).getName(), p.OuterwearList.get(x).getImageName(), p.OuterwearList.get(x).getPrice(),"outerwear");
	    frame.setVisible(true);
	}
}
