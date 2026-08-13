public class Gato extends Animal{
    private boolean esEsterilizado;

    public Gato(String nombreAnimal, int edadAnimal, String nombreDuenno, boolean esEsterilizado) {
        super(nombreAnimal, edadAnimal, nombreDuenno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000.0;
    }

    @Override
    public String ficha() {
        return super.ficha() + " | Esterilizado: " + esEsterilizado;
    }
}
