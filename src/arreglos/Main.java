/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       try{ 
       int opcion =10;
        Scanner leer = new Scanner(System.in);
        Carrera tics = new Carrera("tics", 10);
       while(opcion != 0){
           System.out.println("------Carrera TICS------");
           System.out.println("Ingresa una opcion");
           System.out.println("1 para crear un grupo");
           System.out.println("2 para acceder a un grupo");
           System.out.println("3 promedio carrera");
           System.out.println("0 para salir");
           opcion= leer.nextInt();
           if(opcion==1){
               System.out.println("Ingresa el numero de alumnos y nombre ");
               int noAlumnos= leer.nextInt();
               String nombre = leer.next();
               tics.crearNuevoGrupo(noAlumnos, nombre);
           }else if(opcion==2){
               System.out.println("Ingresa el nombre del grupo");
                String nombre = leer.next();
                Grupo g= tics.obtenerGrupo(nombre);
                int opcion2=10;
                if(g==null){
                    System.out.println("No existe el grupo");
                }else{
                    while(opcion2 != 0){
                        System.out.println("------"+g.getNombre()+"------");
                        System.out.println("1 para agregar alumnos");
                        System.out.println("2 para acceder a alumno");
                        System.out.println("3 promedio grupo");
                        System.out.println("4 lista grupo");
                        System.out.println("5 cargar materias al grupo");
                        System.out.println("6 Reporte info alumnos");
                        System.out.println("7 Reporte info profesores");
                        
                        System.out.println("0 salir");
                        opcion2= leer.nextInt();
                        if(opcion2==1){
                            System.out.println("Ingresa matricula");
                            int matricula= leer.nextInt();
                            System.out.println("Ingresa nombre");
                            String nom= leer.next();
                            System.out.println("Ingresa apellido paterno");
                            String paterno= leer.next();
                            System.out.println("Ingresa apellido materno");
                            String materno= leer.next();
                            System.out.println("Ingresa sexo");
                            String sexo= leer.next();
                            System.out.println("Ingresa fecha de nacimiento");
                            String f= leer.next();
                            Date fecha = new Date(f);
                            g.agregarAlumno(matricula,g.getNombre(),"TICS", 
                                    nom, paterno, materno, sexo, fecha);
                        }else if(opcion2==3){
                            System.out.println(g.promedio());
                        }else if(opcion2==4){
                            System.out.println("-----Lista Alumnos "+g.getNombre()+"------");
                            System.out.println(g.listaAlumnos());
                        }else if(opcion2==5){
                            System.out.println("Ingresa las 5 materias");
                            String m1= leer.next();
                            String m2= leer.next();
                            String m3= leer.next();
                            String m4= leer.next();
                            String m5= leer.next();
                            g.cargarMaterias(m1, m2, m3, m4, m5);
                        }else if (opcion2==7){
                            System.out.println(g.reporteInfoProfesores());
                        }else if (opcion2==6){
                            System.out.println(g.reporteInfoAlumnos());
                        }
                    }
                }
           }else if(opcion==3){
               System.out.println(tics.obtenerPromedioCarrera());
           }
       }
    }catch(java.util.InputMismatchException e){
           System.out.println("Error al ingresar un dato verifica tus campos");
           
    }catch(Exception e){
           System.out.println("error desconocido"+ e);
    }finally{
           System.out.println("Programa Terminado");
       }
    }
}
