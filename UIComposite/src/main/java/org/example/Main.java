package org.example;

import org.example.Composite.Panel;
import org.example.Composite.TabbedPanel;
import org.example.Leaf.Button;
import org.example.Leaf.Label;
import org.example.Leaf.TextArea;
import org.example.Leaf.TextField;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(600,500));
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        //Creazione di oggetti compositi Panel
        Panel panel= new Panel();
        Panel panel1=new Panel();
        //componenti foglia
        TextField textField=new TextField();
        Button button=new Button();
        TextArea textArea=new TextArea();
        Label label=new Label();

        //aggiunta dei elementi foglia in un elemento composito
        panel.add(button);
        panel.add(textArea);
        panel.add(label);
        panel1.add(textField);
        //creazione di oggetto composito TabbedPanel
        TabbedPanel tabbedPanel=new TabbedPanel();
        //aggiunta dei elementi foglia in un elemento composito
        tabbedPanel.add(panel);
        tabbedPanel.add(panel1);
        //la funzione setText viene chiamata per tutti i componenti di tabbedPanel
        tabbedPanel.setText("ciao siamo componenti");
        //tabbedPanel.remove(panel);
        frame.add(tabbedPanel.getUI());
        frame.pack();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}