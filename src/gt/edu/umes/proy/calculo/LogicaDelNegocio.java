package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    // Valida y calcula. Lanza IllegalArgumentException si algo está mal.
    public long calcularSegundos(String[] args) {
        if (args == null || args.length != 5) {
            throw new IllegalArgumentException(
                "Debe ingresar 5 parámetros (meses, semanas, días, horas, minutos).");
        }

        int meses, semanas, dias, horas, minutos;
        try {
            meses = Integer.parseInt(args[0]);
            semanas = Integer.parseInt(args[1]);
            dias = Integer.parseInt(args[2]);
            horas = Integer.parseInt(args[3]);
            minutos = Integer.parseInt(args[4]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                "Los parámetros deben ser números enteros válidos.", e);
        }

        // 1 mes = 30 días, 1 semana = 7 días
        return (meses * 30L * 24 * 3600) +
               (semanas * 7L * 24 * 3600) +
               (dias * 24L * 3600) +
               (horas * 3600L) +
               (minutos * 60L);
    }

    // Lo que llama CalculaMinutos.main(): no cambia su comportamiento
    public void procesarCalculo(String[] args) {
        try {
            long total = calcularSegundos(args);
            System.out.println("Exitoooo total segundos : " + total);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}