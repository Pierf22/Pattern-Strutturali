package org.example.ConcreteComponent;

import org.example.Component.Field;

import javax.swing.*;
import java.awt.*;

public class TestoBase implements Field {
    private JTextField jTextField;
    public TestoBase(String t){
        jTextField =new JTextField(t);
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    @Override
    public Font getFont() {
        return jTextField.getFont();
    }

    @Override
    public void setFont(Font font) {
        jTextField.setFont(font);

    }

    @Override
    public void setForeground(Color color) {
        jTextField.setForeground(color);
    }

    @Override
    public int getSize() {

        return jTextField.getFont().getSize();
    }
}
