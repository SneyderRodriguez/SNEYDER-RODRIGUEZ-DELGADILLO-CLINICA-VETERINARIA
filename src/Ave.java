public class Ave extends Animal{
    private double peso;

    public Ave(String nombreAnimal, int edadAnimal, String nombreDuenno, double peso) {
        super(nombreAnimal, edadAnimal, nombreDuenno);
        this.peso = peso;
    }
    @Override
    public double calcularCostoConsulta() {
        return 28000.0 + (100 * peso);
    }

    @Override
    public String ficha() {
        return super.ficha() + " | Peso: " + peso;
    }
}