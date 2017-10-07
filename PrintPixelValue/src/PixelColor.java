import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PixelColor {


    public static void writeToFile(String imgName,String fileName) {
        try {
            PrintWriter pw = new PrintWriter(fileName + ".txt");
            System.out.println("Not");

            String values = readImg(imgName);
            System.out.println("Passed");
            pw.write(values);
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static String readImg(String imgName) {
        String text = "";
        try {
            BufferedImage img = ImageIO.read(new File(imgName));
            for (int i = 0; i < img.getHeight(); i++) {
                text += "[" + i + "]";
                for (int j = 0; j < img.getWidth(); j++) {
                    Color c = new Color(img.getRGB(i, j));
                    String h = String.format("%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
                    System.out.println(h);
                    text+="{"+j+"}#"+h;
//                    [1]{1}#88691E{2}#7F1DF4{3}#04E8EF
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }


}
