package org.example.Leaf;

import org.example.UiComponent;

import javax.swing.*;
import java.awt.*;

public class Label implements UiComponent {
    JLabel label;
    public Label(){
        label=new JLabel();
    }
    @Override
    public void setText(String text) {
        label.setText(text);

    }

    @Override
    public Component getUI() {
        return label;
    }
}
