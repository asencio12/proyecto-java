package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    public void procesarCalculo(String[] args) {
        // Validar 5 parámetros
        if (args.length != 5) {
            System.out.println("Error: Debe ingresa 5 parámetros siguiendo este modelo (meses, semanas, días, horas, minutos).");
            return;
        }

        int meses, semanas, dias, horas, minutos;

        try {
            // Validar parámetros sean enteros
            meses = Integer.parseInt(args[0]);
            semanas = Integer.parseInt(args[1]);
            dias = Integer.parseInt(args[2]);
            horas = Integer.parseInt(args[3]);
            minutos = Integer.parseInt(args[4]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Los parámetros deben ser números enteros válidos ingresa nuevamente otro parametro");
            return;
        }

        // Conversión para segundos (1 mes = 30 días, 1 semana = 7 días)
        long totalSegundos = (meses * 30L * 24 * 3600) +
                             (semanas * 7L * 24 * 3600) +
                             (dias * 24L * 3600) +
                             (horas * 3600L) +
                             (minutos * 60L);

        System.out.println("Exitoooo total segundos : " + totalSegundos);
    }
}