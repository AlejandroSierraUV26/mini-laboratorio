import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Ventana extends JFrame implements ActionListener{
    JButton[] botonesMenuPrincipal = new JButton[7];
    JPanel[] arregloPaneles = new JPanel[2];
    JButton[] botonesEnviar = new JButton[2];
    JLabel[] arregloEtiquetas = new JLabel[2];
    JTextArea[] arregloTextArea = new JTextArea[2];
    JScrollPane[] arregloScrollPane = new JScrollPane[2];
    JPanel panelPrincipal, panelGatoPerro, panelDatosMascota, panelDatosMascota2, panel5, panel6;
    JButton botonGato, botonPerro, botonEnviar, botonEviar2;
    JLabel etiquetaNombre, etiqueta2;
    JTextArea areaTexto, areatexto2;
    int contador;
    String contenido;
    public Ventana(){
        setSize(720, 480); 
        setTitle("Amigos Peludos");
        setResizable(false);
        
        setLocationRelativeTo(null);
        iniciarComponentes();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){  
        panelPrincipal = new JPanel();    
        this.getContentPane().add(panelPrincipal); 
        panelPrincipal.setLayout(new GridLayout(7, 1));
            
        for (int i = 0; i < botonesMenuPrincipal.length; i++){
            botonesMenuPrincipal[i] = new JButton();
            botonesMenuPrincipal[i].addActionListener(this);
            botonesMenuPrincipal[i].setFont(new Font("Arial",Font.BOLD,25));
            panelPrincipal.add(botonesMenuPrincipal[i]);
        }

        for(int i = 0; i < arregloPaneles.length; i++){
            arregloPaneles[i] = new JPanel();
            arregloPaneles[i].setLayout(new GridLayout(3,1));
            arregloPaneles[i].setBackground(Color.WHITE);

            arregloEtiquetas[i] = new JLabel();
            arregloEtiquetas[i].setHorizontalAlignment(SwingConstants.CENTER);
            arregloEtiquetas[i].setFont(new Font("Arial", Font.BOLD,40));
            arregloEtiquetas[i].setText("Ingrese el nombre de su mascota");
            
            arregloTextArea[i] = new JTextArea();
            arregloTextArea[i].setFont(new Font("Arial", Font.BOLD, 125));
            arregloTextArea[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            botonesEnviar[i] = new JButton("Enviar");
            botonesEnviar[i].setFont(new Font("Arial",Font.BOLD,40));
            botonesEnviar[i].addActionListener(this);
            arregloScrollPane[i] = new JScrollPane(arregloTextArea[i], JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            
            arregloPaneles[i].add(arregloEtiquetas[i]);
            arregloPaneles[i].add(arregloScrollPane[i]);
            arregloPaneles[i].add(botonesEnviar[i]);
        }

        botonesMenuPrincipal[0].setText("Insertar Mascota");
        botonesMenuPrincipal[1].setText("Actualizar Mascota");
        botonesMenuPrincipal[2].setText("Eliminar Mascota");
        botonesMenuPrincipal[3].setText("Buscar Mascota");
        botonesMenuPrincipal[4].setText("Lista de Mascotas");
        botonesMenuPrincipal[5].setText("Inyectar Vacuna");
        botonesMenuPrincipal[6].setText("Estadisticas");

        panelGatoPerro = new JPanel();
        panelGatoPerro.setLayout(new GridLayout(1, 2));
        botonGato = new JButton("Gato");
        botonPerro = new JButton("Perro");
        botonGato.setFont(new Font("Arial", Font.BOLD, 50));
        botonPerro.setFont(new Font("Arial", Font.BOLD, 50));
        botonGato.addActionListener(this);
        botonPerro.addActionListener(this);
        panelGatoPerro.add(botonGato);
        panelGatoPerro.add(botonPerro);
        panelGatoPerro.setVisible(false);
    }
    public void actionPerformed(ActionEvent e){
        contenido = arregloTextArea[0].getText().trim();
        if(e.getSource()==botonesMenuPrincipal[0]){          
            panelGatoPerro.setVisible(true);
            panelPrincipal.setVisible(false);
            add(panelGatoPerro);
        }
        else if(e.getSource()==botonGato){
            panelGatoPerro.setVisible(false);
            arregloPaneles[0].setVisible(true);
            add(arregloPaneles[0]);
        }
        else if(e.getSource()==botonPerro){
            panelGatoPerro.setVisible(false);
            arregloPaneles[0].setVisible(true);
            add(arregloPaneles[0]);
        }
        if(e.getSource()==botonesEnviar[0]){
            if(contador==0){
                if(contenido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No ha ingresado el nombre de su mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    arregloEtiquetas[0].setText("Ingrese la edad de su mascota");
                    arregloTextArea[0].setText("");
                    contador++;                    
                }
            }
            else if(contador == 1){
                if(contenido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No ha ingresado la edad de su mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    arregloEtiquetas[0].setText("Ingrese el numero de patas");
                    arregloTextArea[0].setText("");
                    contador++;                    
                }
            }
            else if(contador == 2){
                if(contenido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No ha ingresado el numero de patas de su mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    arregloEtiquetas[0].setText("Ingrese el precio de su mascota");
                    arregloTextArea[0].setText("");
                    contador++;
                }
            }
            else if(contador == 3){
                if(contenido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No ha ingresado el precio de su mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    arregloEtiquetas[0].setText("Ingrese la raza de su mascota");
                    arregloTextArea[0].setText("");
                    contador++;
                }
            }
            else if(contador == 4){
                if(contenido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No ha ingresado la raza de su mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    arregloEtiquetas[0].setText("Ingrese el origen de su mascota");
                    arregloTextArea[0].setText("");
                    contador++;   
                }
            }
            else if(contador == 5){
                if(contenido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No ha ingresado el pais de origen de su mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    arregloEtiquetas[0].setText("Ingrese el color de su mascota");
                    arregloTextArea[0].setText("");
                    contador++; 
                }
            }
            else if(contador == 6){
                if(contenido.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No ha ingresado el color de su mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    contador = 0;
                    arregloEtiquetas[0].setText("Ingrese el nombre de su mascota");
                    arregloTextArea[0].setText("");
                    panelPrincipal.setVisible(true);
                    arregloPaneles[0].setVisible(false);
                }
            }            
        }
        if(e.getSource()==botonesMenuPrincipal[1]){
            
        }
    }
}


