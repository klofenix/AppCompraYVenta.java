import java.util.Arrays;
import java.util.Objects;

public class Usuario {
    protected String nombre;
    protected String apellido;
    protected String fechaNac;
    protected String provincia;
    protected Vehiculo miCoche;
    protected Vehiculo[] favoritos;

    /*Constructor*/
    public Usuario(){}
    public Usuario(String nombre, String apellido, String fechaNac, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.provincia = provincia;
        this.favoritos = new Vehiculo[3];
    }

    public Usuario(Usuario usuario) {
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.fechaNac = usuario.getFechaNac();
        this.provincia = usuario.getProvincia();
        this.miCoche = usuario.miCoche;
        this.favoritos = new Vehiculo[3];
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

    public Vehiculo getMiCoche() {
        return miCoche;
    }

    public void setMiCoche(Vehiculo miCoche) {
        this.miCoche = miCoche;
    }
    public Vehiculo[] getFavoritos() {
        return favoritos;
    }
    public void agregarCocheFavorito(Vehiculo vehiculo) {
        for (int i = 0; i < favoritos.length; i++) {
            if (favoritos[i] == null) {
                favoritos[i] = vehiculo;
                break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(getNombre(), usuario.getNombre()) && Objects.equals(getApellido(), usuario.getApellido()) && Objects.equals(getFechaNac(), usuario.getFechaNac()) && Objects.equals(getProvincia(), usuario.getProvincia()) && Objects.equals(getMiCoche(), usuario.getMiCoche()) && Arrays.equals(getFavoritos(), usuario.getFavoritos());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNombre(), getApellido(), getFechaNac(), getProvincia(), getMiCoche());
        result = 31 * result + Arrays.hashCode(getFavoritos());
        return result;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", provincia='" + provincia + '\'' +
                ", miCoche=" + miCoche +
                ", favoritos=" + Arrays.toString(favoritos) +
                '}';
    }
}
