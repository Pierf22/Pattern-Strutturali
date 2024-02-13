package org.example.Leaf;

import org.example.UiComponent;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class Button implements UiComponent {
    JButton button;
    public Button(){
        button=new JButton();
    }
    @Override
    public void setText(String text) {
        button.setText(text);
    }

    @Override
    public Component getUI() {
        return button;
    }


}
