package image;

import java.awt.Image;

import javax.swing.ImageIcon;

import loginPackage.userModel;

public class img {
	
	public static ImageIcon userImage(int width , int height) {
		ImageIcon icon = new ImageIcon();
		icon = userModel.getProfilePhoto();
		Image originalImage = icon.getImage();
		Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	    ImageIcon imageIcon = new ImageIcon(resizedImage);
		return imageIcon;
	}
		
		
		
}
