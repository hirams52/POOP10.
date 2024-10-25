/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * La clase Cuenta representa una cuenta bancaria básica que permite
 * consultar el saldo, realizar depósitos y retiros, con límites establecidos.
 */
public class Cuenta {

    private float saldo;
    private int retirosRealizados;
    boolean cuenta;

    /**
     * Constructor que inicializa una cuenta con un saldo inicial.
     * 
     * @param saldoInicial el saldo inicial de la cuenta
     */
    public Cuenta(float saldoInicial) {
        this.saldo = saldoInicial;
        this.retirosRealizados = 0;  // Inicializamos contador de retiros
    }

    /**
     * Método para consultar el saldo actual de la cuenta.
     * 
     * @return el saldo actual de la cuenta
     */
    public float consultarSaldo() {
        return saldo;
    }

    /**
     * Método para depositar dinero en la cuenta.
     * Lanza una excepción si se intenta depositar más de $20,000.
     * 
     * @param cantidad la cantidad de dinero a depositar
     * @throws LimiteDepositoException si la cantidad supera los $20,000
     */
    public void depositar(float cantidad) throws LimiteDepositoException {
        if (cantidad > 20000) {
            throw new LimiteDepositoException();
        } else if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    /**
     * Método para retirar dinero de la cuenta.
     * Lanza excepciones si el saldo es insuficiente o si se excede el límite de retiros.
     * 
     * @param cantidad la cantidad de dinero a retirar
     * @throws SaldoInsuficienteException si el saldo es insuficiente
     * @throws LimiteRetirosException si se exceden los 3 retiros permitidos
     */
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteRetirosException {
        if (retirosRealizados >= 3) {
            throw new LimiteRetirosException();
        } else if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro.");
        } else {
            saldo -= cantidad;
            retirosRealizados++;
        }
    }

    /**
     * Excepción personalizada para indicar que el saldo es insuficiente.
     */
    public static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String message) {
            super(message);
        }
    }

    /**
     * Excepción personalizada para indicar que el depósito excede el límite permitido.
     */
    public static class LimiteDepositoException extends Exception {
        public LimiteDepositoException() {
            super("No se pueden depositar más de $20,000.");
        }
    }

    /**
     * Excepción personalizada para indicar que se ha alcanzado el límite de retiros permitidos.
     */
    public static class LimiteRetirosException extends Exception {
        public LimiteRetirosException() {
            super("Se ha alcanzado el límite de 3 retiros.");
        }
    }
}