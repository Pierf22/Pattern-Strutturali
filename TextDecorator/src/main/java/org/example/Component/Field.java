package org.example.Component;

import javax.swing.*;
import java.awt.*;

public interface Field {
    public  JTextField getjTextField() ;


    Font getFont();

    void setFont(Font font);

    void setForeground(Color color);

    int getSize();
}
