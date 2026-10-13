package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

    public void procesarCalculo(String[] args) {
        // Validar que se ingresen exactamente 5 parámetros
        if (args.length != 5) {
            System.out.println("Error: Debe ingresar exactamente 5 parámetros (meses, semanas, días, horas, minutos).");
            return;
        }

        int meses, semanas, dias, horas, minutos;

        try {
            // Validar que todos los parámetros sean enteros
            meses = Integer.parseInt(args[0]);
            semanas = Integer.parseInt(args[1]);
            dias = Integer.parseInt(args[2]);
            horas = Integer.parseInt(args[3]);
            minutos = Integer.parseInt(args[4]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Todos los parámetros deben ser números enteros válidos.");
            return;
        }

        // Conversión a segundos (1 mes = 30 días, 1 semana = 7 días)
        long totalSegundos = (meses * 30L * 24 * 3600) +
                             (semanas * 7L * 24 * 3600) +
                             (dias * 24L * 3600) +
                             (horas * 3600L) +
                             (minutos * 60L);

        System.out.println("Total en segundos: " + totalSegundos);
    }
}