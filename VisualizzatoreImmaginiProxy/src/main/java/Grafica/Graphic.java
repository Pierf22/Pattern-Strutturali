package Grafica;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public interface Graphic {
    public void scale(int width, int height);
    public ImageIcon get();
    public int getWidght();
    public int getHeight();
}
