/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;


/**
 * @author poo03alu24
 */
/*Codigo de la practica 10. Excepciones y errores

*/
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Cuenta.LimiteDepositoException, Cuenta.SaldoInsuficienteException, Cuenta.LimiteRetirosException {
        // TODO code application logic here
        System.out.println("Hola mundo");
        int a = 5;
        
            float c = (float) a/2;
            System.out.println(c);
                
            int[] b = new int [5];
            for (int i = 0; i < 5; i++) {
                    b[i]= i*10;
                    System.out.println(b[i]);
            }
            try{
                float d = 4/0;
                System.out.println(d);

                for (int i = 0; i <= 5; i++) {
                    System.out.println(b[i]);
                }
                
                }catch(ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Excepcion de desbordamiento de memoria");
                }catch(ArithmeticException ex) {
                System.out.println("Exepcion aritmetica permeada catch");
                }
                System.out.println("Hola he sobrevivido");
            
                float n = miMetodoDivision(100, 2);
                System.out.println(n);
                try {
                float m = miMetodoDivision(100, 0);
                System.out.println(m);
                }catch(ArithmeticException ex) {
                System.out.println("Exepcion aritmetica segundo catch");
                    System.out.println(ex.getStackTrace());  
                    ex.getStackTrace();       
                }
                System.out.println("A pesar de todo seguimos en el programa");
                float x = miMetodoDivision(20, 5);
                System.out.println(x);
                try {
                int w = suma(4,7);
                }catch (UnsupportedOperationException ex) {
                    System.out.println("Excepcion de operacion no soportada");
                    System.out.println("Atributo mensaje");
                    System.out.println(ex.getMessage());
                }
                System.out.println("##################");
                Cuenta cuenta = new Cuenta (100.0f);
                System.out.println(cuenta.consultarSaldo());
                cuenta.depositar(100);
                System.out.println(cuenta.consultarSaldo());
                cuenta.retirar(300);
                System.out.println(cuenta.cuenta);
         
    }
    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f/f0;  
    }
    private static int suma (int i, int i0) {
        throw new UnsupportedOperationException ("Operacion no soportada 1");
        
    }
}

