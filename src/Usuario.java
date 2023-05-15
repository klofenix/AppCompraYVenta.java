import java.util.Objects;

public class Usuario {
    protected String nombre;
    protected String apellido;
    protected String fechaNac;
    protected String provincia;

    /*Constructor*/
    public Usuario(){}
    public Usuario(String nombre, String apellido, String fechaNac, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.provincia = provincia;
    }
    public Usuario(Usuario usuario) {
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.fechaNac = usuario.getFechaNac();
        this.provincia = usuario.getProvincia();
    }
    /*getters y setters*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) &&
                Objects.equals(apellido, usuario.apellido) &&
                Objects.equals(fechaNac, usuario.fechaNac) &&
                Objects.equals(provincia, usuario.provincia);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, fechaNac, provincia);
    }
    

}
