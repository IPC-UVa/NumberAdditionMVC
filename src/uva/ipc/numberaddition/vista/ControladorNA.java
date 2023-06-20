package uva.ipc.numberaddition.vista;

import uva.ipc.numberaddition.modelo.EntradaHistorial;
import uva.ipc.numberaddition.modelo.ModeloNA;

/**
 *
 * @author macoa
 */
public class ControladorNA {

    private VistaNA miVista;
    private ModeloNA miModelo;
    

    public ControladorNA(VistaNA vista) {
        this.miVista = vista;
        this.miModelo = new ModeloNA();
    }

    public void procesaEventoSumar() {
        double num1, num2;

        try {
            num1 = Double.parseDouble(this.miVista.getPrimerNumero());
        } catch (NumberFormatException e) {
            this.miVista.mostrarMensajeError("El primer número debe ser un número decimal");
            return;
        }
        try {
            num2 = Double.parseDouble(this.miVista.getSegundoNumero());
        } catch (NumberFormatException e) {
            this.miVista.mostrarMensajeError("El segundo número debe ser un número decimal");
            return;
        }
        this.miModelo.suma(num1, num2);
        this.miVista.mostrarResultado(this.miModelo.getResultado());
        EntradaHistorial entradaHistorial = new EntradaHistorial(num1, num2);
        this.miModelo.addEntradaHistorial(entradaHistorial);
        this.miVista.actualizarHistorial(this.miModelo.getHistorial());
        this.miVista.mostrarMensajeError("");
    }

    public void procesaEventoLimpiar() {
        this.miVista.limpiarCamposTexto();
        this.miVista.mostrarMensajeError("");
    }

    public void procesaEventoSalir() {
        System.exit(0);
    }
}
