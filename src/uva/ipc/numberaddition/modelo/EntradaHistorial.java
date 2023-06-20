
package uva.ipc.numberaddition.modelo;

/**
 *
 * @author macoa
 */
public class EntradaHistorial {

    private double primerSumando;
    private double segundoSumando;
    
    public EntradaHistorial(double primerSumando,double segundoSumando){
        this.primerSumando=primerSumando;
        this.segundoSumando=segundoSumando;
    }

    public double getPrimerSumando() {
        return primerSumando;
    }

    public void setPrimerSumando(double primerSumando) {
        this.primerSumando = primerSumando;
    }

    public double getSegundoSumando() {
        return segundoSumando;
    }

    public void setSegundoSumando(double segundoSumando) {
        this.segundoSumando = segundoSumando;
    }

}
