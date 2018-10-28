package miGestion;

import javax.swing.JOptionPane;
import misClases.Cita;
import misClases.Paciente;

public class GestionarConsultas {
    private Cita []arCitas;
    private int nC;
    
    private static final int TAM=50;

    public GestionarConsultas() {
        arCitas=new Cita[TAM];
        nC=0;
    }

    public Cita[] getArCitas() {
        return arCitas;
    }
    public int getnC() {
        return nC;
    }
    public static int getTAM() {
        return TAM;
    }
    
    //reglas de negocio
    public void agregarCitas(Cita objC){        
        //verificar espacio disponible
        if(nC<TAM){
            arCitas[nC++]=objC;
        }else{
            JOptionPane.showMessageDialog(null, "Arreglo Lleno.");
        }      
    }
    
    public void ordenarXEdad(){
        Cita temp;        
        for (int i = 0; i < nC-1; i++) {
            for (int j = 0; j < nC-i-1; j++) {
                if(arCitas[j].getRefP().getEdad()>arCitas[j+1].getRefP().getEdad()){
                    temp=arCitas[j];
                    arCitas[j]=arCitas[j+1];
                    arCitas[j+1]=temp;
                }
            }            
        }
    }
    
    public String toString(){
        String cad="";
        
        for (int i = 0; i < nC; i++) {
            cad=cad+arCitas[i].toString();
        }       
        return cad;
    }   

    // ejercicio retornar la referencia paciente, cuyo precio consulta
    // sea la mayor
    public Paciente mayorPrecioConsulta(){
        Paciente refP=null;
        float mayorP=0;
        for (int i = 0; i < nC; i++) {
            if(arCitas[i].getPrecioC()>mayorP){
                mayorP=arCitas[i].getPrecioC();
                refP=arCitas[i].getRefP();               
            }
        }      
        return refP;
    }
    
    
}
