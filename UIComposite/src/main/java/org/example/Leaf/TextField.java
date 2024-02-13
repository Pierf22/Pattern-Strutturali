package org.example.Leaf;

import org.example.UiComponent;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class TextField implements UiComponent {
    JTextField textField;
    public TextField(){
        textField=new JTextField();
    }
    @Override
    public void setText(String text) {
        textField.setText(text);

    }


    @Override
    public Component getUI() {
        return textField;
    }
}
