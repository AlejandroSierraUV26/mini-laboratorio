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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
public class Ventana extends JFrame implements ActionListener{
    JButton[] botonesMenuPrincipal = new JButton[7];
    JPanel panelPrincipal, panelMascota, panelGato, panelPerro, panel4, panel5, panel6;
    JButton botonGato, botonPerro, botonEnviar;
    JLabel etiquetaNombre, etiquetaPatas, etiquetaAños, etiquetaVacunas, etiquetaPrecio, etiquetaRaza, etiquetaPais, etiquetaColor;
    JTextArea areaTexto;
    int contador;
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

        botonesMenuPrincipal[0].setText("Insertar Mascota");
        botonesMenuPrincipal[1].setText("Actualizar Mascota");
        botonesMenuPrincipal[2].setText("Eliminar Mascota");
        botonesMenuPrincipal[3].setText("Buscar Mascota");
        botonesMenuPrincipal[4].setText("Lista de Mascotas");
        botonesMenuPrincipal[5].setText("Inyectar Vacuna");
        botonesMenuPrincipal[6].setText("Estadisticas");

        panelMascota = new JPanel();
        panelMascota.setLayout(new GridLayout(1, 2));
        botonGato = new JButton("Gato");
        botonPerro = new JButton("Perro");
        botonGato.setFont(new Font("Arial", Font.BOLD, 50));
        botonPerro.setFont(new Font("Arial", Font.BOLD, 50));
        botonGato.addActionListener(this);
        botonPerro.addActionListener(this);
        panelMascota.add(botonGato);
        panelMascota.add(botonPerro);
        panelMascota.setVisible(false);

        panelGato = new JPanel();
        panelGato.setLayout(new GridLayout(3,1));
        panelGato.setBackground(Color.WHITE);
        panelPerro = new JPanel();
        panelPerro.setLayout(new GridLayout(3,1));
        panelPerro.setBackground(Color.WHITE);
        
        etiquetaNombre = new JLabel("Ingrese el nombre de su mascota");
        etiquetaNombre.setHorizontalAlignment(SwingConstants.CENTER);
        etiquetaNombre.setFont(new Font("Arial", Font.BOLD,40));
        areaTexto = new JTextArea();
        areaTexto.setFont(new Font("Arial", Font.BOLD, 125));
        areaTexto.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        botonEnviar = new JButton("Enviar");
        botonEnviar.setFont(new Font("Arial",Font.BOLD,50));
        botonEnviar.addActionListener(this);
        panelGato.add(etiquetaNombre);
        panelGato.add(areaTexto);
        JScrollPane scrollPane = new JScrollPane(areaTexto, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelGato.add(scrollPane);
        panelGato.add(botonEnviar); 
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==botonesMenuPrincipal[0]){          
            panelMascota.setVisible(true);
            panelPrincipal.setVisible(false);
            add(panelMascota);
        }
        else if(e.getSource()==botonGato){
            panelMascota.setVisible(false);
            panelGato.setVisible(true);
            add(panelGato);
        }
        else if(e.getSource()==botonPerro){
            panelMascota.setVisible(false);
            panelPerro.setVisible(true);
            add(panelPerro);
        }
        if(e.getSource()==botonEnviar){
            if(contador==0){
                etiquetaNombre.setText("Ingrese la edad de su mascota");
                areaTexto.setText("");
                contador++;
            }
            else if(contador == 1){
                etiquetaNombre.setText("Ingrese el numero de patas");
                areaTexto.setText("");
                contador++;
            }
            else if(contador == 2){
                etiquetaNombre.setText("Ingrese el precio de su mascota");
                areaTexto.setText("");
                contador++;
            }
            else if(contador == 3){
                etiquetaNombre.setText("Ingrese la raza de su mascota");
                areaTexto.setText("");
                contador++;
            }
            else if(contador == 4){
                etiquetaNombre.setText("Ingrese el origen de su mascota");
                areaTexto.setText("");
                contador++;
            }
            else if(contador == 5){
                etiquetaNombre.setText("Ingrese el color de su mascota");
                areaTexto.setText("");
                contador++;
            }            
            else{
                contador = 0;
                etiquetaNombre.setText("Ingrese el nombre de su mascot");
                panelPrincipal.setVisible(true);
                panelGato.setVisible(false);
            }
        }
    }
}


