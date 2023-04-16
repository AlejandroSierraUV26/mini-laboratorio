import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ventana extends JFrame implements ActionListener{
    JButton[] arregloDeBotones = new JButton[5];
    JPanel panel0, panel1, panel2, panel3, panel4, panel5, panel6;
    JButton boton1, boton2;
    public Ventana(){
        setSize(500, 500); 
        setTitle("Amigos Peludos");
        
        setLocationRelativeTo(null);
        iniciarComponentes();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){  
        panel0 = new JPanel();    
        this.getContentPane().add(panel0); 
        panel0.setLayout(new GridLayout(5, 1));
            
        for (int i = 0; i < arregloDeBotones.length; i++){
            arregloDeBotones[i] = new JButton();
            arregloDeBotones[i].addActionListener(this);
            panel0.add(arregloDeBotones[i]);
        }

        arregloDeBotones[0].setText("Insertar Mascota");
        arregloDeBotones[1].setText("Actualizar Mascota");
        arregloDeBotones[2].setText("Eliminar Mascota");
        arregloDeBotones[3].setText("Buscar Mascota");
        arregloDeBotones[4].setText("Lista de Mascotas");
        
        cargarComponentesPanel1();
    }
    private void cargarComponentesPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 2));
        boton1 = new JButton("Gato");
        boton2 = new JButton("Perro");
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.setVisible(false);
        }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==arregloDeBotones[0]){          
            panel1.setVisible(true);
            panel0.setVisible(false);
            add(panel1);
        }
        
    }
}


