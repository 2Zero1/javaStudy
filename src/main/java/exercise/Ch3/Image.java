package exercise.Ch3;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Image {
    BufferedImage create(int width, int height, PixelFunction f) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                Color color = f.apply(x, y);
                image.setRGB(x, y, color.getRGB());
            }
        return image;
    }
}
