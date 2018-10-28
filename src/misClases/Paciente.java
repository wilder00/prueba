package misClases;

import java.util.Random;

public class Paciente {
    private String numHC;
    private String nombre;
    private int edad;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.numHC="";
    }
     //getters
    public String getNumHC() {
        return numHC;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //reglas de negocio
    public void generarHistoriaClinica(){
        Random randito=new Random();        
        int num;
        
        do{
            num=randito.nextInt(999-100+1)+100;
        }while(num%2!=0);
        numHC="NHC-"+num;        
    }
    
    public String toString(){
        return "Numero Historia Clinica : "+numHC+
                "\nNombre Paciente : "+nombre+
                "\nEdad del Paciente : "+edad;
    }   
}
