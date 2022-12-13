public class Profissional {
    public String nome;
    public double salarioMensal;

    private int diasUteis = 20;
    private double fhd = 8;

    public double horasUteisMes = diasUteis * fhd;

    public double CalculaValorHora() {
        return ((salarioMensal * 2) / horasUteisMes);
    }
}