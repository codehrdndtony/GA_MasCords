package img.process;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class jpeg_rdr {
    public static void main(String args[]) throws IOException {
        BufferedImage BfrdImg = null;
        File gfl = null;

        try {
            gfl = new File("D:\\TESTING\\DTST\\IMG_TMP\\iml_001m.jpg");
            BfrdImg = ImageIO.read(gfl);
        } catch (IOException e) {
            System.out.println(e);
        }
        //get img W & H
        int imWidth = BfrdImg.getWidth();
        int imHeight = BfrdImg.getHeight();

        int coordX = 0;
        int coordY = 0;
        int x = 0;

        for (int y = 0; y < imHeight; y++) {
            System.out.println(coordX + coordY);
            while (x < imWidth) {
                 if (BfrdImg.getRGB(x, y) != 0xFFFFFF) {
                    System.out.println(BfrdImg.getRGB(x, y) + "; x=" + x + "; y=" + y);
                    coordX = x;
                    x = x + 1;
                } else
                    {
                        y = y + 1;
                        coordY = y;
                        System.out.println(coordX + coordY);
                    }
                    }

        }
        System.out.println(coordX + coordY);
        }
    }

// BLACK 0xFF000000
// WHITE 0x00FFFFFF
