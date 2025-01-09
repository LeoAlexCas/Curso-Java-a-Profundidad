class SentenciaWhile {
    public static void main(String args[]) {
        //While de toda la vida
        int num = 0;
        while(num < 100) {
            System.out.println(num);
            num++;
        }

        System.out.println("Finalizado");

        while(num < 100) System.out.println(num++); //Manera de ejecutar en una sola linea, sin brackets
    }
}