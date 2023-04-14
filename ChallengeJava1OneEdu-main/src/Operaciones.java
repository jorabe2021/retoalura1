
public class Operaciones {

    private double valorIngresado;
    private int MonedaSinConvertir;
    private int MonedaConvertida;
    private double resultado;

    public Operaciones() {
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getValorIngresado() {
        return valorIngresado;
    }

    public void setValorIngresado(double valorIngresado) {
        this.valorIngresado = valorIngresado;
    }

    public int getMonedaSinConvertir() {
        return MonedaSinConvertir;
    }

    public void setMonedaSinConvertir(int MonedaSinConvertir) {
        this.MonedaSinConvertir = MonedaSinConvertir;
    }

    public int getMonedaConvertida() {
        return MonedaConvertida;
    }

    public void setMonedaConvertida(int MonedaConvertida) {
        this.MonedaConvertida = MonedaConvertida;
    }

    //metodos
    public double convertirDivisa() {
        if (this.MonedaSinConvertir == 0 && this.MonedaConvertida == 1) {//de dolares a euros
            resultado = Math.round((this.valorIngresado * 0.94) * 100.0) / 100.0;
        } else if (this.MonedaSinConvertir == 1 && this.MonedaConvertida == 0) {//de euros a dolares
            resultado = Math.round((this.valorIngresado / 0.94) * 100.0) / 100.0;
        } else if (this.MonedaSinConvertir == this.MonedaConvertida) {//cuando el usuario elije la misma moneda
            resultado = this.valorIngresado;
        } else if (this.MonedaSinConvertir == 0 && this.MonedaConvertida == 2) {//de dolares a pesos
            resultado = Math.round((this.valorIngresado * 202.54) * 100.0) / 100.0;
        } else if (this.MonedaSinConvertir == 2 && this.MonedaConvertida == 0) {//de pesos a dolares
            resultado = Math.round((this.valorIngresado / 202.54) * 100.0) / 100.0;
        } else if (this.MonedaSinConvertir == 1 && this.MonedaConvertida == 2) {//de euros a pesos
            resultado = Math.round((this.valorIngresado * 215.72) * 100.0) / 100.0;
        } else if (this.MonedaSinConvertir == 2 && this.MonedaConvertida == 1) {//de pesos a euros
            resultado = Math.round((this.valorIngresado / 215.72) * 100.0) / 100.0;
        }
        return resultado;
    }

}
