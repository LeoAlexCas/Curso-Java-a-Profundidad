class SentenciaFor {
    public static void main(String args[]) {
        //Es el for de toda la vida
        int tabla = 2;
        for(int i = 0; i <= 10; i++) {
            //System.out.println(tabla + "x" + i + "=" + (tabla*i));

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

        System.out.println("=========================");

        //Existen 2 sentencias que sirven para modificar el comportamiento de un for en java continue y break
        //====continue: si se cumple una condicion o se llama continue antes de otra instruccion, se pasa a la siguiente iteracion sin realizar el resto de las instrucciones
        //====break: si se cumple una condicion o se llama break, se detienen todas las iteraciones posteriores
        for(int i = 0; i <= 10; i++) {
                if(i%2 == 0) {
                    //break;
                    continue;
                }
            System.out.println(String.format("%d x %d = %d", tabla, i, (tabla*i)));
        }

        System.out.println("=========================");

        //Se pueden anidar ciclos
        for(int j = 0; j <= 10; j++) {
            System.out.println("///////////////////////");
            for(int i = 0; i <= 10; i++) {
                System.out.println(String.format("%d x %d = %d", tabla, i, (tabla*i)));
            }
        }

        System.out.println("=========================");

        //Con ciclos anidados, se le pueden poner tags a los ciclos for como si fueran nombres de variables, entonces cuando se ejcute un break o continue puedes decir que tag estas deteniendo
        outer: for(int j = 0; j <= 10; j++) {
            System.out.println("///////////////////////");
            inner: for(int i = 0; i <= 10; i++) {
                if(i == 9) {
                    System.out.println("Breaking outer");
                    break outer;
                }
                System.out.println(String.format("%d x %d = %d", tabla, i, (tabla*i)));
            }
        }

        System.out.println("=========================");

        //Ejercicio con factorial
        for(int i = 2; i <= 5; i++) {
            System.out.println(String.format("Factorial de %d", i));
            int fact = 1;
            for(int j = 1; j <= i; j++) {
                fact *= j;
            }

            System.out.println(String.format("Resultado %d", fact)); 
        }


        System.out.println("=========================");
        //Ejercicio piramide
        String pyramid = "";
        String chara = "*";
        String oneEmpty = " ";
        
        for(int i = 1; i <= 5; i++) {
            pyramid = pyramid + chara;
            System.out.println(pyramid);
        }

        System.out.println("=========================");
        //Ejercicio piramide invertida
        String empty2 = "";
        String inverted2 = "";
        String pyramid2 = "";
        for(int i = 1; i <= 5; i++) {
            empty2 = "";
            for(int j = 4; j >= i; j--) {
                empty2 = empty2 + oneEmpty;
            }
            inverted2 = inverted2 + chara;
            pyramid2 = empty2 + inverted2;
            System.out.println(pyramid2);
        }
    }
}