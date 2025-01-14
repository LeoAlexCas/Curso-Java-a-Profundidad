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

    //En java el constructor se puede declarar mas de una vez - JAVA sabe cuando un constructor esta siendo llamado y no el otro, esto gracias a que, se basa en los argumentos que se dan
    //Entonces si al crear el objetos se mandan los argumentos que estan en este, usara este, si no usara el otro
    Persona(String name, int age, char gender) {
        //Esta linea llama a this. O sea al contructor, como no le pasamos argumentos, esta llamando al constructor que no recibe parametros y por lo tanto se imprimira el log
        //Si se quiere llamar otro constructor dentro del constructor, debe ser en la primera linea de lo contrario dara error
        this();

        //Al parecer en java el uso de this es opcional a menos que haya alcances de nombres entre variables y se quiera especificar una
        this.nombre = name;
        this.edad = age;
        this.genero = gender;
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