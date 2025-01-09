class Tipos {
    public static void main(String args[]){
        //Los tipos de datos distinguen el tipo, pero tambien estan asignados por la cantidad de bytes que usan, por lo que distintos tipos solo aguantaran una cierta cantidad de caracteres
        //Los valores que se asignan a variables se llamaran LITERALES, estas tienen asignados tipos de valor por defecto (por ejemplo los decimales son double)

        ////// Int para variables numeros enteros
        ///// Los nombres de variables tienen su propio nombre: identificador estos tienen ciertas reglas
        int edad = 18;
        System.out.println("Edad: " + edad);
        edad = 19;
        System.out.println("Edad: " + edad);
        ////// final con el tipo de variable para establecer constantes
        final int edad2 = 20;

        //// boolean para booleans
        boolean verdad = true;

        //// float
        float income = 100000.015f;

        //// double - Decimales?
        double superficie = 1000000000.12134;

        //// byte
        byte size = 50;

        //// long
        //// NOTA IMPORTANTE: como las literales tienen tipos asignados, si hay un error en compilacion porque por ejemplo en long el numero es muy grande o en float aparece que la conversion es lossy, se debe agregar una letra al final
        //// Esta lo que hace es anunciar que aunque el tipo del literal es uno nosotros lo estamos asignando a otro tipo que si lo acepta - long y float usan esta regla L y f
        long distanciaGrande = 5947894939L;

        //// short
        short mtcuadrados = 1231;

    }
}