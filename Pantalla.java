package cajero;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *Pantalla de la calculadora
 * @author Rod
 */
public class Pantalla {
private final JTextField pantalla;
    public Pantalla(boolean b,int a) {
        Color c;
        if(a==1){
            c = new Color(0, 206, 209);
        }else if(a==2){
            c = new Color(255, 215, 0);
        }else if(a==3){
            c = new Color(190, 190, 190);
        }else if(a==4){
            c = new Color(220, 220, 220);
        }else{
            c =new Color(0, 0, 0);
        }
        
        pantalla = new JTextField("0", 20);
        pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
        pantalla.setFont(new Font("Arial", Font.BOLD, 30));
        pantalla.setHorizontalAlignment(JTextField.CENTER);
        pantalla.setEditable(b);
        pantalla.setBackground(c);  
        pantalla.setText("Cajero Automatico");
    }
    
    public JTextField RegresarPantalla(){
        return pantalla;
    }
}
