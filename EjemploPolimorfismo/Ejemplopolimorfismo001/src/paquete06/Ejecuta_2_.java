package paquete06;

public class Ejecuta_2_ {
    public static void main(String[] args) {
        EstudianteDistancia e = new EstudianteDistancia("Jean", "Cuenca");
        e.establecerIdentificacionEstudiante("111");
        e.establecerEdadEstudiante(19);
        e.establecerNumeroAsginaturas(10);
        e.establecerCostoAsignatura(100);
        e.calcularMatricula();
        System.out.printf("%s\n",e );
    }
}
