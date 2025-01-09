class SentenciaIf {
    public static void main(String args[]) {
        int edad = 22;

        ////If normal de toda la vida
        if(edad >= 19) {
            System.out.println("Ingresa");
        } else {
            System.out.println("No ingresa");
        }

        ////El operador ternario existe en java, pero no puede solo ejecutar instrucciones, si no que existe unicamente para asignar valores a variables:
        String mensaje = edad > 10 ? "mas de 10" : "No ingresa";
        System.out.println(mensaje);


        ////ElseIf tambien existe
        int edad2 = 16;
        boolean mayor = edad2 >= 18;
        
        if(mayor) {
            System.out.println("Ingresa2");
        } else if(edad2 <= 15) {
            System.out.println("Sapear2");
        } else {
            System.out.println("No ingresar2");
        }
    }
}