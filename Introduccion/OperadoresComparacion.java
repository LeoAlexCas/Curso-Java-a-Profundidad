class OperadoresComparacion {
    public static void main(String args[]) {
        double sueldo1 = 10000.5144;
        double sueldo2 = 450055.04534;

        //// Basicamente los mismos de JS excepto por el != de diferente
        System.out.println(sueldo1 > sueldo2); //false
        System.out.println(sueldo1 < sueldo2); //true
        System.out.println(sueldo1 >= sueldo2); //false
        System.out.println(sueldo1 <= sueldo2); //true
        System.out.println(sueldo1 != sueldo2); //true
        System.out.println(sueldo1 == sueldo2); //false
    }
}