class Operadores {
    public static void main(String args[]) {
        //Operadores aritmeticos
        ////Suma
        int suma = 10 + 20;
        System.out.println(suma); //30

        ////Resta
        int resta = 30 - 20;
        System.out.println(resta); //10

        ////Multiplicacion
        int multi = 30 * 2;
        System.out.println(multi); //60

        ////Division
        int div = 6/2;
        System.out.println(div); //3

        ////Modulo
        int modulo = 20%10;
        System.out.println(modulo); //0

        ////Incremento (+1)
        int count = 0;
        count++;
        System.out.println(count); //1

        ////Decremento (-1)
        int discount = 20;
        discount--;
        System.out.println(discount); //19

        ////PreIncremento 
        //Esto soluciona un tema de java donde al realizar un incremento primero se revisa la variable y luego se incrementa, Esto significa que si hay un comando como print con un ++,
        //Se impimira el valor sin incremetar porque primero se imprime el valor y luego se evalua el resultado
        //EJ:
        int preCount = 2;
        preCount++;
        System.out.println(preCount++); //3 - Aunque ya sea 3 y este ++ deberia dar 4, se imprime el valor que es 3 y despues se agrega 1
        System.out.println(preCount); //4 - Aca ya se agrego el incremento anterior

        System.out.println(++preCount); //5 - Aca primero se incermenta el valor y luego se imprime

        ////Decremento
        //Lo mismo pero al reves
        int decrement = 10;
        System.out.println(--decrement); //9

        //Incrementos y decrementos abreviados - Igual que en JS - Igual que en JS funciona con los operadores aritmeticos en general
        int numberMas = 10;
        numberMas += 5;
        System.out.println(numberMas); //15

        int numberMenos = 10;
        numberMenos -= 5;
        System.out.println(numberMenos); //5
    }
}