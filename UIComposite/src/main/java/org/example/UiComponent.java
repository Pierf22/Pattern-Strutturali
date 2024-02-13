package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public interface UiComponent {
    public void setText(String text);
//Operazioni per i figli
    public default void add(UiComponent uiComponent){
        throw new RuntimeException("Operazione chiamata su un nodo foglia");
    };
    public default void remove(UiComponent uiComponent){
        throw new RuntimeException("Operazione chiamata su un nodo foglia");
    };
    public default Iterator<UiComponent> getIterator(){
        throw new RuntimeException("Operazione chiamata su un nodo foglia");
    };
    public Component getUI();
}
