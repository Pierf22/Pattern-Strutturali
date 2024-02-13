package Grafica;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Immagine implements Graphic {
    //Classe immagine senza Proxy
    Image image;
    int widght, height;

    public Immagine(String path){
        BufferedImage bufferedImage=null;
        File file=new File(path);
        try {
            image =ImageIO.read(file);
             bufferedImage = (BufferedImage) image;

        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.widght= bufferedImage.getWidth();
        this.height=bufferedImage.getHeight();

    }
    @Override
    public void scale(int width, int height) {
         image=image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
         this.widght=width;
         this.height=height;
    }

    @Override
    public ImageIcon get() {
        return new ImageIcon(image);
    }

    @Override
    public int getWidght() {
        return widght;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
