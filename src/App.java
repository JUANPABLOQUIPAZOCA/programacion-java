import org.jcp.xml.dsig.internal.SignerOutputStream;

public class App {

    private String nombre;
    private int edad;
    private char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;
    


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //tipo de datos y operadores
        String res = "hola";
        int resultado= 15 + 32;
        int resultado1 = 125 - 58;
        double resultado2 = 568 / 6;
        float resultado3 = 58 * 21;
        int resultado4 = 21 % 9 ;

        //operadores unarios
        resultado++; // resultado = resultado + 1
        resultado--; // resultado = resultado - 1
        resultado= -resultado; //valor negativo
        resultado= +resultado; // valor absoluto

        //operadores logicos
        boolean respuesta = true;
        respuesta = 5 < 8; // operador menor que
        respuesta = 5 > 8; // operador mayor que
        respuesta = 5 >= 8; // operador mayoro igual que
        respuesta = 5 <= 8; // operador menor o igual que
        respuesta = 5 != 8; // operador diferente o negar que 
        respuesta = 5 == 8; // operador si es igual que
        respuesta = 12 < 5 && 4 > 1; // operador unir o y en la condicion
        respuesta = 14 < 25 || 1 > 5; // operador or 

        // operadores bit a bit
        // & = funciona como el and en bit a bit
        // ^ = funciona para sacar la potencia , y para comparar 2 expresiones logicas

        // estructuras de control
        if (respuesta) {
            // bloque de codigo
        }
        if (respuesta) {
            // bloque de codigo si se cumple
        } else if(respuesta) {
            // bloque de codigo si no se cumple
        }

    }
}
