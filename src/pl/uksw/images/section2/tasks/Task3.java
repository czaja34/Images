package pl.uksw.images.section2.tasks;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Task3 {

    public BufferedImage task2(BufferedImage image, BufferedImage resized, double angle){

        Graphics2D g = resized.createGraphics();
        AffineTransform at = AffineTransform.getRotateInstance(angle);
        g.drawRenderedImage(image, at);

        return resized;
    }
}
