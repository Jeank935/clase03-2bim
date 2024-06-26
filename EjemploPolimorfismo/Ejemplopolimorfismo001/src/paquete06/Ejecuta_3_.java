package paquete06;

public class Ejecuta_3_ {
    public static void main(String[] args) {
        EstudianteDistancia e = new EstudianteDistancia(10, 100, "Jean", "Cuenca");
        e.establecerIdentificacionEstudiante("111");
        e.establecerEdadEstudiante(19);
        e.calcularMatricula();
        System.out.printf("%s\n",e );
    }
}
