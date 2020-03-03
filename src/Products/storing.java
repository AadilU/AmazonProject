package Products;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class storing {
	backButton.addActionListener(new ActionListener() {
		int x1 = 1;
		public void actionPerformed(ActionEvent e) {
			x1++;
			if(x1 >= 10)
			{
				x1 = 1;
			}
            lblImage.setIcon(new ImageIcon(ItemLayoutUI.class.getResource(iList[x1])));
        }
	});
	
	forwardButton.addActionListener(new ActionListener() {
		int y = 10;
		public void actionPerformed(ActionEvent e) {
			y -= 1;
			if(y < 2)
			{
				y = 10;
			}
			lblImage.setIcon(new ImageIcon(ItemLayoutUI.class.getResource(iList[y])));
		}
	});
}
