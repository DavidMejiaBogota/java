package co.iniciandojava;

public class TiposDatos {
    public static void main(String[] args) {
        //1. Numéricos

            //1.1 Enteros
            byte variableUno = 10;          //Tamaño 8 bytes | valor mínimo -128 | valor máximo 127
            short variableDos = 5;          //Tamaño 16 bytes | valor mínimo -32768 | valor máximo 132767
            int variableTres = 555;         //Tamaño 32 bytes | valor mínimo -2147483648 | valor máximo 2147483647
            long variableCuatro = 125698;   //Tamaño 64 bytes | valor mínimo -9223372036854775808 | valor máximo 9223372036854775807

            //1.2 Decimales
            float variableCinco = 5.5f;     //Tamaño 32 bytes | valor mínimo -3.402823e38 | valor máximo 3.402823e38
            double variableSeis = 101.55d; //Tamaño 64 bytes | valor mínimo -1.79769313486232e308 | valor máximo 1.79769313486232e308

        //2. Booleanos
        boolean variableSiete = false; //Tamaño 2 bytes | permite dos valores falso/0 o verdadero/1
        boolean variableOcho = true; //Tamaño 2 bytes | permite dos valores falso/0 o verdadero/1

        //3. Texto
            //3.1 char
            char variableNueve = 'a'; //Tamaño 1 byte
            //3.2 string
            String variableDiez = "Esto es todo un String"; //Se escribe en mayúscula porque es una clase y tods los anteriors son tipos de dato primitivos.




    }
}
