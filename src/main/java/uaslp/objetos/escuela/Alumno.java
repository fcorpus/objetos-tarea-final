package uaslp.objetos.escuela;


import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    public Alumno(){}
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public String getClave(){
        return clave;
    }
    public String getClaveDeCarrera(){
        return claveDeCarrera;
    }
    public int getAnioDeIngreso(){
        return anioDeIngreso;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private Alumno alumno;

        private Builder(){
            alumno = new Alumno();
        }
        public Builder nombre(String nombre){
            alumno.nombre = nombre;
            return this;
        }
        public Builder clave(String clave){
            alumno.clave = clave;
            return this;
        }
        public Builder claveDeCarrera(String claveDeCarrera){
            alumno.claveDeCarrera = claveDeCarrera;
            return this;
        }
        public Builder anioDeIngreso(int anioDeIngreso){
            alumno.anioDeIngreso = anioDeIngreso;
            return this;
        }
        public Builder fechaNacimiento(LocalDate fechaNacimiento){
            alumno.fechaNacimiento = fechaNacimiento;
            return this;
        }
        public Alumno build(){
            return alumno;
        }
    }
}
