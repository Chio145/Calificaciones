package RocioAguirre;

import java.util.Scanner;

public class Calificaciones {
    Scanner datos = new Scanner (System.in);
    int cal[]= new int[5];
    int suma=0;
    float promedio=5;
    String name;
    public void prom(){
        System.out.println("Introduzca nombre del alumno:");
        name= datos.nextLine();

        System.out.println("1er calificacion:");
        cal[0]=datos.nextInt();

        System.out.println("2da calificacion:");
        cal[1]=datos.nextInt();

        System.out.println("3era calificacion:");
        cal[2]=datos.nextInt();

        System.out.println("4ta calificacion:");
        cal[3]=datos.nextInt();

        System.out.println("5ta calificacion:");
        cal[4]=datos.nextInt();

        for (int i=0; i< cal.length; i++) {
            suma += cal[i];
            promedio=(suma/ cal.length);
        }
    }
    public String calif(){
        if(promedio<=50){
            System.out.println("Calificación: F");
        }
        if (promedio>=51 && promedio<= 60){
            System.out.println("Calificación: E");
        }
        if (promedio>=61 && promedio<= 70){
            System.out.println("Calificación: D");
        }
        if (promedio>=71 && promedio<= 80){
            System.out.println("Calificación: C");
        }
        if (promedio>=81 && promedio<= 90){
            System.out.println("Calificación: B");
        }
        if (promedio>=91 && promedio<= 100){
            System.out.println("Calificación: A");
        }
        return " ";
    }
    public void imp(){
        System.out.println("Nombre del estudiante: "+ name);
        System.out.println("Calificacion 1: "+ cal[0] );
        System.out.println("Calificacion 2: "+ cal[1]);
        System.out.println("Calificacion 3: "+ cal[2]);
        System.out.println("Calificacion 4: "+ cal[3]);
        System.out.println("Calificacion 5: "+ cal[4]);
        System.out.println("Promedio: "+ promedio);
        System.out.println(calif());
    }
}
