package org.example.Composite;

import org.example.UiComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TabbedPanel implements UiComponent {
    JTabbedPane tabbedPane=new JTabbedPane();
    List<UiComponent> components;
    Iterator<UiComponent> iterator;
    public TabbedPanel(){
        components=new ArrayList<UiComponent>();
        tabbedPane.setMinimumSize(new Dimension(600,500));
    }

    @Override
    public void setText(String text) {iterator=getIterator();
        while(iterator.hasNext()){
            iterator.next().setText(text);
        }


    }

    @Override
    public void add(UiComponent uiComponent) {
        tabbedPane.add(uiComponent.getUI());
        components.add(uiComponent);
    }

    @Override
    public void remove(UiComponent uiComponent) {
        tabbedPane.remove(uiComponent.getUI());
        components.remove(uiComponent);
    }

    @Override
    public Iterator<UiComponent> getIterator() {
        iterator=components.iterator();
        return iterator;
    }

    @Override
    public Component getUI() {
        return tabbedPane;
    }
}
