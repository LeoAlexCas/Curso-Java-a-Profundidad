class Persona {
    //Atributos
    //Como las clases son templates para objetos, estos valores de los atributos se conoceran como el "Estado" del objeto
    String nombre;
    int edad;
    char genero;

    //En java el constructor de una clase lleva el mismo nombre que la clase misma, cuando no se declara se da uno por defecto sin logica de todas formas
    Persona() {
        System.out.print("El constructor");
    }

    //En java el constructor se puede declarar mas de una vez, pero al parecer solo se ejecuta el ultimo
    Persona(String name, int age, char gender) {
        nombre = name;
        edad = age;
        genero = gender;
    }

    //Metodos
    //En java los metodos se declaran con el tipo de la respuesta y su nombnre, en este caso void, porque no retorna nada
    void imprimirDatos() {
        System.out.println(String.format("Nombre: %s, Edad: %d, genero: %c", nombre, edad, genero));
    }

    //cuando se establecen parametros en un metodo, se especifica el tipo
    void playGames(Persona p) {
        System.out.println(String.format("%s, esta jugando con %s", nombre, p.nombre));
    }

    public static void main(String args[]) {
        Persona p = new Persona("ALEX", 32, 'M');
        // p.nombre = "ALEX";
        // p.edad = 32;
        // //Los strings siempre deben ir en "" y los char en '', aca no se tiene la libertad de js para esto
        // p.genero = 'M';

        p.imprimirDatos();

        Persona p1 = new Persona("JUAN", 34, 'M');
        // p1.nombre = "JUAN";
        // p1.edad = 34;
        // p1.genero = 'M';

        p1.imprimirDatos();

        p.playGames(p1);
    }
}