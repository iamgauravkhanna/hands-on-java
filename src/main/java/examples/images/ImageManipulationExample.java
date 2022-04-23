package java.examples.images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

// https://gist.github.com/bertolo1988/36dce3d434f30c76e52617f26d1a8427

// http://stackoverflow.com/questions/37598977/how-to-compare-two-images-using-selenium/37599411#37599411

public class ImageManipulationExample {

	static String PATH = "C:/Users/gaurav.khanna/";
	static String SOURCE1 = "image1";
	static String SOURCE2 = "image2";
	static String COMBINATION = "combine";
	static String SUBTRACTION = "subtraction";
	static String IMAGE_FILE_TYPE = "png";

	public static void main(String[] args) throws IOException {
		BufferedImage imgA = ImageIO.read(new File(PATH + SOURCE1 + "." + IMAGE_FILE_TYPE));
		BufferedImage imgB = ImageIO.read(new File(PATH + SOURCE2 + "." + IMAGE_FILE_TYPE));
		System.out.println(ImageManipulationExample.bufferedImagesEqual(imgA, imgB));
		ImageManipulationExample.subtractImages(imgA, imgB);
		ImageManipulationExample.combineImages(imgA, imgB);
	}

	private static void combineImages(BufferedImage image1, BufferedImage image2) throws IOException {
		BufferedImage result = new BufferedImage(image1.getWidth(), image1.getHeight(), image1.getType());
		for (int x = 0; x < image1.getWidth(); x++)
			for (int y = 0; y < image1.getHeight(); y++) {
				result.setRGB(x, y, Math.abs(image2.getRGB(x, y) + image1.getRGB(x, y)));
			}
		ImageIO.write(result, IMAGE_FILE_TYPE, new File(PATH + COMBINATION + "." + IMAGE_FILE_TYPE));
	}

	private static void subtractImages(BufferedImage image1, BufferedImage image2) throws IOException {
		BufferedImage result = new BufferedImage(image1.getWidth(), image1.getHeight(), image1.getType());
		for (int x = 0; x < image1.getWidth(); x++)
			for (int y = 0; y < image1.getHeight(); y++) {
				result.setRGB(x, y, Math.abs(image2.getRGB(x, y) - image1.getRGB(x, y)));
			}
		ImageIO.write(result, IMAGE_FILE_TYPE, new File(PATH + SUBTRACTION + "." + IMAGE_FILE_TYPE));
	}

	private static boolean bufferedImagesEqual(BufferedImage img1, BufferedImage img2) {
		if (!(img1.getWidth() == img2.getWidth() && img1.getHeight() == img2.getHeight())) {
			return false;
		}
		for (int x = 0; x < img1.getWidth(); x++) {
			for (int y = 0; y < img1.getHeight(); y++) {
				if (img1.getRGB(x, y) != img2.getRGB(x, y))
					return false;
			}
		}
		return true;
	}
}