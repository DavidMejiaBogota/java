package co.iniciandojava;

public class Operadores {
    public static void main(String[] args) {

        //Operadores Aritméticos
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 7;

        int suma = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + suma);

        int resta = numero2 - numero1;
        System.out.println("El resultado de la resta es: " + resta);

        int negacion = -7;
        System.out.println("El resultado de la negación es: " + negacion);

        int multiplicacion = numero1 * numero2;
        System.out.println("El resultado de la multiplicaicón es: " + multiplicacion);

        //int potenciacion = numero1 ** numero2;
        //System.out.println("El resultado de la potenciación es: " + potenciacion);

        int division = numero2 / numero3;
        System.out.println("El resultado de la división es: " + division);

        //int divisionEntera = numero2 // numero1;
        //System.out.println("El resultado de la división entera es: " + divisionEntera);

        int modulo1 = numero2 / numero1;
        System.out.println("El resultado de modulo 1 es: " + modulo1);

        int modulo2 = numero2 / numero3;
        System.out.println("El resultado de modulo 2 es: " + modulo2);

        //Operadores de comparación

        //> mayor que
        boolean mayorQue = suma > resta;
        System.out.println("El resultado de la suma: "+ suma + ", es mayor al resultado de la resta: "+resta+" "+mayorQue);
        boolean mayorQue2 = resta > suma;
        System.out.println("El resultado de la suma: "+ suma + ", es mayor al resultado de la resta: "+resta+" "+mayorQue2);

        //< menor que
        boolean menorQue = resta < suma;
        System.out.println("El resultado de la resta: "+resta+", es menor al resultado de la suma: "+suma+" "+menorQue);
        boolean menorQue2 = suma < resta;
        System.out.println("El resultado de la resta: "+resta+", es menor al resultado de la suma: "+suma+" "+menorQue2);

        //>= mayor igual que
        boolean mayorIgualQue1 = suma >= resta;
        System.out.println("¿El resultado de la suma; "+suma+", es mayor o igual que el resutaldo de la resta: "+resta+"?, "+mayorIgualQue1);
        boolean mayorIgualQue2 = resta >= suma;
        System.out.println("¿El resultado de la resta: "+resta+", es mayor o igual que el resultado de la suma: "+suma+"?,"+mayorIgualQue2);

        //<= menor igual que
        boolean menorIgualQue = division <= multiplicacion;
        System.out.println("¿El resultado de la división: "+division+", es menor o igual que el resultado de la multipliación: "+multiplicacion+"?, "+menorIgualQue);
        boolean menorIgualQue2 = multiplicacion <= division;
        System.out.println("¿El resultado de la multipliación: "+multiplicacion+", es menor o igual que el resultado de la división: "+division+"?, "+menorIgualQue2);
        //== igual que
        boolean esIgualQue = menorIgualQue == menorQue;
        System.out.println("¿El resultado de la variable menorIgualQue: "+menorIgualQue+", es igual al resultado de la variable menorQue: "+menorQue+"?, "+esIgualQue);
        boolean esIgualQue2 = menorIgualQue == menorIgualQue2;
        System.out.println("¿el valor de la variable menorIgualQue: "+menorIgualQue+", es igual al valor de la variable menorIgualQue2: "+menorIgualQue2+"?, "+esIgualQue2);

        //!= no es igual que
        boolean noEsIgual = menorIgualQue != menorIgualQue2;
        System.out.println("¿La variable menorIgualQue: "+menorIgualQue+", es diferente de la variable menorIgualQue2: "+menorIgualQue2+"?, "+noEsIgual);
        boolean noEsIgual2 = menorIgualQue != menorQue;
        System.out.println("¿La variable menorIgualQue:"+menorIgualQue+", no es igual que la variable menorQue: "+menorQue+"?, "+noEsIgual2);

        //Operadores Lógicos:
        //and &&
        int edad = 17;
        int edad2 = 14;
        boolean carnetJoven = edad >= 15 && edad <=26;
        System.out.println("¿La variable edad: "+edad+ ", está en el rango para obtener el carnet de joven? "+carnetJoven);
        boolean carnetJoven2 = edad2 >= 15 && edad2 <=26;
        System.out.println("¿La variable edad: "+edad+ ", está en el rango para obtener el carnet de joven? "+carnetJoven2);
        //or ||
        boolean or = numero1 == numero2 || numero3 == numero1 || numero2 == numero3;
        System.out.println("¿Alguna de las variables numero1: "+numero1+",  numero2: "+numero2+" y numero3: "+numero3+" son iguales entre si? "+or);
        //not !
        boolean condicion = true;
        boolean resultado = !condicion;
        System.out.println("Condicion original: "+condicion);
        System.out.println("Resultado después de negar la condición: "+resultado);
    }
}
