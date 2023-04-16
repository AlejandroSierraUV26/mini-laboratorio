import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Ventana extends JFrame implements ActionListener{
    JButton[] arregloDeBotones = new JButton[5];
    JPanel panel1, panel2, panel3, panel4, panel5;
    public Ventana(){
        setSize(500, 500); 
        setTitle("Amigos Peludos");
        setLayout(new GridLayout(5,1));
        setLocationRelativeTo(null);
        iniciarComponentes();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){           
        for (int i = 0; i < arregloDeBotones.length; i++){
            arregloDeBotones[i] = new JButton();
            arregloDeBotones[i].addActionListener(this);
            add(arregloDeBotones[i]);
        }

        arregloDeBotones[0].setText("Insertar Mascota");
        arregloDeBotones[1].setText("Actualizar Mascota");
        arregloDeBotones[2].setText("Eliminar Mascota");
        arregloDeBotones[3].setText("Buscar Mascota");
        arregloDeBotones[4].setText("Lista de Mascotas");

        cargarComponentesPanel1();
    }
    private void cargarComponentesPanel1() {
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==arregloDeBotones[0]){
            JOptionPane.showMessageDialog(null, "Hola");
        }
    }
}


