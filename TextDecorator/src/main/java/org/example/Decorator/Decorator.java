package org.example.Decorator;

import org.example.Component.Field;

import javax.swing.*;
import java.awt.*;

public  abstract  class Decorator implements Field {
    protected Field field;

    protected Decorator(Field field){
        this.field = field;
    }


    @Override
    public abstract JTextField getjTextField();

    @Override
    public Font getFont() {
        return field.getFont();
    }

    @Override
    public void setFont(Font font) {
        field.setFont(font);

    }

    @Override
    public void setForeground(Color color) {
        field.setForeground(color);
    }

    @Override
    public int getSize() {
        return field.getSize();
    }
}
