package miPrograma.principal;
import java.util.Scanner;
import javax.swing.JOptionPane;
import miGestion.GestionarConsultas;
import misClases.Cita;
import misClases.Paciente;

public class UnDiaEnConsulta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        String nomb,espec;
        int edad;
        Paciente refP=null;
        Cita refC=null;
        GestionarConsultas objG=new GestionarConsultas();
        String menu="\n\t\tMENU"
                + "\n<1> Agregar Pacientes"
                + "\n<2> Listado ordenado de pacientes por edad"
                + "\n<3> Paciente con mayor precio consulta"
                + "\n<4> Salir"
                + "\nOpcion : ";
        do{
            System.out.print(menu);
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    sc.nextLine();  //limpiar buffer
                    System.out.print("\nIngrese nombre del paciente ");
                    nomb=sc.nextLine();
                    System.out.print("\ningrese edad : ");
                    edad=sc.nextInt();
                    refP=new Paciente(nomb, edad);
                    refP.generarHistoriaClinica();
                    System.out.print("\nIngresar especialidad : ");
                    sc.nextLine();
                    espec=sc.nextLine();
                    refC=new Cita(espec, refP);
                    refC.asignarPrecio();
                    objG.agregarCitas(refC);
                    break;
                case 2:                    
                    System.out.println("\nListado original:"+objG.toString());                    
                    objG.ordenarXEdad();
                    System.out.println("\n\nListado ordenado por Edad");
                    System.out.println(objG.toString());
                    break;
                case 3:
                    System.out.println(objG.mayorPrecioConsulta().toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    break;
                default:    
                    JOptionPane.showMessageDialog(null, "ERROR... opcion incorrecta");            
            }           
        }while(opcion!=4);
        




    }
    
}
