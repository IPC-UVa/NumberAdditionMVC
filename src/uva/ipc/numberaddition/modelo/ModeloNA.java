/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uva.ipc.numberaddition.modelo;

import java.util.ArrayList;

/**
 *
 * @author mcorrales
 */
public class ModeloNA {

    private ArrayList<EntradaHistorial> historial;
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void suma(double sumando1, double sumando2) {
        this.resultado = sumando1 + sumando2;
    }

    public ModeloNA() {
        historial = new ArrayList<>();
    }

    public ArrayList<EntradaHistorial> getHistorial() {
        return this.historial;
    }

    public void addEntradaHistorial(EntradaHistorial entrada) {
        this.historial.add(entrada);
    }

}
