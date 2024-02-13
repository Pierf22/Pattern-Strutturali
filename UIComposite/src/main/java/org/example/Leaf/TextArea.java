package org.example.Leaf;

import org.example.UiComponent;

import javax.swing.*;
import java.awt.*;

public class TextArea implements UiComponent {
    JTextArea textArea;
    public TextArea(){
        textArea=new JTextArea();

    }
    @Override
    public void setText(String text) {
        textArea.setText(text);

    }

    @Override
    public Component getUI() {
        return textArea;
    }
}
