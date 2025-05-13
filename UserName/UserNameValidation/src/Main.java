/* **********************************************************************
    Programa que valida un nombre de usuario.
    1- El nombre debe ser una cadena de entre 4 y 25 carácteres.
    2- Debe iniciar con una letra
    3- No debe terminar con _
    4.- El metodo CodelandUsernameValidation debe retornar true o false según las condiciones
**************************************************************************/
import java.util.*;
import java.io.*;

class Main {

    public static String CodelandUsernameValidation(String str) {
        // code goes here

        //Primero, se valida que la longitud de la cadena esté en el rango indicado
        //es decir entre 4 y 25 letras. Si se cumple esa condición continua con el programa
        //caso contrario termina con la ejecución del programa y retorna false

        if ((str.length()>4)&&(str.length()<=25))
        {
            //Ahora se emplea el uso de expresion regular para determinar que
            //cumple con las condiciones dadas

            String regex = "^[a-zA-Z][a-zA-Z0-9_]*[^_]$";

            if (str.matches(regex))
            {
                return "true";
            }
            else {
                return "false";
            }
        }
        else {
            return "false";
        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}