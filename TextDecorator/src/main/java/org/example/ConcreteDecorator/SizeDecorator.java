package org.example.ConcreteDecorator;

import org.example.Component.Field;
import org.example.Decorator.Decorator;

import javax.swing.*;

public class SizeDecorator extends Decorator {
    float size;
    public SizeDecorator(Field l, float size) {
        super(l);
        this.size=size;
    }


    @Override
    public JTextField getjTextField() {
        super.field.setFont(field.getFont().deriveFont(size));
        return field.getjTextField();
    }
}
