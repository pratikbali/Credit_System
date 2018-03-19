import javax.swing.*;
import java.awt.*;

public class About extends JPanel
{
	public About()
	{
		//for creating the image icon
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/java.jpg"));
		//for creating the label and setting the image icon
		JLabel label1 = new JLabel(icon);
		//for adding the label to the panel
		this.add(label1);
		//for creating the label and setting the text
		JLabel label2 = new JLabel("<html><li> CREDIT BASED EVALUATION SYSTEM "
		        + "</li><li><p>Ver# 1.0</li>"
		        + "<li><p>Developed by: Pratik Sanjay Bali & Uday Dattatray Bhapkar </li><li><p>HYDROGEN</li><li>"
		        + "<p>Copyright<font size=\"2\">&copy;</font> 2007 - 2008</li></html>");
		//for setting the font to the label
		label2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		//for adding the lable to the panel
		this.add(label2);
	}
}