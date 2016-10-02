/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Alumno
 */
public class Login extends JFrame {
    JPanel panelPrincipal, panelBotones, panelCuadritos;
    JTextField usuario;
    JPasswordField pas;

    public Login() {
        super();
        setSize(600, 600);
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        panelPrincipal = (JPanel) this.getContentPane();
        panelPrincipal.setLayout(new BorderLayout());

        panelBotones = new JPanel();
        panelCuadritos = new JPanel();
        panelCuadritos.setLayout(new BorderLayout());

        Pantalla p = new Pantalla(true, 1);
        usuario = p.RegresarPantalla();
        usuario.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                usuario.setText("");
            }

            public void focusLost(FocusEvent e) {
                // nothing
            }
        });
        usuario.setText("Nombre de Usuario");
        pas = new JPasswordField("0", 20);
        pas.setBorder(new EmptyBorder(4, 4, 4, 4));
        pas.setFont(new Font("Arial", Font.BOLD, 30));
        pas.setHorizontalAlignment(JTextField.CENTER);
        pas.setEditable(true);
        usuario.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                usuario.setText("");
            }

            public void focusLost(FocusEvent e) {
                // nothing
            }
        });
        pas.setText("Password");

        nuevoBotonOperacion("Iniciar Sesion");
        nuevoBotonOperacion("Regresar");
        panelCuadritos.add("North", this.usuario);
        panelCuadritos.add("Center", this.pas);

        panelPrincipal.add("North", panelCuadritos);
        panelPrincipal.add("Center", panelBotones);
    }

    private void nuevoBotonOperacion(String operacion) {
        JButton btn = new JButton(operacion);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                operacionPulsado(btn.getText());
            }
        });
        panelBotones.add(btn);
    }

    private void operacionPulsado(String tecla) {
        int num = 0;
        if (tecla.equals("Iniciar Sesion")) {
            this.dispose();
        } else if (tecla.equals("Registrarse")) {
        } else if (tecla.equals("Regresar")) {
            MenuInicial m = new MenuInicial();
            m.setVisible(true);
            this.dispose();
        }
    }
}
