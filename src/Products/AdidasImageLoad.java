package Products;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;

public class AdidasImageLoad extends Panel{

	Image i;
	
	public AdidasImageLoad(String url)
	{
		ImageIcon ii = new ImageIcon(url);
		i = ii.getImage();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		int w = getWidth();
        int h = getHeight();
        int imageWidth = i.getWidth(this);
        int imageHeight = i.getHeight(this);
        int x = (w - imageWidth)/2;
        int y = (h - imageHeight)/2;
		g.drawImage(i, x, y, this);
	}
}
