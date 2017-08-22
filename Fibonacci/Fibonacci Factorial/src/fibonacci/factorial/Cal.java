
package fibonacci.factorial;

/**
 *
 * @author Sosa Estrada María Fernanda, Vega Corona Yazmin María
 * @date 18/08/17
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.*;

public class Cal extends JFrame implements ActionListener {

    Calculadora objCalcu;
    
    /*
    * Declaramos las variables
     */
    private JTextField numero1, numero2, fibonacci, factorial;
    private JButton Botonfibonacci, Botonfactorial, Resultadofibonacci, Resultadofactorial, regresar;
    private JLabel titulofibonacci, titulofactorial, lnumero1, lnumero2, titulo, lfibonacci, lfactorial;

    /*
    * Creamos un nuevo objeto de la clase Calculadora
    */
    public Cal() {
        objCalcu = new Calculadora();
        configurarVentana();
        iniciarComponentes();
    }

    /*
    * Todo lo relacionado con el diseño
     */
    private void configurarVentana() {
        setTitle("FIBONNACI Y FACTORIAL");
        setSize(650, 510);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220, 216, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setIconImage(new ImageIcon(getClass().getResource("PICS/MONTAÑA.jpg")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon IMG = new ImageIcon(this.getClass().getResource("PICS/MONTAÑA.jpg"));
        JLabel PIC = new JLabel();
        PIC.setIcon(IMG);
        getLayeredPane().add(PIC, JLayeredPane.FRAME_CONTENT_LAYER);
        PIC.setBounds(0, 0, 800, 600);  

    }
    
    /*
    * Ponemos los atributos de las variables
     */
    private void iniciarComponentes() {
        //Labels

        titulofibonacci = new JLabel("Serie Fibonnaci ");
        titulofibonacci.setBounds(190, 40, 400, 30);
        titulofibonacci.setFont(new Font("TimesRoman", Font.BOLD, 23));
        add(titulofibonacci);
        titulofibonacci.setVisible(false);

        titulofactorial = new JLabel("Factorial de un Numero");
        titulofactorial.setBounds(170, 40, 400, 30);
        titulofactorial.setFont(new Font("TimesRoman", Font.BOLD, 23));
        add(titulofactorial);
        titulofactorial.setVisible(false);

        titulo = new JLabel("Factorial y Serie Fibonacci");
        titulo.setBounds(190, 40, 400, 30);
        titulo.setFont(new Font("TimesRoman", Font.BOLD, 23));
        add(titulo);
        titulo.setVisible(true);

        lnumero1 = new JLabel("Ingrese un numero");
        lnumero1.setBounds(100, 180, 200, 20);
        lnumero1.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(lnumero1);
        lnumero1.setVisible(false);

        lnumero2 = new JLabel("Ingrese un numero");
        lnumero2.setBounds(100, 180, 200, 20);
        lnumero2.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(lnumero2);
        lnumero2.setVisible(false);

        lfibonacci = new JLabel("Fibonnaci");
        lfibonacci.setBounds(100, 250, 200, 20);
        lfibonacci.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(lfibonacci);
        lfibonacci.setVisible(false);

        lfactorial = new JLabel("Factorial");
        lfactorial.setBounds(100, 250, 200, 20);
        lfactorial.setFont(new Font("TimesRoman", Font.BOLD, 18));
        add(lfactorial);
        lfactorial.setVisible(false);

        //TextFields
        numero1 = new JTextField();
        numero1.setBounds(300, 180, 100, 30);
        numero1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(numero1);
        numero1.setVisible(false);

        numero2 = new JTextField();
        numero2.setBounds(300, 180, 100, 30);
        numero2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });

        add(numero2);
        numero2.setVisible(false);

        fibonacci = new JTextField();
        fibonacci.setBounds(300, 250, 100, 30);
        fibonacci.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '1'))) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(fibonacci);
        fibonacci.setVisible(false);

        factorial = new JTextField();
        factorial.setBounds(300, 250, 100, 30);
        factorial.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0') || (caracter > '1'))) {
                    e.consume(); // ignorar el evento de teclado
                }
            }
        });
        add(factorial);
        factorial.setVisible(false);

        //buttons
        Botonfibonacci = new JButton("Serie de Fibonacci");
        Botonfibonacci.setBounds(190, 150, 300, 50); // izquiera, alto largo ancho
        add(Botonfibonacci);
        Botonfibonacci.addActionListener(this);
        Botonfibonacci.setVisible(true);

        Botonfactorial = new JButton("Factorial de un numero");
        Botonfactorial.setBounds(190, 250, 300, 50);
        add(Botonfactorial);
        Botonfactorial.addActionListener(this);
        Botonfactorial.setVisible(true);

        Resultadofibonacci = new JButton("Fibonacci");
        Resultadofibonacci.setBounds(430, 210, 100, 50);
        add(Resultadofibonacci);
        Resultadofibonacci.addActionListener(this);
        Resultadofibonacci.setVisible(false);

        Resultadofactorial = new JButton("Factorial");
        Resultadofactorial.setBounds(430, 210, 100, 50);
        add(Resultadofactorial);
        Resultadofactorial.addActionListener(this);
        Resultadofactorial.setVisible(false);

        regresar = new JButton("Regresar");
        regresar.setBounds(450, 400, 100, 50); // izquiera, alto largo ancho
        add(regresar);
        regresar.addActionListener(this);
        regresar.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int num1, num2, resultado;
        String resul, total;

        if (e.getSource() == Botonfibonacci) {
            titulo.setVisible(false);
            Botonfactorial.setVisible(false);
            Botonfibonacci.setVisible(false);
            fibonacci.setVisible(true);
            lfibonacci.setVisible(true);
            numero1.setVisible(true);
            lnumero1.setVisible(true);
            regresar.setVisible(true);
            Resultadofibonacci.setVisible(true);

        } else if (e.getSource() == Resultadofibonacci) {

            /*
                * Se invocan los metodos de la clase Calculadora para obtener la serie
             */
            fibonacci.setEnabled(false);
            num1 = Integer.parseInt(numero1.getText());
            objCalcu.setNum1(num1);
            resul = objCalcu.NumeroFi();
            fibonacci.setText(resul);
            
        } else if (e.getSource() == Botonfactorial) {

            titulo.setVisible(false);
            Botonfactorial.setVisible(false);
            Botonfibonacci.setVisible(false);
            factorial.setVisible(true);
            lfactorial.setVisible(true);
            numero2.setVisible(true);
            lnumero2.setVisible(true);
            regresar.setVisible(true);
            Resultadofactorial.setVisible(true);
            
        } else if (e.getSource() == Resultadofactorial) {

            /*
            * Se invocan los metodos de la clase Calculadora para obtener el factorial
             */
            factorial.setEnabled(false);
            num2 = Integer.parseInt(numero2.getText());
            objCalcu.setNum2(num2);
            resul = objCalcu.NumeroFa();
            factorial.setText(resul);
            
        }else if (e.getSource() == regresar) {

            titulo.setVisible(true);
            Botonfactorial.setVisible(true);
            Botonfibonacci.setVisible(true);
            fibonacci.setVisible(false);
            lfibonacci.setVisible(false);
            numero1.setVisible(false);
            lnumero1.setVisible(false);
            regresar.setVisible(false);
            Resultadofibonacci.setVisible(false);
            factorial.setVisible(false);
            lfactorial.setVisible(false);
            numero2.setVisible(false);
            lnumero2.setVisible(false);
            Resultadofactorial.setVisible(false);
            numero2.setText("");
            numero1.setText("");
            fibonacci.setText("");
            factorial.setText("");
            
    }

}
}
