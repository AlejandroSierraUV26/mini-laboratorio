import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ventana extends JFrame implements ActionListener{
    JButton[] botonesMenuPrincipal = new JButton[5];
    JPanel panelPrincipal, panelMascota, panelGato, panelPerro, panel4, panel5, panel6;
    JButton botonGato, botonPerro;
    public Ventana(){
        setSize(500, 500); 
        setTitle("Amigos Peludos");
        
        setLocationRelativeTo(null);
        iniciarComponentes();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){  
        panelPrincipal = new JPanel();    
        this.getContentPane().add(panelPrincipal); 
        panelPrincipal.setLayout(new GridLayout(5, 1));
            
        for (int i = 0; i < botonesMenuPrincipal.length; i++){
            botonesMenuPrincipal[i] = new JButton();
            botonesMenuPrincipal[i].addActionListener(this);
            panelPrincipal.add(botonesMenuPrincipal[i]);
        }

        botonesMenuPrincipal[0].setText("Insertar Mascota");
        botonesMenuPrincipal[1].setText("Actualizar Mascota");
        botonesMenuPrincipal[2].setText("Eliminar Mascota");
        botonesMenuPrincipal[3].setText("Buscar Mascota");
        botonesMenuPrincipal[4].setText("Lista de Mascotas");

        panelMascota = new JPanel();
        panelMascota.setLayout(new GridLayout(1, 2));
        botonGato = new JButton("Gato");
        botonPerro = new JButton("Perro");
        botonGato.addActionListener(this);
        botonPerro.addActionListener(this);
        panelMascota.add(botonGato);
        panelMascota.add(botonPerro);
        panelMascota.setVisible(false);

        panelGato = new JPanel();
        panelGato.setLayout(null);
        panelGato.setBackground(Color.CYAN);
        panelPerro = new JPanel();
        panelPerro.setLayout(null);
        panelPerro.setBackground(Color.CYAN);


    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botonesMenuPrincipal[0]){          
            panelMascota.setVisible(true);
            panelPrincipal.setVisible(false);
            add(panelMascota);
        }
        if(e.getSource()==botonGato){
            panelMascota.setVisible(false);
            panelGato.setVisible(true);
            add(panelGato);
        }
        if(e.getSource()==botonPerro){
            panelMascota.setVisible(false);
            panelPerro.setVisible(true);
            add(panelPerro);
        }
    }
}


