package Grafica;

import javax.swing.*;

public class ImmagineProxy implements Graphic{
    Immagine image=null;
    String path;
    int width=0, height=0;

    public ImmagineProxy(String path){
       this.path=path;
    }
    @Override
    public void scale(int width, int height) {
        if(image==null){
            this.width=width;
            this.height=height;
    } else {
            image.scale(width, height);
        }
    }

    @Override
    public ImageIcon get() {
        if(image==null)
            image=new Immagine(path);
        if(width!=image.getWidght() || height!=image.getHeight()){
            image.scale(width,height);
            width=image.getWidght();
            height=image.getHeight();}
        return  image.get();
    }

    @Override
    public int getWidght() {
        if(image==null)
            return width;
        else
            return image.getWidght();
    }

    @Override
    public int getHeight() {
        if(image==null)
            return height;
        else
            return image.getHeight();
    }
}
