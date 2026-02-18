package cuentas;
/**
 * Clase CCuenta
 * Representa una cuenta bancaria.
 * Permite ingresar, retirar y consultar saldo.
 * @author Alvaro
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Devuelve el saldo actual de la cuenta
 * @return saldo disponible
 */

    public double estado()
    {
        return saldo;
    }
/**
 * Ingresa dinero en la cuenta
 * @param cantidad importe a ingresar
 * @throws Exception si la cantidad es negativa
 */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Retira dinero de la cuenta
 * @param cantidad importe a retirar
 * @throws Exception si no hay saldo suficiente
 */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
