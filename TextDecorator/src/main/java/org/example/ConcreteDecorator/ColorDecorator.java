package org.example.ConcreteDecorator;

import org.example.Component.Field;
import org.example.Decorator.Decorator;

import javax.swing.*;
import java.awt.*;

public class ColorDecorator extends Decorator {
    Color color;
    public ColorDecorator(Field l, Color color) {
        super(l);
        this.color=color;

    }

    @Override
    public JTextField getjTextField() {
        super.field.setForeground(color);
        return field.getjTextField();
    }
}
