public class Perro extends Animal {
    private String raza;

    public Perro(String nombreAnimal, int edadAnimal, String nombreDuenno, String raza) {
        super(nombreAnimal, edadAnimal, nombreDuenno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000.0 + (3000.0 * edadAnimal) ;
    }

    @Override
    public String ficha() {
        return super.ficha() + " | Raza: " + raza;
    }
}
