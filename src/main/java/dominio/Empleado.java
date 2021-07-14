
package dominio;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
    private String nombre;
    private Fecha fechaN;
    private Fecha fechaI;
    
    public Empleado(String nombre, Fecha fechaN, Fecha fechaI) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.fechaI = fechaI;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaN() {
        return fechaN;
    }

    public Fecha getFechaI() {
        return fechaI;
    }
    
   
    public void calculoEdad (Fecha nFecha){
       
        Calendar fecha = new GregorianCalendar();
        
        int anioactual = fecha.get(Calendar.YEAR);
        int mesactual = fecha.get(Calendar.MONTH);
        int diaactual = fecha.get(Calendar.DAY_OF_MONTH);
        
        if(diaactual<nFecha.getDia()){
            diaactual = diaactual +30;
        }
        
        if(mesactual<nFecha.getMes()){
            mesactual = mesactual +12;
        }
        
        int aniocalculado = anioactual - nFecha.getAnio();
        int mescalculado = mesactual - nFecha.getMes();
        int diacalculado = diaactual - nFecha.getDia();
        
        System.out.println("Su edad es: "+aniocalculado+" años "+mescalculado+" meses "+diacalculado+" días");
       
    } 
    public void calculoTiempo (Fecha iFecha){
        Calendar fecha= new GregorianCalendar();
        
        int anioactual = fecha.get(Calendar.YEAR);
        int mesactual = fecha.get(Calendar.MONTH);
        int diaactual = fecha.get(Calendar.DAY_OF_MONTH);
        
        if(diaactual<iFecha.getDia()){
            diaactual = diaactual +30;
        }
        
        if(mesactual<iFecha.getMes()){
            mesactual = mesactual +12;
        }
    
        int aniocalculado = anioactual - iFecha.getAnio();
        int mescalculado = mesactual - iFecha.getMes();
        int diacalculado = diaactual - iFecha.getDia();
        System.out.println("Su tiempo en la empresa es: "+aniocalculado+" años "+mescalculado+" meses "+diacalculado+" días");
    }
    
    
    public void verDatos(){
        System.out.println("Nombre:" +this.nombre);
        System.out.println("Fecha de Nacimiento: "+fechaN.getAnio()+"/"+fechaN.getMes()+"/"+fechaN.getDia());
        calculoEdad(fechaN);
        System.out.println("Fecha de Ingreso: "+fechaI.getAnio()+"/"+fechaI.getMes()+"/"+fechaI.getDia());
        calculoTiempo(fechaI);
  
    }
    
//    @Override
//    public String toString(){
//        return "Nombre: "+this.nombre + "\n"+"Fecha Nacimiento: "+ this.fechaN +"\n"+ "Fecha Ingreso " +this.fechaI
//               ;
//    }
//    

     
}
