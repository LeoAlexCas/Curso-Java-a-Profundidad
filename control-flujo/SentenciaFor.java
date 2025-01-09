class SentenciaFor {
    public static void main(String args[]) {
        //Es el for de toda la vida
        int tabla = 2;
        for(int i = 0; i <= 10; i++) {
            System.out.println(tabla + "x" + i + "=" + (tabla*i));

            //Esto no es del curso, pero existe una manera de hacer algo parecido a un template literal que es usar la el metodo de clase String.format,
            //Se establecen identificadores de variables con los strings, el string principal es el primer argument y los demas son las variables
            //Los identificadores de variables dependen del tipo de variable que se usara:
            /* Por eje:
                %s: Representa una cadena de texto (String).
                %d: Representa un número entero (int).
                %.2f: Representa un número de punto flotante (float o double) con dos decimales.
            */
           //Esto es de java 1.8 porque de java 13 en adelante hay una manera mas sencilla de hacerlo
            System.out.println(String.format("%d x %d = %d", tabla, i, (tabla*i)));
        }
    }
}