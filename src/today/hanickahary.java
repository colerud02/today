package today;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class hanickahary {
	JFrame jf = new JFrame();
	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	public hanickahary() {
		ArrayList<JLabel> gifts = new ArrayList<JLabel>();
		gifts.add(loadImageFromTheInternet("http://i147.photobucket.com/albums/r281/janfu/HanukkahHarry.jpg"));
		gifts.add(loadImageFromTheInternet("http://i0.wp.com/teaser-trailer.com/wp-content/uploads/Star-Wars-7-New-Banner.jpg"));
		gifts.add(loadImageFromTheInternet("http://proclockers.com/sites/default/files/images/stories/h440_blk_main_24x32in.jpg"));
		jf.add(gifts.get(0));
		jf.setVisible(true);
		jf.pack();
	}

	public static void main(String[] args) {
hanickahary h = new hanickahary();
	}

	

}
//
// 
// 
// Add pictures of things that you want for Christmas to the List.
// Create and initialize an ArrayList of JLabels.
// Use the methods above to load images from the Internet or from your default package.
// Add the JLabels to the List.
