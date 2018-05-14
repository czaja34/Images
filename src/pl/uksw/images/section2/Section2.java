package pl.uksw.images.section2;

import java.awt.image.BufferedImage;

public class Section2 {

    public BufferedImage sumPar(BufferedImage image, int par) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                int a = (pixel >> 24) & 0xff;
                int r = (pixel >> 16) & 0xff;
                int g = (pixel >> 8) & 0xff;
                int b = pixel & 0xff;
                ;
                if (r + par <= 255) {
                    r += par;
                    g += par;
                    b += par;
                } else {
                    r = 255;
                    g = 255;
                    b = 255;
                }
                pixel = (a<<24) | (r<<16) | (g<<8) | b;
                image.setRGB(x, y, pixel);
            }
        }
        return image;
    }
}
