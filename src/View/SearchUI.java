package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

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

import Control.SearchQuery;
import Model.Outerwear;
import Model.Pants;
import Model.Shirts;

import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SearchUI extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextField txtSearch;
	private JMenuItem mntmHome;
	private ArrayList queryResults;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayList results = new ArrayList();
					SearchUI frame = new SearchUI(results);
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
	public SearchUI(ArrayList results) {
		try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (UnsupportedLookAndFeelException ex) {
        }
		UIManager.put("MenuBar.background", Color.DARK_GRAY);
		setBackground(Color.decode("#2c3e50"));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setForeground(Color.BLACK);
		menuBar.setBackground(new Color(44, 62, 80));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("");
		mnNewMenu.setBackground(Color.DARK_GRAY);
		mnNewMenu.setIcon(new ImageIcon(SearchUI.class.getResource("/Images/icons8-menu-rounded-30.png")));
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
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				SearchQuery newQuery = new SearchQuery(txtSearch.getText());
				
            }
		});
		btnNewButton.setIcon(new ImageIcon(SearchUI.class.getResource("/Images/icons8-search-32.png")));
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
		contentPane.setBackground(new Color(34, 47, 62));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		List list = new List();
		list.setMultipleMode(false);
		list.setBounds(10, 10, 392, 198);
		for(int x = 0; x < results.size(); x++) {
			list.add((String) results.get(x));
		}
		list.addItemListener(this);
		contentPane.add(list);
	}
	public void itemStateChanged(ItemEvent e) { 
		List l = (List)e.getSource();
		switch(l.getSelectedItem()) {
			case "SUPREME Shirt":{
				getShirts(0);
	        	break;
			}
			case "Kirklands Shirt":{
				getShirts(1);
	        	break;
			}
			case "Kalvin Clein Shirt":{
				getShirts(2);
	        	break;
			}
			case "Goodwill Shirts":{
				getShirts(3);
	        	break;	
			}
			case "Adidas Pants":{
				getPants(0);
				break;
			}
			case "Kirklands Pants":{
				getPants(1);
				break;
			}
			case "Levis Pants":{
				getPants(2);
				break;
			}
			case "Goodwill Pants":{
				getPants(3);
				break;
			}
			case "Adidas Jacket":{
				getOuterwear(0);
				break;
			}
			case "Kirklands Jacket":{
				getOuterwear(1);
				break;
			}
			case "Guess Jacket":{
				getOuterwear(2);
				break;			
			}
			case "Goodwill Jacket":{
				getOuterwear(3);
				break;
			}
		}
	}
	private void getShirts(int x) {
		Shirts p = new Shirts();
		dispose();
		ItemLayoutUI frame = new ItemLayoutUI(p.ShirtsList.get(x).getName(), p.ShirtsList.get(x).getImageName(), p.ShirtsList.get(x).getPrice(),"shirts");
	    frame.setVisible(true);
	}
	private void getPants(int x) {
		Pants p = new Pants();
		dispose();
		ItemLayoutUI frame = new ItemLayoutUI(p.PantsList.get(x).getName(), p.PantsList.get(x).getImageName(), p.PantsList.get(x).getPrice(),"pants");
        frame.setVisible(true);
	}
	private void getOuterwear(int x) {
		Outerwear p = new Outerwear();
		dispose();
		ItemLayoutUI frame = new ItemLayoutUI(p.OuterwearList.get(x).getName(), p.OuterwearList.get(x).getImageName(), p.OuterwearList.get(x).getPrice(),"outerwear");
	    frame.setVisible(true);
	}
}
