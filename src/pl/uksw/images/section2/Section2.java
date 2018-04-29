package pl.uksw.images.section2;

import java.awt.image.BufferedImage;

public class Section2 {

    public BufferedImage sumPar(BufferedImage image, int par) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x,y)& 0xFF;
                if(pixel+par<=255){
                    pixel+=par;
                }else{
                    pixel=255;
                }
                image.setRGB(x,y,pixel);
            }
        }
        return image;
    }
}
