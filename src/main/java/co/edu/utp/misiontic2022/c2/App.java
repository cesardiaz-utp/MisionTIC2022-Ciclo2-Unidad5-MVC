package co.edu.utp.misiontic2022.c2;

import co.edu.utp.misiontic2022.c2.controlador.CalculadoraController;
import co.edu.utp.misiontic2022.c2.modelo.CalculadoraModelo;
import co.edu.utp.misiontic2022.c2.vista.CalculadoraConsola;
import co.edu.utp.misiontic2022.c2.vista.CalculadoraRestaGUI;
import co.edu.utp.misiontic2022.c2.vista.CalculadoraSumaGUI;
import co.edu.utp.misiontic2022.c2.vista.CalculadoraVista;

/**
 * Hello world!
 *
 */
public class App {
    private enum TipoVista {
        CONSOLA, SUMA_GUI, RESTA_GUI
    }

    public static void main(String[] args) {
        var tipo = TipoVista.RESTA_GUI;

        CalculadoraVista view;
        switch (tipo) {
            case CONSOLA:
                view = new CalculadoraConsola();
                break;
                case SUMA_GUI:
                view = new CalculadoraSumaGUI();
                break;
                case RESTA_GUI:
                view = new CalculadoraRestaGUI();
                break;
            default:
                return;
        }

        var model = new CalculadoraModelo();
        var controller = new CalculadoraController(view, model);

        controller.iniciar();
    }
}
