package application;

import Grafica.Graphic;
import Grafica.ImmagineProxy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Visualizzatore {

    JButton avanti;
    int value=0, size;
    JLabel immagine;
    File [] files;
    Graphic[] images;
    ExecutorService executorService= Executors.newCachedThreadPool();
    public Visualizzatore() {
        avanti = new JButton("Prossima immagine "+value);

        URL cartella = getClass().getResource("/immagini");
        File file = new File(cartella.getFile());
        files = file.listFiles();
        size = files.length;
        images = new Graphic[size];
        for (int i = 0; i < size; i++) { //da cambiare per passare da Proxy a Immagine
            images[i] = new ImmagineProxy(files[i].getPath());
        }

        JFrame frame = new JFrame("Visualizzatore immagini");

        immagine = new JLabel("In caricamento...");
        immagine.setFont(new Font("Arial", Font.BOLD, 25));
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                loadNextImage();
            }
        });
        frame.add(avanti);
        frame.add(immagine);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        BoxLayout b = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
        frame.setLayout(b);
        frame.setSize(800, 600);
        avanti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                immagine.setText("In caricamento...");
                immagine.setIcon(null);
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        loadNextImage();
                    }
                });
            }
        });


    }
public synchronized void loadNextImage(){

        if(images[(value + 1 + size) % size].getWidght()!=800 || images[(value + 1 + size) % size].getHeight()!=500) {
            images[(value + 1 + size) % size].scale(800, 500);
        }
        immagine.setIcon(images[(value + 1 + size) % size].get());
        immagine.setText("");
        avanti.setText("Prossima immagine "+(value+size)%size);
        value++;

}

}

