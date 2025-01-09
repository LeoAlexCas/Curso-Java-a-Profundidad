class SentenciaSwitch {
    public static void main(String args[]) {
        int opcion = 0;

        //Mismo switch de toda la vida, para reemplazar miles de if o else if
        //Al igual que en js si falta un break va a compilar, se continua ejecutando el switch desde el case que corresponda, pero todo lo que este abajo se ejecutara se cumpla o no la condicion hasta que encuentre un break
        //Importante nunca perder los breaks a menos que sea intencional y necesario
        switch(opcion) {
            case 0:
                System.out.print("es 0");
                break;
            case 1:
                System.out.print("es 1");
                break;
            case 2:
                System.out.print("es 2");
                break;
            default:
                System.out.print("No es ninguno");
                break;
        }

        //Esta es la manera para ejcutar el mismo codigo en casos que la condicion del switch sea diferente
        switch(opcion) {
            case 0:
            case 1:
            case 2:
                System.out.print("es 0 1 o 2");
                break;
            default:
                System.out.print("No es ninguno");
                break;
        }

        /////////////////////////////////////////
        //Obviamente se puede usar con strings desde 1.7 java
        String opcionString = "uno";
                switch(opcionString) {
            case "cero":
                System.out.print("es cero");
                break;
            case "uno":
                System.out.print("es uno");
                break;
            case "dos":
                System.out.print("es dos");
                break;
            default:
                System.out.print("No es ninguno");
                break;
        }
    }
}