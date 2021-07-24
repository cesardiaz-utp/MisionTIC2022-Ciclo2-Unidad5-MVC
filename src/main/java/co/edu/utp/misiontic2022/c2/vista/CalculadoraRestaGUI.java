package co.edu.utp.misiontic2022.c2.vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.utp.misiontic2022.c2.controlador.CalculadoraController;
import co.edu.utp.misiontic2022.c2.controlador.Operacion;

public class CalculadoraRestaGUI extends JFrame implements CalculadoraVista {

    private JTextField txtNumeroUno;
    private JTextField txtNumeroDos;
    private JTextField txtResultado;
    private JButton btnRestar;

    public CalculadoraRestaGUI() {
        initUI();
    }

    private void initUI() {
        setTitle("Aplicación MVC para Resta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        txtNumeroUno = new JTextField(10);
        txtNumeroDos = new JTextField(10);
        txtResultado = new JTextField(10);
        txtResultado.setEditable(false);
        btnRestar = new JButton("Restar");
        
        getContentPane().add(new JLabel("Numero 1:"));
        getContentPane().add(txtNumeroUno);
        getContentPane().add(new JLabel("Numero 2:"));
        getContentPane().add(txtNumeroDos);
        getContentPane().add(btnRestar);
        getContentPane().add(new JLabel("Resultado:"));
        getContentPane().add(txtResultado);

        setSize(500, 300);
        setLocationRelativeTo(null);
    }

    @Override
    public String getNumeroUno() {
        return txtNumeroUno.getText();
    }

    @Override
    public String getNumeroDos() {
        return txtNumeroDos.getText();
    }

    @Override
    public void setResultado(String resultado) {
        txtResultado.setText(resultado);
    }

    @Override
    public void iniciar(CalculadoraController controller) {
        controller.setOperacion(Operacion.RESTA);

        btnRestar.addActionListener(controller);

        setVisible(true);

    }

}
