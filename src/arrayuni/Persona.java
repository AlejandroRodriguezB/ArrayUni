package arrayuni;


public class Persona {

    String name;
    private String surname;
    private int age;
    //guarda para todos 
    private static int contadorPersona=0;
    
    //constructor
    public Persona(){
    name="Contigo";
    surname="Pipo";
    age=69;
    contadorPersona++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
            
    public Persona(String nombre, String surname ,int age){
        //si la var  y el atributo son diferentes funciona normal pero no es lo recomedable
        name =nombre;
        //si la var  y el atributo son iguales tienes que poner this.XXX delante
        this.surname=surname;
        this.age=age;
        contadorPersona++;
    }
    public Persona(String nombre, String surname){
        //para una persona que acaba de nacer por ejemplo
        name =nombre;
        this.surname=surname;
        age=0;
        contadorPersona++;
    }
    public String datos(){
        return (name +" " + surname+" "+ age);
    }
    public static int numePersonasCreadas(){
    return contadorPersona;
    }
    //operacion para solo nombre y apellido
    public String nomAppll(){
        return name + surname;
    }
            
}
