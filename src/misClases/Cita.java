package misClases;

public class Cita {
    private String especialidad;
    private Paciente refP;
    private float precioC;

    public Cita(String especialidad, Paciente refP) {
        this.especialidad = especialidad;
        this.refP = refP;
        this.precioC=0.0f;
    }
    
    //getters
    public String getEspecialidad() {
        return especialidad;
    }
    public Paciente getRefP() {
        return refP;
    }
    public float getPrecioC() {
        return precioC;
    }
    
    //setters
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setRefP(Paciente refP) {
        this.refP = refP;
    }
    
    //reglas de negocio
    public void asignarPrecio(){        
        if(especialidad.equalsIgnoreCase("Reumatologia")){
            precioC=35.0f;
        }else if(especialidad.equalsIgnoreCase("Ginecologia")){
            precioC=40.0f;
        }else{
            precioC=38.5F;
        }        
    }
    
    public String toString(){
        return "\n Especialidad : "+especialidad+
                "\n"+refP.toString()+
                "\nPrecio Consulta : "+precioC;
    }
    
    
    
}