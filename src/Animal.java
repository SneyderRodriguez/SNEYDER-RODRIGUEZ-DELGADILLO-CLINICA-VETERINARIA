public abstract class Animal {
    protected String nombreAnimal;
    protected int edadAnimal;
    protected String nombreDuenno;

    abstract double calcularCostoConsulta();

    public Animal(String nombreAnimal, int edadAnimal, String nombreDuenno) {
        this.nombreAnimal = nombreAnimal;
        this.edadAnimal = edadAnimal;
        this.nombreDuenno = nombreDuenno;
    }
    public String ficha() {
        return "Nombre mascota: " + nombreAnimal + " | Edad mascota: " + edadAnimal + " | Nombre duenno: " + nombreDuenno + " | Costo de la Consulta: " +  calcularCostoConsulta();
    }
}