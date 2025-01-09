class SentenciaDoWhile {
    public static void main(String args[]) {
        int num = 0;

        //do while de toda la vida - Diferencia con el while es el orden de la sentencia, eso significa que si la condicion se deja de cumplir, se va a ejecutar el bloque al menos una vez
        //en while a secas, el bloque nunca se ejecutara
        do {
            System.out.println(num);
            num++;
        } while(num <= 100);

        System.out.println("Finalizado");
    }
}