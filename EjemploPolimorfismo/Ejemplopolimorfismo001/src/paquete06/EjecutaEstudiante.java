
package paquete06;

import java.util.ArrayList;
import java.util.Scanner;
import paquete06.Estudiante;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner tcl = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        contador = 0;
        while(contador<4){
            // Se imprime mensaje en pantalla para solicitar
            // el tipo de estudiante que se desea ingresar
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = tcl.next();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = tcl.next();
            System.out.println("Ingrese el número de créditos");
            numeroCreds = tcl.nextInt();
            System.out.println("Ingrese el costo de cada créditos");
            costoCred = tcl.nextDouble();
            // se captura el valor ingresado por el usuario en 
            // la variable tipoEstudiante
            tipoEstudiante = tcl.nextInt();
            if (tipoEstudiante == 1) {
            
                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial(numeroCreds, costoCred, nombresEst, apellidosEst);
                estudianteP.establecerIdentificacionEstudiante("111");// Solicitar ingreso de valores para variables 
                estudianteP.establecerEdadEstudiante(19);
// Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objetoSystem.out.println("Ingrese los nombres del estudiante");
            
            
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial
                estudiantes.add(estudianteP);
                
            } else {
                // Si el usuario ingresa un número diferente del valor 1 para 
                // tipoEstudiante se procede a crear los procesos necesarios para 
                // crear un objeto de tipo EstudianteDistancia
                System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = tcl.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = tcl.nextDouble();
                    // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia(numeroAsigs, costoAsig, nombresEst, apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante("112");
                    estudianteD.establecerEdadEstudiante(19);
// Solicitar ingreso de valores para variables 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    
                    
                    // Se agrega al arreglo estudiantes un objeto de tipo
                    // EstudianteDistancia
                    estudiantes.add(estudianteD);
                    
                                                      
            }
            
            contador = contador + 1;
        }
        // inicio de solución
        
        
        
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}