package org.example.ConcreteDecorator;

import org.example.Component.Field;
import org.example.Decorator.Decorator;

import javax.swing.*;
import java.awt.*;

public class FontDecorator extends Decorator {
    String font;
    public FontDecorator(Field l, String font) {
        super(l);
        this.font=font;

    }

    @Override
    public JTextField getjTextField() {
        super.field.setFont(new Font(font, Font.BOLD, field.getSize()));
        return field.getjTextField();
    }
}
