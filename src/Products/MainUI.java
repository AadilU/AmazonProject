package Products;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.MenuBar;
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
import javax.swing.UIManager;
import javax.swing.*;

public class MainUI extends JFrame{

	private Timer t;
	private JPanel contentPane;
	private JTextField txtSearch;
	private JMenu mnNewMenu;
	private JMenuItem mntmHome;
	private JMenuItem mntmShirts;
	private JPanel categoryExplorerPanel;
	private JButton lblImage;
	private JButton forwardButton;
	private JMenuItem mntmPants;
	private JMenuItem mntmOuterwear;
	private int itemNumber;
	int[] x = {1};
	String[] iList = { 
			"/Images/ckshirt.png",
			"/Images/didasjacket.png",
			"/Images/didaspants.png",
			"/Images/goodwilljacket.png",
			"/Images/guessjacxket.png",
			"/Images/GWPants.png",
			"/Images/gwshirts.png",
			"/Images/kirk jacket.png",
			"/Images/kirkpant.png",
			"/Images/levipants.png",
			"/Images/suuwoopreme.png"
	};

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
		try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (UnsupportedLookAndFeelException ex) {
        }
		UIManager.put("MenuBar.background", Color.DARK_GRAY);
		setBackground(Color.decode("#2c3e50"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setBackground(new Color(44, 62, 80));
		
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("");
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-menu-rounded-30.png")));
		menuBar.add(mnNewMenu);
		
		mntmHome = new JMenuItem("Home");
		mnNewMenu.add(mntmHome);
		mntmHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainUI frame = new MainUI();
                frame.setVisible(true);
            }
		});
		
		mntmShirts = new JMenuItem("Shirts");
		mnNewMenu.add(mntmShirts);
		mntmShirts.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                dispose();
				ShirtUI frame = new ShirtUI();
                frame.setVisible(true);
                
            }
		});
		
		mntmPants = new JMenuItem("Pants");
		mnNewMenu.add(mntmPants);
		mntmPants.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				PantsUI frame = new PantsUI();
                frame.setVisible(true);
            }
		});
		
		mntmOuterwear = new JMenuItem("Outerwear");
		mnNewMenu.add(mntmOuterwear);
		mntmOuterwear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				OuterwearUI frame = new OuterwearUI();
                frame.setVisible(true);;
            }
		});
		
		txtSearch = new JTextField();
		txtSearch.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtSearch.setOpaque(true);
		txtSearch.setText("Search");
		menuBar.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearchButton = new JButton("");
		btnSearchButton.setOpaque(true);
		btnSearchButton.setBackground(Color.ORANGE);
		btnSearchButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				SearchQuery newQuery = new SearchQuery(txtSearch.getText());
				
            }
		});
		btnSearchButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-search-more-30.png")));
		menuBar.add(btnSearchButton);
		
		JButton btnCart = new JButton("Cart");
		btnCart.setOpaque(true);
		btnCart.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-shopping-cart-32.png")));
		btnCart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				CartUI frame = new CartUI();
                frame.setVisible(true);
            }
		});
		menuBar.add(btnCart);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 47, 62));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		forwardButton = new JButton("");
		forwardButton.setBackground(Color.WHITE);
		forwardButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-arrow-right-64.png")));
		forwardButton.setBounds(372, 5, 73, 107);
		contentPane.add(forwardButton);
		
		JButton backButton = new JButton("");
		backButton.setBackground(Color.WHITE);
		backButton.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icons8-arrow-left-64.png")));
		backButton.setBounds(5, 5, 73, 107);
		contentPane.add(backButton);
		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x[0] >= 10)
				{
					x[0] = 1;
				}
				x[0]++;
	            lblImage.setIcon(new ImageIcon(ItemLayoutUI.class.getResource(iList[x[0]])));
	            itemNumber = x[0];
	        }
		});
		
		forwardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(x[0] < 1)
				{
					x[0] = 11;
				}
				x[0]--;
				lblImage.setIcon(new ImageIcon(ItemLayoutUI.class.getResource(iList[x[0]])));
				itemNumber = x[0];
			}
		});
		
		categoryExplorerPanel = new JPanel();
		categoryExplorerPanel.setBackground(new Color(34, 47, 62));
		categoryExplorerPanel.setBounds(5, 5, 440, 107);
		contentPane.add(categoryExplorerPanel);
		
		lblImage = new JButton();
		categoryExplorerPanel.add(lblImage);
		lblImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				switch(itemNumber) {
					case 0:{
						getShirts(2);
						break;
					}
					case 1:{
						getOuterwear(0);
						break;
					}
					case 2:{
						getPants(0);
						break;
					}
					case 3:{
						getOuterwear(3);
						break;
					}
					case 4:{
						getOuterwear(2);
						break;
					}
					case 5:{
						getPants(3);
						break;
					}
					case 6:{
						getShirts(3);
						break;
					}
					case 7:{
						getOuterwear(1);
						break;
					}
					case 8:{
						getPants(1);
						break;
					}
					case 9:{
						getPants(2);
						break;
					}
					case 10:{
						getShirts(0);
						break;
					}

				}
			}	
		});
		lblImage.setIcon(new ImageIcon(ItemLayoutUI.class.getResource("/Images/ckshirt.png")));
		
		t = new Timer(3000, new ActionListener() {
		int x = 1;
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				lblImage.setIcon(new ImageIcon(ItemLayoutUI.class.getResource(iList[x])));
				itemNumber = x;
				x++;
				if(x >= 10)
				{
					x = 1;
				}
			}
		});
		
		t.start();
	}
	private void getShirts(int x) {
		Shirts p = new Shirts();
		dispose();
		ItemLayoutUI frame = new ItemLayoutUI(p.ShirtsList.get(x).getName(), p.ShirtsList.get(x).getImageName(), p.ShirtsList.get(x).getPrice(),"home");
	    frame.setVisible(true);
	}
	private void getOuterwear(int x) {
		Outerwear p = new Outerwear();
		dispose();
		ItemLayoutUI frame = new ItemLayoutUI(p.OuterwearList.get(x).getName(), p.OuterwearList.get(x).getImageName(), p.OuterwearList.get(x).getPrice(),"home");
	    frame.setVisible(true);
	}
	private void getPants(int x) {
		Pants p = new Pants();
		dispose();
		ItemLayoutUI frame = new ItemLayoutUI(p.PantsList.get(x).getName(), p.PantsList.get(x).getImageName(), p.PantsList.get(x).getPrice(),"home");
        frame.setVisible(true);
	}
}