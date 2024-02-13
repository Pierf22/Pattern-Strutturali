package org.example;

import org.example.Component.Field;
import org.example.ConcreteComponent.TestoBase;
import org.example.ConcreteDecorator.ColorDecorator;
import org.example.ConcreteDecorator.FontDecorator;
import org.example.ConcreteDecorator.SizeDecorator;
import org.example.Decorator.Decorator;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JFrame frame1 = new JFrame();
        frame.setSize(800,600);
        frame.setVisible(true);
        frame1.setSize(800,600);
        frame1.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container container = frame.getContentPane();

        // Impostazione del layout del Container come BoxLayout
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        //Aggiunta di ogni singolo decorator
        Field field=new TestoBase("ciao");
        Decorator size= new SizeDecorator(field, 200);
        Decorator font=new FontDecorator(field, "Serif");
        Decorator color=new ColorDecorator(field, Color.GREEN);


        field.getjTextField().setFocusable(true);
        //Aggiunta singola frame.add(color.getjTextField());

        Field component=new ColorDecorator(new FontDecorator(new SizeDecorator(new TestoBase("ciao"), 200), "Serif"), Color.GREEN);
        Field component1=new ColorDecorator(new TestoBase("ciao"), Color.RED);
        component.getjTextField().setFocusable(true);
        frame.add(component.getjTextField());
        frame1.add(component1.getjTextField());

        frame.pack();
        frame1.pack();
    }
}